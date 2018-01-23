package com.enums;


public enum ApplicantDocType {

    certificate("certificate"),
    university("university"),recommendation("recommendation"),
    CV("CV");

    private String url;

    ApplicantDocType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
