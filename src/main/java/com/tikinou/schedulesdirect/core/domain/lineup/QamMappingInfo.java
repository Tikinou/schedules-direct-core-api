package com.tikinou.schedulesdirect.core.domain.lineup;

import org.joda.time.DateTime;

/**
 * @author Sebastien Astie
 */
public class QamMappingInfo {
    private String mapping;
    private DateTime modified;

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    public DateTime getModified() {
        return modified;
    }

    public void setModified(DateTime modified) {
        this.modified = modified;
    }
}
