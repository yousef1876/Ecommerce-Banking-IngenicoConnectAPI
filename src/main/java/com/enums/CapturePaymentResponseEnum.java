package com.enums;

public enum CapturePaymentResponseEnum {

    AUTHORIZATION_REQUESTED("AUTHORIZATION_REQUESTED"),
    CAPTURE_REQUESTED("CAPTURE_REQUESTED"),
    CAPTURED("CAPTURED"),CANCELLED("CANCELLED"),REJECTED_CAPTURE("REJECTED_CAPTURE"),REVERSED("REVERSED");

    private String url;

    CapturePaymentResponseEnum(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
