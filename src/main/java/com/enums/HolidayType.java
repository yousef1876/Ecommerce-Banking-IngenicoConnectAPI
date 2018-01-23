package com.enums;

public enum HolidayType {
	SICK("sick"),
    BUSINESS("business"),
    PERSONAL("personal");

    private String url;

    HolidayType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
