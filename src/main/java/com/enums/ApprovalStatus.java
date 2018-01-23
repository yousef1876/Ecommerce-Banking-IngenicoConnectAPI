package com.enums;

public enum ApprovalStatus {

    REJECTED("REJECTED"),
    ACCEPTED("ACCEPTED"),
    SUSPENDED("SUSPENDED");

    private final String name;

    private ApprovalStatus(String value) {
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
