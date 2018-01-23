package com.enums;

public enum AccountOnFileAttributeStatus {

    READ_ONLY("READ_ONLY"),
    CAN_WRITE("CAN_WRITE"),
    MUST_WRITE("MUST_WRITE");

    private String url;

    AccountOnFileAttributeStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
