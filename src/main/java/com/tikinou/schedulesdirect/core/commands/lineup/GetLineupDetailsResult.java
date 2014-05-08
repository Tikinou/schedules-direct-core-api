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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tikinou.schedulesdirect.core.commands.BaseCommandResult;
import com.tikinou.schedulesdirect.core.domain.lineup.MetadataSD;
import com.tikinou.schedulesdirect.core.domain.lineup.StationChannelMapping;
import com.tikinou.schedulesdirect.core.domain.lineup.StationSD;
import com.tikinou.schedulesdirect.core.jackson.ModuleRegistration;

import java.util.List;
import java.util.Map;

/**
 * @author Sebastien Astie
 */
public class GetLineupDetailsResult extends BaseCommandResult {
    private List<StationSD> stations;
    private MetadataSD metadata;
    private List<String> qamMappings;
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
    @SuppressWarnings("unchecked")
    public void setDynamic(String name, Object value){
        if("map".equals(name)){

            if(qamMappings == null){
                stationMaps = convert(value);
            } else {
                for(String s : qamMappings) {
                    Map m = (Map) value;
                    List<StationChannelMapping> mappings = convert(m.get(s));
                    for(StationChannelMapping mapping : mappings)
                        mapping.setQamMappingName(s);
                    if(stationMaps == null)
                        stationMaps = mappings;
                    else
                        stationMaps.addAll(mappings);
                }
            }
        }
    }

    private List<StationChannelMapping> convert(Object o){
        return mapper.convertValue(o, mapper.getTypeFactory().constructCollectionType(List.class, StationChannelMapping.class));
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
