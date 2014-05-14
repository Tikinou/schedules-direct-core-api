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
 * @author Sebastien Astue
 */
public class RatingQuality {
    private String ratingsBody;
    private Double rating;
    private Double minRating;
    private Double maxRating;
    private Double increment;

    public String getRatingsBody() {
        return ratingsBody;
    }

    public void setRatingsBody(String ratingsBody) {
        this.ratingsBody = ratingsBody;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getMinRating() {
        return minRating;
    }

    public void setMinRating(Double minRating) {
        this.minRating = minRating;
    }

    public Double getMaxRating() {
        return maxRating;
    }

    public void setMaxRating(Double maxRating) {
        this.maxRating = maxRating;
    }

    public Double getIncrement() {
        return increment;
    }

    public void setIncrement(Double increment) {
        this.increment = increment;
    }

    @Override
    public String toString() {
        return "RatingQuality{" +
                "ratingsBody='" + ratingsBody + '\'' +
                ", rating=" + rating +
                ", minRating=" + minRating +
                ", maxRating=" + maxRating +
                ", increment=" + increment +
                '}';
    }
}
