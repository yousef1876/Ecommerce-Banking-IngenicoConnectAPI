package com.enums;

public enum PositionType {

    /*HIGH("high"),
    advance("advance"),
    LOW("low");
    */
    ADMINISTRATOR("ADMINISTRATOR"),DEVELOPMENT("DEVELOPMENT"),CEO("CEO"),MARKETING("MARKETING"),MANAGER("MANAGER")
    ,OTHERS("OTHERS");

    private String url;

    PositionType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
