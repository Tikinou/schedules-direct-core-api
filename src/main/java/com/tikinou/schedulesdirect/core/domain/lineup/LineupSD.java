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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sebastien Astie.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LineupSD {
    private List<StationSD> stations;
    private MetadataSD metadata;
    @JsonProperty("map")
    private List<StationChannelMapping> stationMaps;

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
}
