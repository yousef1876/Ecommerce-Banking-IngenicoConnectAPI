package com.enums;

public enum Colors {

    RED("red"),
    BLUE("blue"),
    GREEN("green"),BLACK("black"),YELLOW("yellow");

    private String url;

    Colors(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
