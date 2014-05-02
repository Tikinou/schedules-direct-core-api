package com.tikinou.schedulesdirect.core.domain.program;

/**
 * @author Sebastien Astie
 */
public class Image {
    private String uri;
    private String dimension;
    private String md5;

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

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }
}
