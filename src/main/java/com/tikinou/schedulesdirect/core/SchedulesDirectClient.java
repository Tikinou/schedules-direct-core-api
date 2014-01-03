/*
 * Copyright (c) 2013 TIKINOU LLC
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

import com.tikinou.schedulesdirect.core.domain.ActionType;
import com.tikinou.schedulesdirect.core.domain.Credentials;
import com.tikinou.schedulesdirect.core.domain.ObjectTypes;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;
import com.tikinou.schedulesdirect.core.exceptions.AuthenticationException;
import com.tikinou.schedulesdirect.core.exceptions.VersionNotSupportedException;

/**
 * @author Sebastien Astie
 */
public interface SchedulesDirectClient {
    public static final int CREDENTIALS_EXPIRY_HOURS = 12;

    public void setup(SchedulesDirectApiVersion apiVersion, boolean useBetaService) throws VersionNotSupportedException;

    public void dispose();

    public String getBaseUrl();

    public String getEndpoint();

    public String getUrl();

    public Credentials getCredentials();

    public void connect(Credentials credentials) throws AuthenticationException;

    public void connect(Credentials credentials, boolean forceConnect) throws AuthenticationException;

    public void connect(Credentials credentials, String baseUrl, boolean forceConnect) throws AuthenticationException;

    public void connect(Credentials credentials, String baseUrl, String endPoint, boolean forceConnect) throws AuthenticationException;

    public void execute(Command command);

    public <T extends Command<?,?>> T createCommand(Class<T> commandClass);
}
