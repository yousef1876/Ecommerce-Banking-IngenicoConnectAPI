package com.enums;

public enum CVVResultFraudResult {

    M("CVV successful , valid"),
    N("CVV unsuccessful , invalid"),
    P("CVV , not performed"),S("Cardholder claims no CVV"),U("Issuer_not_certified"),Y("Server_not respond"),
    ZERO("No service");

    private String url;

    CVVResultFraudResult(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
