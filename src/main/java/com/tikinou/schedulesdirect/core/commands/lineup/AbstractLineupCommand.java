package com.tikinou.schedulesdirect.core.commands.lineup;

import com.tikinou.schedulesdirect.core.HttpMethod;
import com.tikinou.schedulesdirect.core.commands.AbstractBaseCommand;

/**
 * @author Sebastien Astie.
 */
public abstract class AbstractLineupCommand extends AbstractBaseCommand{
    public AbstractLineupCommand(HttpMethod method){
        super("lineups", method);
    }
}
