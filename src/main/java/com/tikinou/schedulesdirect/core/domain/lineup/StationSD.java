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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StationSD {
    private String name;
    private String callsign;
    private String affiliate;
    private String language;
    @JsonProperty("stationID")
    private Integer stationId;
    private BroadcasterSD broadcaster;
    private LogoSD logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(String affiliate) {
        this.affiliate = affiliate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public BroadcasterSD getBroadcaster() {
        return broadcaster;
    }

    public void setBroadcaster(BroadcasterSD broadcaster) {
        this.broadcaster = broadcaster;
    }

    public LogoSD getLogo() {
        return logo;
    }

    public void setLogo(LogoSD logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", callsign='" + callsign + '\'' +
                ", affiliate='" + affiliate + '\'' +
                ", language='" + language + '\'' +
                ", stationId=" + stationId +
                ", broadcaster=" + broadcaster +
                ", logo=" + logo +
                '}';
    }
}
