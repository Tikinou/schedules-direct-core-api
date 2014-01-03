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

package com.tikinou.schedulesdirect.core.commands.status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tikinou.schedulesdirect.core.commands.BaseCommandResult;
import com.tikinou.schedulesdirect.core.domain.status.Account;
import com.tikinou.schedulesdirect.core.domain.status.Headend;
import com.tikinou.schedulesdirect.core.domain.status.SystemStatus;
import org.joda.time.DateTime;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetStatusResult extends BaseCommandResult {
    private Account account;
    @JsonProperty("headend")
    private List<Headend> headends;
    private DateTime lastDataUpdate;
    private List<String> notifications;
    private List<SystemStatus> systemStatus;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Headend> getHeadends() {
        return headends;
    }

    public void setHeadends(List<Headend> headends) {
        this.headends = headends;
    }

    public DateTime getLastDataUpdate() {
        return lastDataUpdate;
    }

    public void setLastDataUpdate(DateTime lastDataUpdate) {
        this.lastDataUpdate = lastDataUpdate;
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }

    public List<SystemStatus> getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(List<SystemStatus> systemStatus) {
        this.systemStatus = systemStatus;
    }

    @Override
    public String toString() {
        return "GetStatusResult{" + toStringMembers() + '}';
    }

    @Override
    protected String toStringMembers() {
        return super.toStringMembers( ) +
                ", account=" + account +
                ", headends=" + (headends != null ? Arrays.toString(headends.toArray()) : headends) +
                ", lastDataUpdate=" + lastDataUpdate +
                ", notifications=" + (notifications != null ? Arrays.toString(notifications.toArray()) : notifications) +
                ", systemStatus=" + (systemStatus != null ? Arrays.toString(systemStatus.toArray()) : systemStatus);
    }
}
