package com.enums;

public enum ProductQualityRating {
    Five("5"),
    Four("4"),Three("3"),Two("2"),One("1");

    private String url;

    ProductQualityRating(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
