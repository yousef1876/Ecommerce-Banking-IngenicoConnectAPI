package com.enums;

public enum FraudServiceResult {

    accepted("accepted"),
    challenged("challenged"),denied("denied"),no_advice("no_advice")
    ,error ("error");

    private String url;

    FraudServiceResult(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
