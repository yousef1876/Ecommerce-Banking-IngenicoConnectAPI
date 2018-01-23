package com.enums;

public enum LeadStatus {

    FULLTIME("FULLTIME"),
    PARTTIME("PARTTIME");

    private String url;

    LeadStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
