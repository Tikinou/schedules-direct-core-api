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

package com.tikinou.schedulesdirect.core.commands.randhash;

import com.tikinou.schedulesdirect.core.commands.AbstractBaseCommand;

/**
 * @author Sebastien Astie.
 */
public abstract class AbstractRandhashCommand extends AbstractBaseCommand implements RandHashCommand {
    private RandHashParameters parameters;
    private RandHashResult results;

    @Override
    public void setParameters(RandHashParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public RandHashParameters getParameters() {
        return parameters;
    }

    @Override
    public void setResults(RandHashResult results) {
        this.results = results;
    }

    @Override
    public RandHashResult getResult() {
        return results;
    }
}
