package com.enums;

public enum JobType {
	FULLTIME("FULLTIME"),
    PARTTIME("PARTTIME");

    private String url;

    JobType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
