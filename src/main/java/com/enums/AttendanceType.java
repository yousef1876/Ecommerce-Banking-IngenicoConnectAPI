package com.enums;

public enum AttendanceType {


    VACATION("vacation"),
    PERSONAL("personal"),SICK("sick"),
    WORKSHIFT("work_shift");

    private String url;

    AttendanceType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
