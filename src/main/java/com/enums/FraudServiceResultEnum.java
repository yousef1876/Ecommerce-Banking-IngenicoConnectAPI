package com.enums;

public enum FraudServiceResultEnum {

    accepted("accepted"),
    challenged("challenged"),denied("denied"),no_advice("no_advice")
    ,error ("error");

    private String url;

    FraudServiceResultEnum(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
