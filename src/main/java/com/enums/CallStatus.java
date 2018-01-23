package com.enums;


public enum CallStatus {

    end("end"),
    start("start"),
    delayTo("delayTo");

    private String url;

    CallStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
