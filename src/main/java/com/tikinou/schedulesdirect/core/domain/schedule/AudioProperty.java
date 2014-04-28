package com.tikinou.schedulesdirect.core.domain.schedule;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Sebastien Astie
 */
public enum AudioProperty {
    DVS("dvs"), //Descriptive Video Service
    CC("cc"), //Close Caption
    Dolby("Dolby"),
    DolbyDigital("DD"),
    DolbyDigital51("DD 5.1"),
    Dubbed("dubbed"),
    Stereo("stereo"),
    Subtitled("subtitled"),
    Surround("surround");

    public String getKey(){
        return key;
    }
    private final String key;
    private AudioProperty(String key){
        this.key = key;
    }

    @JsonCreator
    public static AudioProperty fromKey(String key){
        if(key == null)
            return null;
        switch(key){
            case "dvs":
                return DVS;
            case "cc":
                return CC;
            case "Dolby":
                return Dolby;
            case "DD":
                return DolbyDigital;
            case "DD 5.1":
                return DolbyDigital51;
            case "dubbed":
                return Dubbed;
            case "stereo":
                return Stereo;
            case "subtitled":
                return Subtitled;
            case "surround":
                return Surround;
            default:
                return null;
        }
    }

}
