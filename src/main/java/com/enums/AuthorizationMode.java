package com.enums;

public enum AuthorizationMode {

    FINAL_AUTHORISATION("FINAL_AUTHORISATION"),
    PRE_AUTHORISATION("PRE_AUTHORISATION");

    private String url;

    AuthorizationMode(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
