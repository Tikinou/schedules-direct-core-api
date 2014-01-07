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
import com.tikinou.schedulesdirect.core.commands.randhash.RandHashCommand;
import com.tikinou.schedulesdirect.core.commands.randhash.RandHashParameters;
import com.tikinou.schedulesdirect.core.domain.*;
import com.tikinou.schedulesdirect.core.exceptions.AuthenticationException;
import com.tikinou.schedulesdirect.core.exceptions.VersionNotSupportedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sebastien Astie
 */
public abstract class AbstractSchedulesDirectClient implements SchedulesDirectClient {
    private final static String DEFAUlT_BASE_URL = "https://data2.schedulesdirect.org/";
    private final static String DEFAUlT_BETA_BASE_URL = "http://23.21.174.111/";
    private final static String DEFAULT_ENDPOINT = "handleRequest.php";
    private final static Logger LOG = LoggerFactory.getLogger(SchedulesDirectClient.class);

    private SchedulesDirectApiVersion apiVersion;
    private Credentials credentials;
    private String baseUrl;
    private String endPoint;
    private boolean useBetaService;

    @Override
    public void setup(SchedulesDirectApiVersion apiVersion, boolean useBetaService) throws VersionNotSupportedException {
        if(apiVersion == null)
            throw new VersionNotSupportedException();
        this.apiVersion = apiVersion;
        this.useBetaService = useBetaService;
        if(useBetaService)
            baseUrl = DEFAUlT_BETA_BASE_URL;
        else
            baseUrl = DEFAUlT_BASE_URL;
        endPoint = DEFAULT_ENDPOINT;
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
        if(endPoint != null)
            this.endPoint = endPoint;
        if(baseUrl != null)
            this.baseUrl = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";

        if(LOG.isDebugEnabled()){
            LOG.debug("Connecting with credentials:" + credentials.toString() + " forceConnect: " + forceConnect + ", baseUrl: '" + baseUrl + "', endPoint: " + endPoint);
        }

        if(!forceConnect){
            if (this.credentials != null) {
                //are these the same credentials ?
                if (this.credentials.sameUserNamePassword(credentials)) {
                    // is the randhash older than 12 hours ?
                    if (!this.credentials.isOlderThan(CREDENTIALS_EXPIRY_HOURS)) {
                        if(LOG.isInfoEnabled())
                            LOG.info("credentials less than " + CREDENTIALS_EXPIRY_HOURS + " hours. No need to get a new randhash");
                        return;
                    }
                }
            } else if(!credentials.isOlderThan(CREDENTIALS_EXPIRY_HOURS)){
                this.credentials = credentials;
                return;
            }
        }
        // if we got here we need to get a new randhash
        this.credentials = credentials;
        assert this.credentials.getUsername() != null;
        assert this.credentials.getPassword() != null;
        RandHashCommand cmd = createCommand(RandHashCommand.class);
        cmd.setParameters(new RandHashParameters(credentials));
        execute(cmd);
        if (cmd.getStatus() != CommandStatus.SUCCESS)
            throw new AuthenticationException("Could not login to schedules direct", cmd.getResults().getCode());
    }

    @Override
    public void execute(Command command) {
        if(command.getParameters() != null){
            if(command.getParameters() instanceof AuthenticatedBaseCommandParameter)
                ((AuthenticatedBaseCommandParameter)command.getParameters()).setRandhash(credentials.getRandhash());
            if(command.getParameters() instanceof BaseCommandParameter){
                BaseCommandParameter p = (BaseCommandParameter) command.getParameters();
                if(p.getApi() == null)
                    p.setApi(apiVersion.getValue());
            }
        }
        command.execute(this);
    }
}
