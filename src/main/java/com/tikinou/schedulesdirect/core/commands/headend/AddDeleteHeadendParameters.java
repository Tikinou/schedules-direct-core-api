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

package com.tikinou.schedulesdirect.core.commands.headend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tikinou.schedulesdirect.core.commands.AuthenticatedBaseCommandParameter;
import com.tikinou.schedulesdirect.core.domain.ActionType;
import com.tikinou.schedulesdirect.core.domain.ObjectTypes;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AddDeleteHeadendParameters extends AuthenticatedBaseCommandParameter {
    @JsonProperty("request")
    private String headendId;

    public AddDeleteHeadendParameters(boolean delete, SchedulesDirectApiVersion version){
        this(null, delete, version);
    }

    public AddDeleteHeadendParameters(String randhash, boolean delete, SchedulesDirectApiVersion version){
        this(randhash, delete, version, null);
    }

    public AddDeleteHeadendParameters(String randhash, boolean delete, SchedulesDirectApiVersion version, String headendId){
        super(randhash, ObjectTypes.HEADENDS, delete? ActionType.DELETE : ActionType.ADD, version);
        this.headendId = headendId;
    }

    public String getHeadendId() {
        return headendId;
    }

    public void setHeadendId(String headendId) {
        this.headendId = headendId;
    }

    @Override
    public String toString() {
        return "AddDeleteHeadendParameters{" + toStringMembers() + '}';
    }

    @Override
    protected String toStringMembers() {
        return super.toStringMembers() + ", headendId='" + headendId + '\'';
    }
}
