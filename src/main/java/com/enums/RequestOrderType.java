package com.enums;

public enum RequestOrderType {

    BugFixed("BugFixed"), Catalog("Catalog") , Feathers("Feathers") , Informations("Informations") , Proposal("Proposal") , Quote("Quote"),
    PurchaseQuote("PurchaseQuote") , BackLogItem("BackLogItem") , ScrumMeeting("ScrumMeeting") , Support("Support");


    private String url;

    RequestOrderType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
