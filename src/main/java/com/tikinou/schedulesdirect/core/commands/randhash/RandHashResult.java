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

package com.tikinou.schedulesdirect.core.commands.randhash;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tikinou.schedulesdirect.core.commands.BaseCommandResult;
import com.tikinou.schedulesdirect.core.domain.Credentials;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RandHashResult extends BaseCommandResult {
    private String randhash;

    public String getRandhash() {
        return randhash;
    }

    public void setRandhash(String randhash) {
        this.randhash = randhash;
    }

    @Override
    public String toString() {
        return "RandHashResult{" + toStringMembers() + '}';
    }

    @Override
    protected String toStringMembers() {
        return super.toStringMembers() + ", randhash='" + randhash + '\'';
    }
}
