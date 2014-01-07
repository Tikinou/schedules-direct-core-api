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

package com.tikinou.schedulesdirect.core.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Sebastien Astie
 */
public enum Rating {
    TV_Y("TVY"),
    TV_Y7("TVY7"),
    TV_G("TVG"),
    TV_PG("TVPG"),
    TV_14("TV14"),
    TV_MA("TVMA"),
    MPAA_G("G"),
    MPAA_PG("PG"),
    MPAA_PG13("PG-13"),
    MPAA_R("R"),
    MPAA_NC17("NC-17"),
    MPAA_NR("NR"),
    MPAA_AO("AO");

    private final String key;
    private Rating(String key){
        this.key = key;
    }

    @JsonCreator
    public static Rating fromKey(String key){
        if(key == null)
            return null;

        switch(key){
            case "TVY":
                return TV_Y;
            case "TVY7":
                return TV_Y7;
            case "TVG":
                return TV_G;
            case "TVPG":
                return TV_PG;
            case "TV14":
                return TV_14;
            case "TVMA":
                return TV_MA;
            case "G":
                return MPAA_G;
            case "PG":
                return MPAA_PG;
            case "PG-13":
                return MPAA_PG13;
            case "R":
                return MPAA_R;
            case "NC-17":
                return MPAA_NC17;
            case "NR":
                return MPAA_NR;
            case "AO":
                return MPAA_AO;
            default:
                return null;
        }
    }

}
