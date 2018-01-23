package com.enums;

public enum IssueType {
	HIGH("high"),
    advance("advance"),
    LOW("low");

    private String url;

    IssueType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
