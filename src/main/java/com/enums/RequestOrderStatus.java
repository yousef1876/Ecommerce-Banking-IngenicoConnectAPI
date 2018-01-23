package com.enums;

public enum RequestOrderStatus {


    Draft("Draft"),
    Rejected("Rejected"),
    Cancelled("Cancelled"),Submitted("Submitted"),Reviewed("Reviewed"),Completed("Completed")
    ,Reopened("Reopened"),Pending("Pending");

    private String url;

    RequestOrderStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
