package com.enums;

public enum GenderType {
    MALE("male"),
    FEMALE("female");

    private String url;

    GenderType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}