package com.enums;

public enum RaceType {
	ASIA("asia"),
    WHITE("white"),
    BLACK("black"),
    AMERICA("america"),
    MIDDELEAST("middel_east");

    private String url;

    RaceType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
