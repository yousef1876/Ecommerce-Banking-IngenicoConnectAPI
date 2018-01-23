package com.enums;

public enum IdentificationType {
	PASSPORT("passport"),
    ID("id"),
    RESIDENENTCARDE("resident-card"),
    TEMPORARYCARD("temp-card"),
    STUDENTCARD("student-card");

    private String url;

    IdentificationType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
