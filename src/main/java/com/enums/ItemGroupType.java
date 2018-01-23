package com.enums;

public enum ItemGroupType {

    paper("paper"),
    solid("solid"),liquid("liquid"),Computers("computers"),Clothes("clothes"),accessories("accessories")
    ,Cars("cars"),vehicle("vehicle"),TV("TVs"),HAT("Home Audio|Theater"),CPV("Camera,Photo&Video"),CPA("Cell Phones")
    , VGM("Video Game"),WRT("Wearable Technology"),LPT("Laptop"),DEM("Desktop & Monitors"),CPC("Computer Parts")
    ,SFT("Software"),Pri("Printers"),OSS("Office&School Suppliers");

    private String url;

    ItemGroupType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
