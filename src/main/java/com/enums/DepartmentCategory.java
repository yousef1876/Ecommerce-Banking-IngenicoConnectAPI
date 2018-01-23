package com.enums;

public enum DepartmentCategory {
	HUMANRESOURCE("human_resource"),
    IT("information_Technology"),
    MARKETING("marketing"),
    DELIVERY("delivery"),
    administrator("administrator"),
    CEO("ceo");

    private String url;

    DepartmentCategory(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
