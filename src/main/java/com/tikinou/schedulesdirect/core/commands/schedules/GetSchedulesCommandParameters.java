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

package com.tikinou.schedulesdirect.core.commands.schedules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tikinou.schedulesdirect.core.commands.AuthenticatedBaseCommandParameter;
import com.tikinou.schedulesdirect.core.domain.ActionType;
import com.tikinou.schedulesdirect.core.domain.ObjectTypes;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetSchedulesCommandParameters extends AuthenticatedBaseCommandParameter {
    @JsonProperty("request")
    private List<String> stationIds;

    public GetSchedulesCommandParameters(SchedulesDirectApiVersion version){
        this(null, version);
    }

    public GetSchedulesCommandParameters(String randhash, SchedulesDirectApiVersion version){
        this(randhash, version, null);
    }

    public GetSchedulesCommandParameters(String randhash, SchedulesDirectApiVersion version, List<String> stationIds){
        super(randhash, ObjectTypes.SCHEDULES, ActionType.GET, version);
        this.stationIds = stationIds;
    }

    public List<String> getStationIds() {
        return stationIds;
    }

    public void setStationIds(List<String> stationIds) {
        this.stationIds = stationIds;
    }

    @Override
    public String toString() {
        return "GetSchedulesCommandParameters{" + toStringMembers() + '}';
    }

    @Override
    protected String toStringMembers() {
        return super.toStringMembers() +
            ", stationIds=" + (stationIds != null ? Arrays.toString(stationIds.toArray()) : stationIds);
    }
}
