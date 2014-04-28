package com.tikinou.schedulesdirect.core.domain.lineup;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Sebastien Astie
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BasicLineupInfo {
    private String uri;
    private String name;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
