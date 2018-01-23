package com.enums;

public enum AclType {

    USER("INSERTED"),
    GROUP("UPDATED");

    private final String name;

    private AclType(String value) {
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
