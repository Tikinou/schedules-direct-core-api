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
public enum SyndicationType {
    BroadcastNetwork("Broadcast Network"),
    FirstRunSyndication("First Run Syndication"),
    OffNetwork("Off Network");

    private final String key;
    private SyndicationType(String key){
        this.key = key;
    }

    @JsonCreator
    public static SyndicationType fromKey(String key){
        if(key == null)
            return null;

        switch (key){
            case "Broadcast Network":
                return BroadcastNetwork;
            case "First Run Syndication":
                return FirstRunSyndication;
            case "Off Network":
                return OffNetwork;
            default:
                return null;
        }
    }

}
