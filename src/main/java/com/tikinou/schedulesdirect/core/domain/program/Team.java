package com.tikinou.schedulesdirect.core.domain.program;

/**
 * @author Sebastien Astie
 */
public class Team {
    private String name;
    private Boolean isHome;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsHome() {
        return isHome;
    }

    public void setIsHome(Boolean isHome) {
        this.isHome = isHome;
    }
}
