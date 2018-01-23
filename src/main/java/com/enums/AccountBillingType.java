package com.enums;

public enum AccountBillingType {

    Saved("superRole"),
    currentAccount("admin"),
    USER("user"),QUEST("quest"),Agent("agent");

    private String url;

    AccountBillingType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
