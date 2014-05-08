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

package com.tikinou.schedulesdirect.core.commands.lineup;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tikinou.schedulesdirect.core.commands.BaseCommandResult;
import com.tikinou.schedulesdirect.core.domain.lineup.LineupSD;
import com.tikinou.schedulesdirect.core.domain.lineup.MetadataSD;
import com.tikinou.schedulesdirect.core.domain.lineup.StationChannelMapping;
import com.tikinou.schedulesdirect.core.domain.lineup.StationSD;
import com.tikinou.schedulesdirect.core.jackson.ModuleRegistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Sebastien Astie
 */
public class GetLineupDetailsResult extends BaseCommandResult {
    private List<StationSD> stations;
    private MetadataSD metadata;
    private List<String> qamMappings;
//    @JsonProperty("map")
    private List<StationChannelMapping> stationMaps;
    private ObjectMapper mapper;

    public GetLineupDetailsResult(){
        mapper = ModuleRegistration.getInstance().getConfiguredObjectMapper();
    }

    public List<String> getQamMappings() {
        return qamMappings;
    }

    public void setQamMappings(List<String> qamMappings) {
        this.qamMappings = qamMappings;
    }

    public List<StationSD> getStations() {
        return stations;
    }

    public void setStations(List<StationSD> stations) {
        this.stations = stations;
    }

    public MetadataSD getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataSD metadata) {
        this.metadata = metadata;
    }

    public List<StationChannelMapping> getStationMaps() {
        return stationMaps;
    }

    public void setStationMaps(List<StationChannelMapping> stationMaps) {
        this.stationMaps = stationMaps;
    }

    @JsonAnySetter
    public void setDynamic(String name, Object value){
        if("map".equals(name)){
            Object o = null;
            if(qamMappings == null){
                o = value;
            } else {
                for(String s : qamMappings) {
                    Map m = (Map) value;
                    o = m.get(s);
                }
            }
            if(o != null)
                stationMaps = mapper.convertValue(o, mapper.getTypeFactory().constructCollectionType(List.class, StationChannelMapping.class));
        }
    }

    @Override
    public String toString() {
        return "GetLineupDetailsResult{" + toStringMembers() + '}';
    }

    @Override
    protected String toStringMembers() {
        return super.toStringMembers() + ", stations=" + stations + ". stationMap=" + stationMaps + ". metadata=" + metadata;
    }
}
