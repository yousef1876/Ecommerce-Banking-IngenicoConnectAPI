package com.enums;

public enum AbstractPaymentMethod {

    CREDITCARD("credit"),
    EXPRESSUSA("amercian-express"),
    PAYPAL("paypal"),MoneyOnBank("MONBANK");

    private String url;

    AbstractPaymentMethod(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
