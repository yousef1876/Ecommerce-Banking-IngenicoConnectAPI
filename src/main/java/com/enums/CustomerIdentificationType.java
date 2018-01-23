package com.enums;

public enum CustomerIdentificationType {
	PASSPORT("passport"),
    ID("id"),
    RESIDENENTCARDE("resident-card"),
    TEMPORARYCARD("temp-card"),
    STUDENTCARD("student-card");

    private String url;

    CustomerIdentificationType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
