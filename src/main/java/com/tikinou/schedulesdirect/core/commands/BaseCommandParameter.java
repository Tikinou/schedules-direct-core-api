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
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;

import java.util.Map;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BaseCommandParameter {
    private Integer api;

    protected BaseCommandParameter(){
        this(null);
    }

    protected BaseCommandParameter(SchedulesDirectApiVersion version){
        if(version != null)
            api = version.getValue();
    }

    public Integer getApi() {
        return api;
    }

    public void setApi(Integer api) {
        this.api = api;
    }

    @Override
    public String toString() {
        return "BaseCommandParameter{" +
                toStringMembers() +
                '}';
    }

    protected String toStringMembers(){
        return "api=" + api;
    }

    public Map<String,String> toRequestParameters() { return null; }
}
