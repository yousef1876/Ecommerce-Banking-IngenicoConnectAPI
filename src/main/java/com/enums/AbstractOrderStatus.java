package com.enums;

public enum AbstractOrderStatus {


    Blocked("Blocked"),
    Cancel("Cancel"),
    Ready("Ready"),Read("Read"),Read_Write("Read_Write");

    private String url;

    AbstractOrderStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
