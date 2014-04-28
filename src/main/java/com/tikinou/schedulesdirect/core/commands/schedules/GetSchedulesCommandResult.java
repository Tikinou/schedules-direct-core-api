package com.tikinou.schedulesdirect.core.commands.schedules;

import com.tikinou.schedulesdirect.core.commands.BaseCommandResult;
import com.tikinou.schedulesdirect.core.domain.schedule.ScheduleSD;

import java.util.List;

/**
 * @author Sebastien Astie
 */
public class GetSchedulesCommandResult extends BaseCommandResult {
    private List<ScheduleSD> schedules;

    public List<ScheduleSD> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<ScheduleSD> schedules) {
        this.schedules = schedules;
    }
}
