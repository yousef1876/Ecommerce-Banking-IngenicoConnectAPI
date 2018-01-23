package com.enums;

public enum AgreementType {


    Sales("Sales"),
    Purchase("purchase"),
    Product("product"),Employment("employment");

    private final String name;

    private AgreementType(String value) {
        this.name = value;
    }

    public String value() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }


}
