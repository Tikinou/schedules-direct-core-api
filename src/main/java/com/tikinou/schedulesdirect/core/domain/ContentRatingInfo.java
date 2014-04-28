package com.tikinou.schedulesdirect.core.domain;

import com.fasterxml.jackson.annotation.JsonAnySetter;

/**
 * @author Sebastien Astie
 */
public class ContentRatingInfo {
    private String body;
    private String code;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
