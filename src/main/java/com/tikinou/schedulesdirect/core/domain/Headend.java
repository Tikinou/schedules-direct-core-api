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

package com.tikinou.schedulesdirect.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tikinou.schedulesdirect.core.domain.lineup.BasicLineupInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Headend {
    private String type;
    private String location;
    private List<BasicLineupInfo> lineups;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<BasicLineupInfo> getLineups() {
        return lineups;
    }

    public void setLineups(List<BasicLineupInfo> lineups) {
        this.lineups = lineups;
    }

    @Override
    public String toString() {
        return "Headend{" +
                "type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", lineups=[" + (lineups != null ? Arrays.toString(lineups.toArray()) : "" )+ ']' +
                '}';
    }
}
