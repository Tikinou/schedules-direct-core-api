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

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Sebastien Astie.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Description {
    private String descriptionLanguage;
    private String description;

    public String getDescriptionLanguage() {
        return descriptionLanguage;
    }

    public void setDescriptionLanguage(String descriptionLanguage) {
        this.descriptionLanguage = descriptionLanguage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "description{" +
                "description='" + description + '\'' +
                ", descriptionLanguage='" + descriptionLanguage + '\'' +
                '}';
    }
}
