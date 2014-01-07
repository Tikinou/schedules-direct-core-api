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
import com.tikinou.schedulesdirect.core.domain.Rating;

/**
 * @author Sebastien Astie.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MovieMetadata {
    private Integer year;
    private Integer runTime;
    private String origStudio;
    private String starRating;
    private Rating mpaaRating;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public String getOrigStudio() {
        return origStudio;
    }

    public void setOrigStudio(String origStudio) {
        this.origStudio = origStudio;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public Rating getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(Rating mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    @Override
    public String toString() {
        return "MovieMetadata{" +
                "year=" + year +
                ", runTime=" + runTime +
                ", origStudio='" + origStudio + '\'' +
                ", starRating='" + starRating + '\'' +
                ", mpaaRating=" + mpaaRating +
                '}';
    }
}
