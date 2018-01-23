package com.enums;

public enum PaymentStatus {

    Cancelled("Cancelled"),
    Voided("Voided"),
    Confirmed("Confirmed"),NotPaid("NotPaid"),Received("Received"),Sent("Sent"),;

    private String url;

    PaymentStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
