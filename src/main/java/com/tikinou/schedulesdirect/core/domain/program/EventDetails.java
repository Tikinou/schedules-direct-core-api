package com.tikinou.schedulesdirect.core.domain.program;

import org.joda.time.DateTime;

import java.util.List;

/**
 * @author Sebastien Astie
 */
public class EventDetails {
    private ShowType subType;
    private String venue;
    private List<Team> teams;
    private DateTime gameDate;

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public ShowType getSubType() {
        return subType;
    }

    public void setSubType(ShowType subType) {
        this.subType = subType;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public DateTime getGameDate() {
        return gameDate;
    }

    public void setGameDate(DateTime gameDate) {
        this.gameDate = gameDate;
    }
}
