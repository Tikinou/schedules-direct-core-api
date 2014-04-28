package com.tikinou.schedulesdirect.core.domain.schedule;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Sebastien Astie
 */
public enum VideoProperty {
    _3D("3d"),
    Enhanced("enhanced"), //better resolution than standard def, but not as good as high def
    HDTV("hdtv"),
    Letterbox("letterbox"),
    SDTV("sdtv");

    public String getKey() {
        return key;
    }

    private final String key;

    private VideoProperty(String key) {
        this.key = key;
    }

    @JsonCreator
    public static VideoProperty fromKey(String key) {
        if (key == null)
            return null;

        switch (key) {
            case "3d":
                return _3D;
            case "enhanced":
                return Enhanced;
            case "hdtv":
                return HDTV;
            case "letterbox":
                return Letterbox;
            case "sdtv":
                return SDTV;
            default:
                return null;
        }
    }
}