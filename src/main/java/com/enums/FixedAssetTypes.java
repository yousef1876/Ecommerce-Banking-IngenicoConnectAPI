package com.enums;

public enum FixedAssetTypes {

    ComputerHardware("ComputerHardware"),
    ComputerSoftware("ComputerSoftware"),Equipment("Equipment"),GroupOfMachineProduction("machines")
    ,Property("property"),Vehicle("Vehicle"),RealEstate("Estates");

    private String url;

    FixedAssetTypes(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
