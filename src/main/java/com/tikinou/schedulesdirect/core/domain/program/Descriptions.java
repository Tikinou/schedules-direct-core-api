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

/**
 * @author Sebastien Astie.
 */
public class Descriptions {
    private String alternateDescription255;
    private String alternateDescription100;
    private String alternateDescription60;
    private String alternateDescription40;
    private String description255;
    private String description100;
    private String description60;
    private String description40;
    private String seriesDescription;

    public String getDescription255() {
        return description255;
    }

    public void setDescription255(String description255) {
        this.description255 = description255;
    }

    public String getDescription100() {
        return description100;
    }

    public void setDescription100(String description100) {
        this.description100 = description100;
    }

    public String getDescription60() {
        return description60;
    }

    public void setDescription60(String description60) {
        this.description60 = description60;
    }

    public String getDescription40() {
        return description40;
    }

    public void setDescription40(String description40) {
        this.description40 = description40;
    }

    public String getAlternateDescription255() {
        return alternateDescription255;
    }

    public void setAlternateDescription255(String alternateDescription255) {
        this.alternateDescription255 = alternateDescription255;
    }

    public String getAlternateDescription100() {
        return alternateDescription100;
    }

    public void setAlternateDescription100(String alternateDescription100) {
        this.alternateDescription100 = alternateDescription100;
    }

    public String getAlternateDescription60() {
        return alternateDescription60;
    }

    public void setAlternateDescription60(String alternateDescription60) {
        this.alternateDescription60 = alternateDescription60;
    }

    public String getAlternateDescription40() {
        return alternateDescription40;
    }

    public void setAlternateDescription40(String alternateDescription40) {
        this.alternateDescription40 = alternateDescription40;
    }

    public String getSeriesDescription() {
        return seriesDescription;
    }

    public void setSeriesDescription(String seriesDescription) {
        this.seriesDescription = seriesDescription;
    }

    @Override
    public String toString() {
        return "Descriptions{" +
                "alternateDescription255='" + alternateDescription255 + '\'' +
                ", alternateDescription100='" + alternateDescription100 + '\'' +
                ", alternateDescription60='" + alternateDescription60 + '\'' +
                ", alternateDescription40='" + alternateDescription40 + '\'' +
                ", description255='" + description255 + '\'' +
                ", description100='" + description100 + '\'' +
                ", description60='" + description60 + '\'' +
                ", description40='" + description40 + '\'' +
                ", seriesDescription='" + seriesDescription + '\'' +
                '}';
    }
}
