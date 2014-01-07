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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tikinou.schedulesdirect.core.domain.Rating;
import org.joda.time.DateTime;

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
    private Boolean hdtv;
    private Boolean letterbox;
    private Boolean dvs;
    @JsonProperty("new")
    private Boolean newAiring;
    private Boolean enhanced;
    @JsonProperty("liveTapeDelay")
    private AiringLiveType airingLiveType;
    @JsonProperty("isPremiereOrFinale")
    private AiringSeasonRelationship seasonSeriesRelationship;
    private Boolean is3d;
    private Boolean cc;
    private DolbyAudioType dolby;
    private Boolean stereo;
    private Boolean subtitled;
    private String subtitledLanguage;
    private Boolean sap;
    private String sapLanguage;
    private Boolean hasLanguageRating;
    private Boolean hasDialogRating;
    private Boolean hasViolenceRating;
    private Boolean hasFantasyViolenceRating;
    private Boolean hasSexRating;
    private Rating tvRating;
    @JsonProperty("netSyndicationSource")
    private String syndicationOriginatingSource;
    @JsonProperty("netSyndicationType")
    private SyndicationType syndicationType;
    @JsonProperty("CableInTheClassroom")
    private Boolean cableInTheClassRoom;
    private Boolean dubbed;
    private String dubbedLanguage;
    private Boolean timeApproximate;
    private Boolean educational;
    private Boolean joinedInProgress;
    private Boolean leftInProgress;
    private Integer numberOfParts;
    private Integer partNumber;
    private Boolean subjectToBlackout;


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

    public Boolean getHdtv() {
        return hdtv;
    }

    public void setHdtv(Boolean hdtv) {
        this.hdtv = hdtv;
    }

    public Boolean getLetterbox() {
        return letterbox;
    }

    public void setLetterbox(Boolean letterbox) {
        this.letterbox = letterbox;
    }

    public Boolean getDvs() {
        return dvs;
    }

    public void setDvs(Boolean dvs) {
        this.dvs = dvs;
    }

    public Boolean getNewAiring() {
        return newAiring;
    }

    public void setNewAiring(Boolean newAiring) {
        this.newAiring = newAiring;
    }

    public Boolean getEnhanced() {
        return enhanced;
    }

    public void setEnhanced(Boolean enhanced) {
        this.enhanced = enhanced;
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

    public Boolean getIs3d() {
        return is3d;
    }

    public void setIs3d(Boolean is3d) {
        this.is3d = is3d;
    }

    public Boolean getCc() {
        return cc;
    }

    public void setCc(Boolean cc) {
        this.cc = cc;
    }

    public DolbyAudioType getDolby() {
        return dolby;
    }

    public void setDolby(DolbyAudioType dolby) {
        this.dolby = dolby;
    }

    public Boolean getStereo() {
        return stereo;
    }

    public void setStereo(Boolean stereo) {
        this.stereo = stereo;
    }

    public Boolean getSubtitled() {
        return subtitled;
    }

    public void setSubtitled(Boolean subtitled) {
        this.subtitled = subtitled;
    }

    public String getSubtitledLanguage() {
        return subtitledLanguage;
    }

    public void setSubtitledLanguage(String subtitledLanguage) {
        this.subtitledLanguage = subtitledLanguage;
    }

    public Boolean getSap() {
        return sap;
    }

    public void setSap(Boolean sap) {
        this.sap = sap;
    }

    public String getSapLanguage() {
        return sapLanguage;
    }

    public void setSapLanguage(String sapLanguage) {
        this.sapLanguage = sapLanguage;
    }

    public Boolean getHasLanguageRating() {
        return hasLanguageRating;
    }

    public void setHasLanguageRating(Boolean hasLanguageRating) {
        this.hasLanguageRating = hasLanguageRating;
    }

    public Boolean getHasDialogRating() {
        return hasDialogRating;
    }

    public void setHasDialogRating(Boolean hasDialogRating) {
        this.hasDialogRating = hasDialogRating;
    }

    public Boolean getHasViolenceRating() {
        return hasViolenceRating;
    }

    public void setHasViolenceRating(Boolean hasViolenceRating) {
        this.hasViolenceRating = hasViolenceRating;
    }

    public Boolean getHasFantasyViolenceRating() {
        return hasFantasyViolenceRating;
    }

    public void setHasFantasyViolenceRating(Boolean hasFantasyViolenceRating) {
        this.hasFantasyViolenceRating = hasFantasyViolenceRating;
    }

    public Boolean getHasSexRating() {
        return hasSexRating;
    }

    public void setHasSexRating(Boolean hasSexRating) {
        this.hasSexRating = hasSexRating;
    }

    public Rating getTvRating() {
        return tvRating;
    }

    public void setTvRating(Rating tvRating) {
        this.tvRating = tvRating;
    }

    public String getSyndicationOriginatingSource() {
        return syndicationOriginatingSource;
    }

    public void setSyndicationOriginatingSource(String syndicationOriginatingSource) {
        this.syndicationOriginatingSource = syndicationOriginatingSource;
    }

    public SyndicationType getSyndicationType() {
        return syndicationType;
    }

    public void setSyndicationType(SyndicationType syndicationType) {
        this.syndicationType = syndicationType;
    }

    public Boolean getCableInTheClassRoom() {
        return cableInTheClassRoom;
    }

    public void setCableInTheClassRoom(Boolean cableInTheClassRoom) {
        this.cableInTheClassRoom = cableInTheClassRoom;
    }

    public Boolean getDubbed() {
        return dubbed;
    }

    public void setDubbed(Boolean dubbed) {
        this.dubbed = dubbed;
    }

    public String getDubbedLanguage() {
        return dubbedLanguage;
    }

    public void setDubbedLanguage(String dubbedLanguage) {
        this.dubbedLanguage = dubbedLanguage;
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

    public Integer getNumberOfParts() {
        return numberOfParts;
    }

    public void setNumberOfParts(Integer numberOfParts) {
        this.numberOfParts = numberOfParts;
    }

    public Integer getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    public Boolean getSubjectToBlackout() {
        return subjectToBlackout;
    }

    public void setSubjectToBlackout(Boolean subjectToBlackout) {
        this.subjectToBlackout = subjectToBlackout;
    }
}
