package com.enums;

public enum CasePriority {

    HIGH("high"),
    advance("advance"),
    LOW("low");

    private String url;

    CasePriority(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
