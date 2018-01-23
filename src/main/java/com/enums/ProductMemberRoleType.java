package com.enums;

public enum ProductMemberRoleType {

    Stakeholder("Stakeholder"),
    Person("Person"),Customer("Customer"),Manager("Manager"),Developer("Developer");

    private String url;

    ProductMemberRoleType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
