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

package com.tikinou.schedulesdirect.core.commands.message;

import com.tikinou.schedulesdirect.core.CommandResult;
import com.tikinou.schedulesdirect.core.HttpMethod;
import com.tikinou.schedulesdirect.core.commands.AbstractBaseCommand;

/**
 * @author Sebastien Astie.
 */
public abstract class AbstractDeleteMessageCommand extends AbstractBaseCommand implements DeleteMessageCommand {
    private DeleteMessageCommandParameters parameters;
    private CommandResult results;

    public AbstractDeleteMessageCommand(){
        super("message", HttpMethod.DELETE);
    }

    @Override
    public void setParameters(DeleteMessageCommandParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public DeleteMessageCommandParameters getParameters() {
        return parameters;
    }

    @Override
    public void setResults(CommandResult results) {
        this.results = results;
    }

    @Override
    public CommandResult getResults() {
        return results;
    }
}
