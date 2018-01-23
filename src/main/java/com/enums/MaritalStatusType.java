package com.enums;

public enum MaritalStatusType {
	Single("single"),
    Married("married"),
    DEVORCE("devorce");

    private String url;

    MaritalStatusType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
