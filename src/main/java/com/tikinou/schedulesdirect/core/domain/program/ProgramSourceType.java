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

package com.tikinou.schedulesdirect.core.domain.program;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Sebastien Astie
 */
public enum ProgramSourceType{
    Block("Block"),
    Local("Local"),
    Network("Network"),
    Syndicated("Syndicated");

    private final String key;
    private ProgramSourceType(String key){
        this.key = key;
    }

    @JsonCreator
    public static ProgramSourceType fromKey(String key){
        if(key == null)
            return null;

        switch(key){
            case "Block":
                return Block;
            case "Local":
                return Local;
            case "Network":
                return Network;
            case "Syndicated":
                return Syndicated;
            default:
                return null;
        }
    }
}
