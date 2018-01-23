package com.enums;

public enum JobQueueStatus {

    Success("success"),Errors("errors"),
    failed("failed"),suspended("suspended"),delay("delay");

    private String url;

    JobQueueStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
