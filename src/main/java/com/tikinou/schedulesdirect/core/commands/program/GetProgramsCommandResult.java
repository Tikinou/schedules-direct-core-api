package com.tikinou.schedulesdirect.core.commands.program;

import com.tikinou.schedulesdirect.core.commands.BaseCommandResult;
import com.tikinou.schedulesdirect.core.domain.program.ProgramSD;

import java.util.List;

/**
 * @author Sebastien Astie
 */
public class GetProgramsCommandResult extends BaseCommandResult {
    private List<ProgramSD> programs;

    public List<ProgramSD> getPrograms() {
        return programs;
    }

    public void setPrograms(List<ProgramSD> programs) {
        this.programs = programs;
    }
}
