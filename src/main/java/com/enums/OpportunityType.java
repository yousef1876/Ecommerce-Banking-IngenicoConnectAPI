package com.enums;

public enum OpportunityType {


    FULL("full_time"),
    PART("advance"),
    ONLINE("low");

    private String url;

    OpportunityType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
