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

package com.tikinou.schedulesdirect.core.commands.randhash;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tikinou.schedulesdirect.core.commands.BaseCommandParameter;
import com.tikinou.schedulesdirect.core.domain.ActionType;
import com.tikinou.schedulesdirect.core.domain.Credentials;
import com.tikinou.schedulesdirect.core.domain.ObjectTypes;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RandHashParameters extends BaseCommandParameter{

    public RandHashParameters(String username, String password, SchedulesDirectApiVersion version){
        this(new Credentials(username, password), version);
    }

    public RandHashParameters(Credentials credentials, SchedulesDirectApiVersion version){
        super(ObjectTypes.RANDHASH, ActionType.GET, version);
        this.credentials = credentials;
    }

    @JsonProperty("request")
    private Credentials credentials;

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "RandHashParameters{" + toStringMembers() + '}';
    }

    @Override
    protected String toStringMembers() {
        return super.toStringMembers() + ", credentials=" + credentials;
    }
}
