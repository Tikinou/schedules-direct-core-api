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
    private List<String> advisories;
    private List<String> genres;
    private MovieMetadata movie;
    private ShowType showType;
    private ProgramSourceType sourceType;
    private Titles titles;
    private Descriptions descriptions;
    private String descriptionLanguage;
    private String episodeTitle150;
    private String holiday;
    private String md5;
    private DateTime modified;
    private ColorType colorCode;
    private String alternateSyndicatedEpisodeNumber;
    private String syndicatedEpisodeNumber;
    private String originCountry;
    private String originalAirDate;
    private DateTime gameDateTime;
    private List<CastEntry> castAndCrew;
    private List<Map<String, EpisodeMetadata>> metadata;

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public List<String> getAdvisories() {
        return advisories;
    }

    public void setAdvisories(List<String> advisories) {
        this.advisories = advisories;
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

    public ProgramSourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(ProgramSourceType sourceType) {
        this.sourceType = sourceType;
    }

    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public Descriptions getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Descriptions descriptions) {
        this.descriptions = descriptions;
    }

    public String getDescriptionLanguage() {
        return descriptionLanguage;
    }

    public void setDescriptionLanguage(String descriptionLanguage) {
        this.descriptionLanguage = descriptionLanguage;
    }

    public String getEpisodeTitle150() {
        return episodeTitle150;
    }

    public void setEpisodeTitle150(String episodeTitle150) {
        this.episodeTitle150 = episodeTitle150;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public DateTime getModified() {
        return modified;
    }

    public void setModified(DateTime modified) {
        this.modified = modified;
    }

    public List<Map<String, EpisodeMetadata>> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Map<String, EpisodeMetadata>> metadata) {
        this.metadata = metadata;
    }

    public ColorType getColorCode() {
        return colorCode;
    }

    public void setColorCode(ColorType colorCode) {
        this.colorCode = colorCode;
    }

    public String getAlternateSyndicatedEpisodeNumber() {
        return alternateSyndicatedEpisodeNumber;
    }

    public void setAlternateSyndicatedEpisodeNumber(String alternateSyndicatedEpisodeNumber) {
        this.alternateSyndicatedEpisodeNumber = alternateSyndicatedEpisodeNumber;
    }

    public String getSyndicatedEpisodeNumber() {
        return syndicatedEpisodeNumber;
    }

    public void setSyndicatedEpisodeNumber(String syndicatedEpisodeNumber) {
        this.syndicatedEpisodeNumber = syndicatedEpisodeNumber;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getOriginalAirDate() {
        return originalAirDate;
    }

    public void setOriginalAirDate(String originalAirDate) {
        this.originalAirDate = originalAirDate;
    }

    public DateTime getGameDateTime() {
        return gameDateTime;
    }

    public void setGameDateTime(DateTime gameDateTime) {
        this.gameDateTime = gameDateTime;
    }

    public List<CastEntry> getCastAndCrew() {
        return castAndCrew;
    }

    public void setCastAndCrew(List<CastEntry> castAndCrew) {
        this.castAndCrew = castAndCrew;
    }

    @Override
    public String toString() {
        return "ProgramSD{" +
                "programId='" + programId + '\'' +
                ", advisories=" + advisories +
                ", genres=" + genres +
                ", movie=" + movie +
                ", showType=" + showType +
                ", sourceType=" + sourceType +
                ", titles=" + titles +
                ", descriptions=" + descriptions +
                ", descriptionLanguage='" + descriptionLanguage + '\'' +
                ", episodeTitle150='" + episodeTitle150 + '\'' +
                ", holiday='" + holiday + '\'' +
                ", md5='" + md5 + '\'' +
                ", modified=" + modified +
                ", metadata=" + metadata +
                ", colorCode=" + colorCode +
                ", alternateSyndicatedEpisodeNumber='" + alternateSyndicatedEpisodeNumber + '\'' +
                ", syndicatedEpisodeNumber='" + syndicatedEpisodeNumber + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", originalAirDate='" + originalAirDate + '\'' +
                ", gameDateTime='" + gameDateTime + '\'' +
                ", castAndCrew=" + castAndCrew +
                '}';
    }
}
