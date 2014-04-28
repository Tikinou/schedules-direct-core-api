package com.tikinou.schedulesdirect.core.commands.lineup;

import com.tikinou.schedulesdirect.core.HttpMethod;

/**
 * @author Sebastien Astie
 */
public abstract class AbstractDeleteLineupCommand extends AbstractLineupManagementCommand {
    public AbstractDeleteLineupCommand() {
        super(HttpMethod.DELETE);
    }
}
