package com.tikinou.schedulesdirect.core;

import com.tikinou.schedulesdirect.core.domain.CommandStatus;
import com.tikinou.schedulesdirect.core.exceptions.ValidationException;

/**
 * @author Sebastien Astie
 */
public interface Command {
    public HttpMethod getMethod();

    public void execute(SchedulesDirectClient client);

    public CommandStatus getStatus();

    public void setStatus(CommandStatus status);

    public void validateParameters() throws ValidationException;

    public String getEndPoint();
}
