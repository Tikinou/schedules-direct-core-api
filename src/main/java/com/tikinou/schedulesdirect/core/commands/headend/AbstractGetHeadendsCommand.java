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

package com.tikinou.schedulesdirect.core.commands.headend;

import com.tikinou.schedulesdirect.core.HttpMethod;
import com.tikinou.schedulesdirect.core.commands.AbstractBaseCommand;

/**
 * @author Sebastien Astie.
 */
public abstract class AbstractGetHeadendsCommand extends AbstractBaseCommand implements GetHeadendsCommand {
    private GetHeadendsParameters parameters;
    private GetHeadendsResult results;

    public AbstractGetHeadendsCommand(){
        super("headends", HttpMethod.GET);
    }

    @Override
    public void setParameters(GetHeadendsParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public GetHeadendsParameters getParameters() {
        return parameters;
    }

    @Override
    public void setResults(GetHeadendsResult results) {
        this.results = results;
    }

    @Override
    public GetHeadendsResult getResults() {
        return results;
    }
}
