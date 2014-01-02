/*
 * Copyright (c) 2013 Tikinou LLC
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

package com.tikinou.schedulesdirect.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.codec.digest.DigestUtils;
import org.joda.time.DateTime;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Credentials {
    private String username;
    private String password;
    private String randhash;
    private DateTime randhashDateTime;
    @JsonIgnore
    private String clearPassword;

    public Credentials(){
    }

    public Credentials(String username, String password){
        this(username, password, null, null);
    }

    public Credentials(String username, String password, String randhash, DateTime randhashDateTime){
        this.username = username;
        this.clearPassword = password;
        this.randhash = randhash;
        this.randhashDateTime = randhashDateTime;
        if(clearPassword != null)
            this.password = DigestUtils.sha1Hex(clearPassword);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRandhash() {
        return randhash;
    }

    public void setRandhash(String randhash) {
        this.randhash = randhash;
    }

    public DateTime getRandhashDateTime() {
        return randhashDateTime;
    }

    public void setRandhashDateTime(DateTime randhashDateTime) {
        this.randhashDateTime = randhashDateTime;
    }

    public String getClearPassword() {
        return clearPassword;
    }

    public void setClearPassword(String clearPassword) {
        this.clearPassword = clearPassword;
        if(clearPassword != null)
            password = DigestUtils.sha1Hex(clearPassword);
    }

    public boolean sameUserNamePassword(Credentials credentials) {
        if (credentials == null)
            return false;
        if (username == null)
            return false;
        if (clearPassword == null)
            return false;
        return username.equals(credentials.username) && clearPassword.equals(credentials.clearPassword);
    }

    public boolean isOlderThan(int hours) {
        if (randhash == null || randhashDateTime == null)
            return true;
        return randhashDateTime.isBefore(DateTime.now().minusHours(hours));
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + clearPassword + '\'' +
                ", randhash='" + randhash + '\'' +
                ", randhashDateTime=" + randhashDateTime +
                '}';
    }
}
