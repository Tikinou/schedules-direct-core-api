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

package com.tikinou.schedulesdirect.core.domain.status;

import org.joda.time.DateTime;

import java.util.List;

/**
 * @author Sebastien Astie
 */
public class Account {
    private DateTime expires;
    private DateTime nextSuggestedConnectTime;
    private List<Message> messages;
    private Integer maxHeadends;

    public DateTime getExpires() {
        return expires;
    }

    public void setExpires(DateTime expires) {
        this.expires = expires;
    }

    public DateTime getNextSuggestedConnectTime() {
        return nextSuggestedConnectTime;
    }

    public void setNextSuggestedConnectTime(DateTime nextSuggestedConnectTime) {
        this.nextSuggestedConnectTime = nextSuggestedConnectTime;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Integer getMaxHeadends() {
        return maxHeadends;
    }

    public void setMaxHeadends(Integer maxHeadends) {
        this.maxHeadends = maxHeadends;
    }
}
