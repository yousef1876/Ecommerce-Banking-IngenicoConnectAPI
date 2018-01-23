package com.enums;

public enum RequirementType {

    CustomerRequirement("CustomerRequirement"),InternalRequirement("InternalRequirement"),ProductRequirement("ProductRequirement"),WorkRequirement("WorkRequirement");

    private String url;

    RequirementType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
