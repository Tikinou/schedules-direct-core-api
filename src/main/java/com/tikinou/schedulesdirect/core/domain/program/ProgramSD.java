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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tikinou.schedulesdirect.core.domain.ContentRatingInfo;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Map;

/**
 * @author Sebastien Astie.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProgramSD {
    @JsonProperty("programID")
    private String programId;
    private List<String> contentAdvisory;
    private List<String> genres;
    private EventDetails eventDetails;
    private MovieMetadata movie;
    private ShowType showType;
    private Titles titles;
    private Map<String, List<Description>> descriptions;
    private String episodeTitle150;
    private String md5;
    private String originalAirDate;
    private List<Person> cast;
    private List<Person> crew;
    private List<Image> images;
    private List<ContentRatingInfo> contentRating;
    private List<Map<String, EpisodeMetadata>> metadata;
    private List<Recommendation> recommendations;

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }

    public List<ContentRatingInfo> getContentRating() {
        return contentRating;
    }

    public void setContentRating(List<ContentRatingInfo> contentRating) {
        this.contentRating = contentRating;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public List<String> getContentAdvisory() {
        return contentAdvisory;
    }

    public void setContentAdvisory(List<String> contentAdvisory) {
        this.contentAdvisory = contentAdvisory;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public MovieMetadata getMovie() {
        return movie;
    }

    public void setMovie(MovieMetadata movie) {
        this.movie = movie;
    }

    public ShowType getShowType() {
        return showType;
    }

    public void setShowType(ShowType showType) {
        this.showType = showType;
    }

    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public String getEpisodeTitle150() {
        return episodeTitle150;
    }

    public void setEpisodeTitle150(String episodeTitle150) {
        this.episodeTitle150 = episodeTitle150;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public List<Map<String, EpisodeMetadata>> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Map<String, EpisodeMetadata>> metadata) {
        this.metadata = metadata;
    }

    public String getOriginalAirDate() {
        return originalAirDate;
    }

    public void setOriginalAirDate(String originalAirDate) {
        this.originalAirDate = originalAirDate;
    }

    public List<Person> getCast() {
        return cast;
    }

    public void setCast(List<Person> cast) {
        this.cast = cast;
    }

    public List<Person> getCrew() {
        return crew;
    }

    public void setCrew(List<Person> crew) {
        this.crew = crew;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    public Map<String, List<Description>> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Map<String, List<Description>> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "ProgramSD{" +
                "programId='" + programId + '\'' +
                ", contentAdvisory=" + contentAdvisory +
                ", genres=" + genres +
                ", eventDetails=" + eventDetails +
                ", movie=" + movie +
                ", showType=" + showType +
                ", titles=" + titles +
                ", descriptions=" + descriptions +
                ", episodeTitle150='" + episodeTitle150 + '\'' +
                ", md5='" + md5 + '\'' +
                ", metadata=" + metadata +
                ", originalAirDate='" + originalAirDate + '\'' +
                ", cast=" + cast +
                ", crew=" + crew +
                ", images=" + images +
                '}';
    }
}
