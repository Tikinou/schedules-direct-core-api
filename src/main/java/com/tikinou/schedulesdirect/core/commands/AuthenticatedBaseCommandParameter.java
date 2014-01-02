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

package com.tikinou.schedulesdirect.core.commands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tikinou.schedulesdirect.core.domain.ActionType;
import com.tikinou.schedulesdirect.core.domain.Credentials;
import com.tikinou.schedulesdirect.core.domain.ObjectTypes;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuthenticatedBaseCommandParameter extends BaseCommandParameter {
    private String randhash;

    protected AuthenticatedBaseCommandParameter(ObjectTypes objectType, ActionType actionType, SchedulesDirectApiVersion version){
        this(null, objectType,actionType,version);
    }

    protected AuthenticatedBaseCommandParameter(String randhash, ObjectTypes objectType, ActionType actionType, SchedulesDirectApiVersion version){
        super(objectType, actionType, version);
        this.randhash = randhash;
    }

    public String getRandhash() {
        return randhash;
    }

    public void setRandhash(String randhash) {
        this.randhash = randhash;
    }
}
