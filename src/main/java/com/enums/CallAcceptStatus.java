package com.enums;

public enum CallAcceptStatus {

    initial("initial"),
    fullAccepted("fullAccepted"),
    Rejected("Rejected");

    private String url;

    CallAcceptStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
