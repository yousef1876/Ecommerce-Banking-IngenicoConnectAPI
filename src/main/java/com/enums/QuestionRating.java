package com.enums;

public enum QuestionRating {
    HOLD("HOLD"),
    YES("YES"),NO("NO");

    private String url;

    QuestionRating(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}