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

package com.tikinou.schedulesdirect.core.commands;

import com.tikinou.schedulesdirect.core.Command;
import com.tikinou.schedulesdirect.core.CommandResult;
import com.tikinou.schedulesdirect.core.SchedulesDirectClient;
import com.tikinou.schedulesdirect.core.domain.ActionType;
import com.tikinou.schedulesdirect.core.domain.ObjectTypes;
import com.tikinou.schedulesdirect.core.domain.SchedulesDirectApiVersion;
import com.tikinou.schedulesdirect.core.exceptions.ValidationException;

/**
 * @author Sebastien Astie
 */
public abstract class AbstractBaseCommand<P,R extends CommandResult> implements Command<P,R> {
    private P parameters;
    private R results;
    private ActionType actionType;
    private ObjectTypes objectType;
    private SchedulesDirectApiVersion version;

    protected void initialize(ActionType actionType, ObjectTypes objectType, SchedulesDirectApiVersion version){
        this.actionType = actionType;
        this.objectType = objectType;
        this.version = version;
    }

    protected abstract void validateParameters(P parameters) throws ValidationException;

    @Override
    public void setParameters(P parameters) {
        this.parameters = parameters;
    }

    @Override
    public P getParameters() {
        return parameters;
    }

    @Override
    public void setResults(R results) {
        this.results = results;
    }

    @Override
    public R getResult() {
        return results;
    }

    @Override
    public ActionType getActionType() {
        return actionType;
    }

    @Override
    public ObjectTypes getObjectType() {
        return objectType;
    }

    @Override
    public SchedulesDirectApiVersion getVersion() {
        return version;
    }
}
