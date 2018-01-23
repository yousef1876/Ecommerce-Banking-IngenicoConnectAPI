package com.enums;

public enum SkillLevel {
	EXPERT("EXPERT"),
    ADVANCE("ADVANCE"),
    BEGINNER("BEGINNER");

    private String url;

    SkillLevel(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
