package com.enums;

public enum CreateInvoiceStatus {

    In_Process("In_Process"),
    SENT("SENT"),
    READY("READY"), PAID("PAID"), Write_Off("Write_Off"),Cancel("cancel");

    private String url;

    CreateInvoiceStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
