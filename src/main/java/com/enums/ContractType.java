package com.enums;

public enum ContractType {

    YEARLY("YEARLY"),
    MONTHLY("MONTHLY"),
    DAILY("DAILY"), renewable("renewable");

    private String url;

    ContractType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
