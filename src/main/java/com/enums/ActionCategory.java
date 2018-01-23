package com.enums;

public enum ActionCategory {


    VIEWED("viewed"),
    EDIT("edit"),
    DELETED("deleted");

    private final String name;

    private ActionCategory(String value) {
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
