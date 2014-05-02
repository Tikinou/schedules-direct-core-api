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
public enum ShowType {
    Series("Series"),
    PaidProgramming("Paid Programming"),
    Serial("Serial"),
    Special("Special"),
    Miniseries("Miniseries"),
    FeatureFilm("Feature Film"),
    SportsNonEvent("Sports non-event"),
    SportsEvent("Sports event"),
    TVMovie("TV Movie"),
    ShortFilm("Short Film");
    private final String key;
    private ShowType(String key){
        this.key = key;
    }

    @JsonCreator
    public static ShowType fromKey(String key){
        if(key == null)
            return null;

        switch (key){
            case "Series":
                return Series;
            case "Paid Programming":
                return PaidProgramming;
            case "Serial":
                return Serial;
            case "Special":
                return Special;
            case "Miniseries":
                return Miniseries;
            case "Feature Film":
                return FeatureFilm;
            case "Sports non-event":
                return SportsNonEvent;
            case "Sports event":
                return SportsEvent;
            case "TV Movie":
                return TVMovie;
            case "Short Film":
                return ShortFilm;
            default:
                System.out.println("unknown:" + key);
                return null;
        }
    }
}
