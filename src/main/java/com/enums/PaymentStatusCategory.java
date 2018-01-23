package com.enums;

public enum PaymentStatusCategory {


    CREATED("CREATED"),
    REJECTED("REJECTED"),
    CAPTURE("Confirmed"),REJECTEDREFUND("NotPaid"),REJECTEDPAYOUT("Received"),CANCELLED("Sent"),PENDINGPAYMENT("PENDINGPAYMENT"),
    ACCOUNTVERIFIED("ACCOUNTVERIFIED"),PENDINGFRAUDAPPROVAL("PENDINGFRAUDAPPROVAL"),PENDINGAPPROVAL("PENDINGAPPROVAL"),
    AUTHORIZATIONREQUESTED("AUTHORIZATIONREQUESTED"),CAPTUREREQUESTED("CAPTUREREQUESTED"),REFUNDREQUESTED("REFUNDREQUESTED"),
    PAYOUTREQUESTED("PAYOUTREQUESTED"),CAPTURED("CAPTURED"),PAID("PAID"),ACCOUNTCREDITED("ACCOUNTCREDITED"),REVERSED("REVERSED"),
    CHARGEBACKED("CHARGEBACKED"),REFUNDED("REFUNDED");

    private String url;

    PaymentStatusCategory(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}