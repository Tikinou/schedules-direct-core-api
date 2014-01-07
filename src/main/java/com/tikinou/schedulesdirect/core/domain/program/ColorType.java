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
public enum ColorType {
    BlackAndWhite("B&W"),
    Color("Color"),
    Colorized("Colorized"),
    ColorAndBW("Color and B&W");

    public String getKey(){
        return key;
    }
    private final String key;
    private ColorType(String key){
        this.key = key;
    }

    @JsonCreator
    public static ColorType fromKey(String key){
        if(key == null)
            return null;

        switch(key){
            case "B & W":
            case "B&W":
                return BlackAndWhite;
            case "Color":
                return Color;
            case "Colorized":
                return Colorized;
            case "Color and B & W":
            case "Color and B&W":
                return ColorAndBW;
            default:
                return null;
        }
    }
}
