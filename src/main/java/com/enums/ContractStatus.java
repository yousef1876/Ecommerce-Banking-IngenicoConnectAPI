package com.enums;


public enum ContractStatus {

    renew("renew"),
    newContract("newContract"),
    Open("Open"),Closed("Closed");

    private String url;

    ContractStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
