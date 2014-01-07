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
public class Titles {
    private String title120;
    private String title10;
    private String title20;
    private String title40;
    private String title70;
    private String alternateTitle;

    public String getAlternateTitle() {
        return alternateTitle;
    }

    public void setAlternateTitle(String alternateTitle) {
        this.alternateTitle = alternateTitle;
    }

    public String getTitle120() {
        return title120;
    }

    public void setTitle120(String title120) {
        this.title120 = title120;
    }

    public String getTitle10() {
        return title10;
    }

    public void setTitle10(String title10) {
        this.title10 = title10;
    }

    public String getTitle20() {
        return title20;
    }

    public void setTitle20(String title20) {
        this.title20 = title20;
    }

    public String getTitle40() {
        return title40;
    }

    public void setTitle40(String title40) {
        this.title40 = title40;
    }

    public String getTitle70() {
        return title70;
    }

    public void setTitle70(String title70) {
        this.title70 = title70;
    }

}
