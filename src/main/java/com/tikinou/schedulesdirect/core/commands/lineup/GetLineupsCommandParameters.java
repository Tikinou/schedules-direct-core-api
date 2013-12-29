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

package com.tikinou.schedulesdirect.core.commands.lineup;

import java.util.List;

/**
 * @author Sebastien Astie
 */
public class GetLineupsCommandParameters {
    private List<String> lineupIds;

    public List<String> getLineupIds() {
        return lineupIds;
    }

    public void setLineupIds(List<String> lineupIds) {
        this.lineupIds = lineupIds;
    }
}
