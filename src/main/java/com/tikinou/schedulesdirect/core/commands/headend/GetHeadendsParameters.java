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

package com.tikinou.schedulesdirect.core.commands.headend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tikinou.schedulesdirect.core.commands.AuthenticatedBaseCommandParameter;
import com.tikinou.schedulesdirect.core.domain.ActionType;
import com.tikinou.schedulesdirect.core.domain.Country;
import com.tikinou.schedulesdirect.core.domain.ObjectTypes;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetHeadendsParameters extends AuthenticatedBaseCommandParameter{

    private Request request;

    public GetHeadendsParameters(SchedulesDirectApiVersion version){
        super(ObjectTypes.HEADENDS, ActionType.GET, version);
        request = new Request();
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Boolean getSubscribed() {
        return request.getSubscribed();
    }

    public void setSubscribed(Boolean subscribed) {
        request.setSubscribed(subscribed);
    }

    public Country getCountry() {
        return request.getCountry();
    }

    public void setCountry(Country country) {
        request.setCountry(country);
    }

    public String getPostalCode() {
        return request.getPostalCode();
    }

    public void setPostalCode(String postalCode) {
        request.setPostalCode(postalCode);
    }

    @Override
    public String toString() {
        return "GetHeadendsParameters{" + toStringMembers() + '}';
    }

    @Override
    protected String toStringMembers() {
        return super.toStringMembers() + ", request=" + request;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class Request {
        private Country country;
        @JsonProperty("postalcode")
        private String postalCode;
        @JsonIgnore
        private Boolean subscribed;

        public Boolean getSubscribed() {
            return subscribed;
        }

        public void setSubscribed(Boolean subscribed) {
            this.subscribed = subscribed;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        @Override
        public String toString() {
            return "Request{" +
                    "country=" + country +
                    ", postalCode='" + postalCode + '\'' +
                    ", subscribed=" + subscribed +
                    '}';
        }
    }
}
