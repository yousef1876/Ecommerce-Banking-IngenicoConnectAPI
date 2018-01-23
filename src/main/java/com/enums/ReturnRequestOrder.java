package com.enums;

public enum ReturnRequestOrder {

    fromCustomer("fromCustomer"), fromVendor("fromVendor") ;


    private String url;

    ReturnRequestOrder(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
