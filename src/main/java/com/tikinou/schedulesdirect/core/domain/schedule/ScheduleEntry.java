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

package com.tikinou.schedulesdirect.core.domain.schedule;

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
public class ScheduleEntry {
    private DateTime airDateTime;
    @JsonProperty("programID")
    private String programId;
    private String md5;
    private Integer duration;
    @JsonProperty("liveTapeDelay")
    private AiringLiveType airingLiveType;
    @JsonProperty("isPremiereOrFinale")
    private AiringSeasonRelationship seasonSeriesRelationship;
    private List<AudioProperty> audioProperties;
    private List<VideoProperty> videoProperties;

    @JsonProperty("new")
    private Boolean newAiring;
    private Boolean cableInTheClassroom;
    private Boolean catchup; // used in UK, indicates that program is available online.
    private Boolean timeApproximate;
    private Boolean educational;
    private Boolean joinedInProgress;
    private Boolean leftInProgress;
    private Boolean subjectToBlackout;
    private Boolean continued; // Continued from a previous broadcast
    private Boolean premiere;// Indicates first showing of a movie or miniseries
    private Boolean programBreak; // Program stops and will restart later (indicated by a "continue"). Typically only found in UK
    private Boolean repeat;
    private Boolean signed;// Supplemented with a person signing for the hearing impaired
    private List<ContentRatingInfo> contentRating;
    private Syndication syndication;
    private Map<String, List<String>> contentAdvisory;
    private List<Language> language;

    public DateTime getAirDateTime() {
        return airDateTime;
    }

    public void setAirDateTime(DateTime airDateTime) {
        this.airDateTime = airDateTime;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<VideoProperty> getVideoProperties() {
        return videoProperties;
    }

    public void setVideoProperties(List<VideoProperty> videoProperties) {
        this.videoProperties = videoProperties;
    }

    public List<AudioProperty> getAudioProperties() {
        return audioProperties;
    }

    public void setAudioProperties(List<AudioProperty> audioProperties) {
        this.audioProperties = audioProperties;
    }

    public Boolean getNewAiring() {
        return newAiring;
    }

    public void setNewAiring(Boolean newAiring) {
        this.newAiring = newAiring;
    }

    public AiringLiveType getAiringLiveType() {
        return airingLiveType;
    }

    public void setAiringLiveType(AiringLiveType airingLiveType) {
        this.airingLiveType = airingLiveType;
    }

    public AiringSeasonRelationship getSeasonSeriesRelationship() {
        return seasonSeriesRelationship;
    }

    public void setSeasonSeriesRelationship(AiringSeasonRelationship seasonSeriesRelationship) {
        this.seasonSeriesRelationship = seasonSeriesRelationship;
    }

    public Boolean getCableInTheClassroom() {
        return cableInTheClassroom;
    }

    public void setCableInTheClassroom(Boolean cableInTheClassroom) {
        this.cableInTheClassroom = cableInTheClassroom;
    }

    public Boolean getTimeApproximate() {
        return timeApproximate;
    }

    public void setTimeApproximate(Boolean timeApproximate) {
        this.timeApproximate = timeApproximate;
    }

    public Boolean getEducational() {
        return educational;
    }

    public void setEducational(Boolean educational) {
        this.educational = educational;
    }

    public Boolean getJoinedInProgress() {
        return joinedInProgress;
    }

    public void setJoinedInProgress(Boolean joinedInProgress) {
        this.joinedInProgress = joinedInProgress;
    }

    public Boolean getLeftInProgress() {
        return leftInProgress;
    }

    public void setLeftInProgress(Boolean leftInProgress) {
        this.leftInProgress = leftInProgress;
    }

    public Boolean getSubjectToBlackout() {
        return subjectToBlackout;
    }

    public void setSubjectToBlackout(Boolean subjectToBlackout) {
        this.subjectToBlackout = subjectToBlackout;
    }

    public Boolean getCatchup() {
        return catchup;
    }

    public void setCatchup(Boolean catchup) {
        this.catchup = catchup;
    }

    public Boolean getContinued() {
        return continued;
    }

    public void setContinued(Boolean continued) {
        this.continued = continued;
    }

    public Boolean getPremiere() {
        return premiere;
    }

    public void setPremiere(Boolean premiere) {
        this.premiere = premiere;
    }

    public Boolean getProgramBreak() {
        return programBreak;
    }

    public void setProgramBreak(Boolean programBreak) {
        this.programBreak = programBreak;
    }

    public Boolean getRepeat() {
        return repeat;
    }

    public void setRepeat(Boolean repeat) {
        this.repeat = repeat;
    }

    public Boolean getSigned() {
        return signed;
    }

    public void setSigned(Boolean signed) {
        this.signed = signed;
    }

    public List<ContentRatingInfo> getContentRating() {
        return contentRating;
    }

    public void setContentRating(List<ContentRatingInfo> contentRating) {
        this.contentRating = contentRating;
    }

    public Syndication getSyndication() {
        return syndication;
    }

    public void setSyndication(Syndication syndication) {
        this.syndication = syndication;
    }

    public Map<String, List<String>> getContentAdvisory() {
        return contentAdvisory;
    }

    public void setContentAdvisory(Map<String, List<String>> contentAdvisory) {
        this.contentAdvisory = contentAdvisory;
    }

    public List<Language> getLanguage() {
        return language;
    }

    public void setLanguage(List<Language> language) {
        this.language = language;
    }
}
