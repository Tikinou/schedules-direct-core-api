package com.tikinou.schedulesdirect.core.commands.lineup;

import com.tikinou.schedulesdirect.core.HttpMethod;

/**
 * @author Sebastien Astie
 */
public abstract class AbstractAddLineupCommand extends AbstractLineupManagementCommand {
    public AbstractAddLineupCommand() {
        super(HttpMethod.PUT);
    }
}
