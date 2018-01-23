package com.enums;

public enum CaseStatus {

    OPEN("open"),
    CLOSE("closed"),
    SUSPEND("suspend");

    private String url;

    CaseStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
