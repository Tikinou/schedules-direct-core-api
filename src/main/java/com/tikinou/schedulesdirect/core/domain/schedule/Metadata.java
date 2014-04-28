package com.tikinou.schedulesdirect.core.domain.schedule;

import org.joda.time.DateTime;

/**
 * @author Sebastien Astie.
 */
public class Metadata {
    private DateTime startDate;
    private DateTime endDate;

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
