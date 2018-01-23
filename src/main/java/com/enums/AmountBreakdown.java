package com.enums;

public enum AmountBreakdown {
    AIRPORT_TAX ("AIRPORT_TAX"),
    CONSUMPTION_TAX ("CONSUMPTION_TAX"),
    DISCOUNT("DISCOUNT"),DUTY("DUTY"),SHIPPING("SHIPPING"),VAT("VAT");

    private String url;

    AmountBreakdown(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
