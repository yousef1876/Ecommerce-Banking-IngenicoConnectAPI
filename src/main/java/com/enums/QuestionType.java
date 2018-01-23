package com.enums;


public enum QuestionType {
	Text("text"),
    Choice("choice");

    private String url;

    QuestionType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
