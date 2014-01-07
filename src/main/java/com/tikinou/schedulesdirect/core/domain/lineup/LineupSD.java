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

package com.tikinou.schedulesdirect.core.domain.lineup;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sebastien Astie.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LineupSD {
    private String headend;
    private String name;
    private String location;
    private List<String> deviceTypes;
    private List<StationSD> stations;
    private List<MetadataSD> metadata;
    private Map<String, List<StationChannelMapEntry>> deviceTypeMaps = new HashMap<>();

    public String getHeadend() {
        return headend;
    }

    public void setHeadend(String headend) {
        this.headend = headend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getDeviceTypes() {
        return deviceTypes;
    }

    public void setDeviceTypes(List<String> deviceTypes) {
        this.deviceTypes = deviceTypes;
    }

    public List<StationSD> getStations() {
        return stations;
    }

    public void setStations(List<StationSD> stations) {
        this.stations = stations;
    }

    public List<MetadataSD> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<MetadataSD> metadata) {
        this.metadata = metadata;
    }

    public Map<String, List<StationChannelMapEntry>> getDeviceTypeMaps() {
        return deviceTypeMaps;
    }

    public void setDeviceTypeMaps(Map<String, List<StationChannelMapEntry>> deviceTypeMaps) {
        this.deviceTypeMaps = deviceTypeMaps;
    }

    @JsonAnySetter
    public void setDynamicProperty(String name, Map<String, List<StationChannelMapEntry>> map) {
        deviceTypeMaps.put(name, map.get("map"));
    }

}
