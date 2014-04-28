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
import com.tikinou.schedulesdirect.core.domain.Country;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetHeadendsParameters extends AuthenticatedBaseCommandParameter{
    private Country country;
    @JsonProperty("postalcode")
    private String postalCode;

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
        return "GetHeadendsParameters{" + toStringMembers() + '}';
    }

    public GetHeadendsParameters(SchedulesDirectApiVersion version){
        super(version);
    }

    public GetHeadendsParameters(){
        this(null);
    }
    @Override
    protected String toStringMembers() {
        return super.toStringMembers() + ", country=" + country +
                ", postalCode='" + postalCode + '\'';
    }

    @Override
    public Map<String, String> toRequestParameters() {
        Map<String, String> map = new HashMap<>();
        if(postalCode != null)
            map.put("postalcode", postalCode);
        if(country != null)
            map.put("country", country.getCode());
        return map;
    }
}
