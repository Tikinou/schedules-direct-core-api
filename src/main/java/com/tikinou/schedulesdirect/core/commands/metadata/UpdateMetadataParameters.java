/*
 * Copyright (c) 2013 TIKINOU LLC
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

package com.tikinou.schedulesdirect.core.commands.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tikinou.schedulesdirect.core.commands.AuthenticatedBaseCommandParameter;
import com.tikinou.schedulesdirect.core.domain.ActionType;
import com.tikinou.schedulesdirect.core.domain.ObjectTypes;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UpdateMetadataParameters extends AuthenticatedBaseCommandParameter{
    private Request request;

    public UpdateMetadataParameters(SchedulesDirectApiVersion version){
        super(ObjectTypes.METADATA, ActionType.UPDATE, version);
        request = new Request();
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getProgramId() {
        return request.getProgramId();
    }

    public void setProgramId(String programId) {
        request.setProgramId(programId);
    }

    public String getCurrent() {
        return request.getCurrent();
    }

    public void setCurrent(String current) {
        request.setCurrent(current);
    }

    public String getSuggested() {
        return request.getSuggested();
    }

    public void setSuggested(String suggested) {
        request.setSuggested(suggested);
    }

    public String getField() {
        return request.getField();
    }

    public void setField(String field) {
        request.setField(field);
    }

    public String getSource() {
        return request.getSource();
    }

    public void setSource(String source) {
        request.setSource(source);
    }

    public String getComment() {
        return request.getComment();
    }

    public void setComment(String comment) {
        request.setComment(comment);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private static class Request {
        @JsonProperty("prog_id")
        private String programId;
        private String current;
        private String suggested;
        private String field;
        private String source;
        private String comment;

        public String getProgramId() {
            return programId;
        }

        public void setProgramId(String programId) {
            this.programId = programId;
        }

        public String getCurrent() {
            return current;
        }

        public void setCurrent(String current) {
            this.current = current;
        }

        public String getSuggested() {
            return suggested;
        }

        public void setSuggested(String suggested) {
            this.suggested = suggested;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
    }
}
