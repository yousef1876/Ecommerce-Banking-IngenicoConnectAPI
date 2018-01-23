package com.enums;

public enum LeaveType {
	SICK("sick"),
    PERSONAL("personal"),BUSINESS("business");

    private String url;

    LeaveType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
