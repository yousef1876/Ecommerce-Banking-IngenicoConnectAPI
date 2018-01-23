package com.enums;

public enum UniversityDegreeTyped {
	Bachlorse("Bachlorse"),
    MASTER("MASTER"),
    DOCTOR("DOCTOR"),
    DIPLOMA("DIPLOMA");

    private String url;

    UniversityDegreeTyped(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
