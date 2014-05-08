/*
 * Copyright (c) 2014 TIKINOU LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tikinou.schedulesdirect.core;

import com.tikinou.schedulesdirect.core.commands.AuthenticatedBaseCommandParameter;
import com.tikinou.schedulesdirect.core.commands.BaseCommandParameter;
import com.tikinou.schedulesdirect.core.commands.token.TokenCommand;
import com.tikinou.schedulesdirect.core.commands.token.TokenParameters;
import com.tikinou.schedulesdirect.core.domain.CommandStatus;
import com.tikinou.schedulesdirect.core.domain.Credentials;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;
import com.tikinou.schedulesdirect.core.exceptions.AuthenticationException;
import com.tikinou.schedulesdirect.core.exceptions.VersionNotSupportedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sebastien Astie
 */
public abstract class AbstractSchedulesDirectClient implements SchedulesDirectClient {
    private final static String DEFAUlT_BASE_URL = "https://data2.schedulesdirect.org/";
    private final static String DEFAUlT_BETA_BASE_URL = "https://json.schedulesdirect.org/";
    private final static String DEFAULT_ENDPOINT = "handleRequest.php";
    private final static Logger LOG = LoggerFactory.getLogger(SchedulesDirectClient.class);

    private SchedulesDirectApiVersion apiVersion;
    private Credentials credentials;
    private String baseUrl;
    private String endPoint;
    private boolean useBetaService;
    private String userAgent;

    @Override
    public void setup(SchedulesDirectApiVersion apiVersion, String userAgent, boolean useBetaService) throws VersionNotSupportedException {
        if(apiVersion == null)
            throw new VersionNotSupportedException();
        this.apiVersion = apiVersion;
        this.useBetaService = useBetaService;
        this.userAgent = userAgent;
        if(useBetaService) {
            baseUrl = DEFAUlT_BETA_BASE_URL;
            endPoint = apiVersion.getValue().toString();
        } else {
            baseUrl = DEFAUlT_BASE_URL;
            endPoint = DEFAULT_ENDPOINT;
        }
        if(LOG.isDebugEnabled()){
            LOG.debug("Setting up with API version: " + apiVersion + ", baseUrl: '" + baseUrl + "', endPoint: " + endPoint);
        }
    }

    @Override
    public void dispose() {
    }

    @Override
    public SchedulesDirectApiVersion getApiVersion() {
        return apiVersion;
    }

    @Override
    public String getBaseUrl() {
        if(baseUrl != null)
            return baseUrl;
        if(useBetaService)
            return DEFAUlT_BETA_BASE_URL;
        return DEFAUlT_BASE_URL;
    }

    @Override
    public String getEndpoint() {
        if(endPoint != null)
            return endPoint;
        return DEFAULT_ENDPOINT;
    }

    @Override
    public String getUrl(){
        StringBuilder builder = new StringBuilder(getBaseUrl());
        builder.append(getEndpoint());
        return builder.toString();
    }

    @Override
    public String getUserAgent() {
        return userAgent;
    }

    @Override
    public Credentials getCredentials() {
        return credentials;
    }

    @Override
    public void connect(Credentials credentials) throws AuthenticationException {
        connect(credentials, null, null, false);
    }

    @Override
    public void connect(Credentials credentials, boolean forceConnect) throws AuthenticationException {
        connect(credentials, null, null, forceConnect);
    }

    @Override
    public void connect(Credentials credentials, String baseUrl, boolean forceConnect) throws AuthenticationException {
        connect(credentials, baseUrl, null, forceConnect);
    }

    @Override
    public void connect(Credentials credentials, String baseUrl, String endPoint, boolean forceConnect) throws AuthenticationException {
        if (credentials == null)
            throw new AuthenticationException("credentials object cannot be null");
        if(endPoint != null && !endPoint.trim().isEmpty())
            this.endPoint = endPoint;
        if(baseUrl != null && !baseUrl.trim().isEmpty())
            this.baseUrl = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";

        if(LOG.isDebugEnabled()){
            LOG.debug("Connecting with credentials:" + credentials.toString() + " forceConnect: " + forceConnect + ", baseUrl: '" + this.baseUrl + "', endPoint: " + this.endPoint);
        }

        if(!forceConnect){
            if (this.credentials != null) {
                //are these the same credentials ?
                if (this.credentials.sameUserNamePassword(credentials)) {
                    // is the token older than 12 hours ?
                    if (!this.credentials.isOlderThan(CREDENTIALS_EXPIRY_HOURS)) {
                        if(LOG.isInfoEnabled())
                            LOG.info("credentials less than " + CREDENTIALS_EXPIRY_HOURS + " hours. No need to get a new token");
                        return;
                    }
                }
            } else if(!credentials.isOlderThan(CREDENTIALS_EXPIRY_HOURS)){
                this.credentials = credentials;
                return;
            }
        }
        // if we got here we need to get a new token
        this.credentials = credentials;
        assert this.credentials.getUsername() != null;
        assert this.credentials.getPassword() != null;
        TokenCommand cmd = createCommand(TokenCommand.class);
        cmd.setParameters(new TokenParameters(credentials));
        execute(cmd);
        if (cmd.getStatus() != CommandStatus.SUCCESS)
            throw new AuthenticationException("Could not login to schedules direct", cmd.getResults().getCode());
    }

    @Override
    public void execute(ParameterizedCommand command) {
        execute(command, 0);
    }

    @Override
    public void execute(ParameterizedCommand command, int numRetries) {
        if(command.getParameters() != null){
            if(command.getParameters() instanceof AuthenticatedBaseCommandParameter)
                ((AuthenticatedBaseCommandParameter)command.getParameters()).setToken(credentials.getToken());
            if(command.getParameters() instanceof BaseCommandParameter){
                BaseCommandParameter p = (BaseCommandParameter) command.getParameters();
                if(p.getApi() == null)
                    p.setApi(apiVersion.getValue());
            }
        }
        command.execute(this, numRetries);
    }
}
