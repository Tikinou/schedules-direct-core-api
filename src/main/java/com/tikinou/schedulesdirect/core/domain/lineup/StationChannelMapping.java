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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StationChannelMapping {
    @JsonProperty("stationID")
    private Integer stationId;
    private Integer channel;
    private String qamType;
    private Integer qamFreq;
    private Integer qamProgram;
    private Integer uhfVhf;
    private Integer atscMajor;
    private Integer atscMinor;

    public boolean isATSC(){
        return uhfVhf != null || atscMajor != null;
    }

    public boolean hasQAMInfo(){
        return qamType != null || qamFreq != null || qamProgram != null;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getQamType() {
        return qamType;
    }

    public void setQamType(String qamType) {
        this.qamType = qamType;
    }

    public Integer getQamFreq() {
        return qamFreq;
    }

    public void setQamFreq(Integer qamFreq) {
        this.qamFreq = qamFreq;
    }

    public Integer getQamProgram() {
        return qamProgram;
    }

    public void setQamProgram(Integer qamProgram) {
        this.qamProgram = qamProgram;
    }

    public Integer getUhfVhf() {
        return uhfVhf;
    }

    public void setUhfVhf(Integer uhfVhf) {
        this.uhfVhf = uhfVhf;
    }

    public Integer getAtscMajor() {
        return atscMajor;
    }

    public void setAtscMajor(Integer atscMajor) {
        this.atscMajor = atscMajor;
    }

    public Integer getAtscMinor() {
        return atscMinor;
    }

    public void setAtscMinor(Integer atscMinor) {
        this.atscMinor = atscMinor;
    }

    @Override
    public String toString() {
        return "StationChannelMapEntry{" +
                "stationId=" + stationId +
                ", channel='" + channel + '\'' +
                ", qamType='" + qamType + '\'' +
                ", qamFreq=" + qamFreq +
                ", qamProgram=" + qamProgram +
                ", uhfVhf=" + uhfVhf +
                ", atscMajor=" + atscMajor +
                ", atscMinor=" + atscMinor +
                '}';
    }
}
