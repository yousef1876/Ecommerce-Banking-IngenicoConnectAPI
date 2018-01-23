package com.enums;

public enum AccountsAuthsTypes {

    super_role("superRole"),
    ADMINISTRATOR("admin"),
    USER("user"),QUEST("quest");

    private String url;

    AccountsAuthsTypes(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
