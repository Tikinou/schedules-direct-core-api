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

package com.tikinou.schedulesdirect.core.domain.schedule;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Sebastien Astie
 */
public enum DolbyAudioType {
    Dolby("Dolby"),
    DolbySurround("DSS"),
    DolbyDigital("DD"),
    DolbyDigital51("DD5.1");

    public String getKey(){
        return key;
    }

    private final String key;
    private DolbyAudioType(String val){
        key = val;
    }

    @JsonCreator
    public static DolbyAudioType fromKey(String dolbyTypeKey){
        if(dolbyTypeKey == null)
            return null;

        switch(dolbyTypeKey){
            case "None":
                return null;
            case "Dolby":
                return Dolby;
            case "DSS":
                return DolbySurround;
            case "DD":
                return DolbyDigital;
            case "DD5.1":
                return DolbyDigital51;
            default:
                return null;
        }
    }
}
