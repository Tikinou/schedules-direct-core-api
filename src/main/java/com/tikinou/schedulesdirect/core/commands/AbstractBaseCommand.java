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

package com.tikinou.schedulesdirect.core.commands;

import com.tikinou.schedulesdirect.core.Command;
import com.tikinou.schedulesdirect.core.HttpMethod;
import com.tikinou.schedulesdirect.core.SchedulesDirectClient;
import com.tikinou.schedulesdirect.core.domain.CommandStatus;

/**
 * @author Sebastien Astie
 */
public abstract class AbstractBaseCommand implements Command {
    private CommandStatus commandStatus;
    private HttpMethod httpMethod;
    private String endPoint;

    public AbstractBaseCommand(String commandEndPoint, HttpMethod method){
        this.endPoint = commandEndPoint;
        this.httpMethod = method;
    }

    @Override
    public CommandStatus getStatus() {
        return commandStatus;
    }

    @Override
    public void setStatus(CommandStatus status) {
        this.commandStatus = status;
    }

    @Override
    public HttpMethod getMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public String getEndPoint() {
        return endPoint;
    }

    @Override
    public void execute(SchedulesDirectClient client) {
        execute(client, 0);
    }
}
