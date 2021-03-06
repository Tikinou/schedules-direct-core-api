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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tikinou.schedulesdirect.core.domain.Rating;
import com.tikinou.schedulesdirect.core.jackson.deser.BooleanYNDeserializer;

import java.util.List;

/**
 * @author Sebastien Astie.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MovieMetadata {
    private Integer year;
    private Integer duration;
    private List<RatingQuality> qualityRating;

//    @JsonDeserialize(using = BooleanYNDeserializer.class)
//    private Boolean madeForTV;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<RatingQuality> getQualityRating() {
        return qualityRating;
    }

    public void setQualityRating(List<RatingQuality> qualityRating) {
        this.qualityRating = qualityRating;
    }

    @Override
    public String toString() {
        return "MovieMetadata{" +
                "year=" + year +
                ", duration=" + duration +
                ", qualityRating=" + qualityRating +
                '}';
    }

}
