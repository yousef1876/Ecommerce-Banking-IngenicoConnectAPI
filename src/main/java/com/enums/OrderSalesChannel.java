package com.enums;

public enum OrderSalesChannel {


    WebChannel("WebChannel"),
    FaxChannel("FaxChannel"),
    PhoneChannel("PhoneChannel"),EmailChannel("EmailChannel"),eBayChannel("eBayChannel");

    private String url;

    OrderSalesChannel(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
