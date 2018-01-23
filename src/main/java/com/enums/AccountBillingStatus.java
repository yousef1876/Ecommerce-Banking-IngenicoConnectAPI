package com.enums;

public enum AccountBillingStatus {

    Blocked("Blocked"),
    Cancel("Cancel"),
    Ready("Ready"),Read("Read"),Read_Write("Read_Write");

    private String url;

    AccountBillingStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
