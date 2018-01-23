package com.enums;

public enum ActionMerchants {

    SHOW_INSTRUCTIONS("SHOW_INSTRUCTIONS"),
    SHOW_TRANSACTION_RESULTS("SHOW_TRANSACTION_RESULTS");

    private final String name;

    private ActionMerchants(String value) {
        this.name = value;
    }

    public String value() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }


}
