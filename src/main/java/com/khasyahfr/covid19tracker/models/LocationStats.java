package com.khasyahfr.covid19tracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int diffCases;

    public int getDiffCases() {
        return diffCases;
    }

    public void setDiffCases(int diffCases) {
        this.diffCases = diffCases;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }
}
