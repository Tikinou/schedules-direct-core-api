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

package com.tikinou.schedulesdirect.core.commands.lineup;

import com.tikinou.schedulesdirect.core.HttpMethod;

/**
 * @author Sebastien Astie.
 */
public abstract class AbstractGetLineupDetailsCommand extends AbstractLineupCommand implements GetLineupDetailsCommand {
    private LineupCommandParameters parameters;
    private GetLineupDetailsResult results;

    public AbstractGetLineupDetailsCommand() {
        super(HttpMethod.GET);
    }

    @Override
    public void setParameters(LineupCommandParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public LineupCommandParameters getParameters() {
        return parameters;
    }

    @Override
    public void setResults(GetLineupDetailsResult results) {
        this.results = results;
    }

    @Override
    public GetLineupDetailsResult getResults() {
        return results;
    }
}
