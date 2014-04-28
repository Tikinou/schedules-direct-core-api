package com.tikinou.schedulesdirect.core.domain.program;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
public class Recommendation {
    @JsonProperty("programID")
    private String programId;
    private String title120;

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getTitle120() {
        return title120;
    }

    public void setTitle120(String title120) {
        this.title120 = title120;
    }
}
