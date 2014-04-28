package com.tikinou.schedulesdirect.core.domain.program;

/**
 * @author Sebastien Astie
 */
public class Image {
    private String uri;
    private String dimension;

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
