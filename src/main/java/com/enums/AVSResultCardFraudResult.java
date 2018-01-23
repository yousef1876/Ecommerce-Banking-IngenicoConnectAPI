package com.enums;


public enum AVSResultCardFraudResult {

    A("ADDRESS"),
    B("PostalCode_FORMAT"),
    C("PostalCode&Street_FORMAT"),D("cardholder_INCORRECT"),E("AVS_ERROR"),F("UK_ONLY"),
    G("non_AVS_participant"),H("BILLING_ADDRESS_CARDHOLDER"),I("Address_NOT_VERIFIED"),K("Cardholder_name_matches_(Amex)"),
    L("Cardholder_NAME_POSTALCODE"),M("Cardholder_Name,StreetAddress,postalCode"),Q("Billing_Address"),R("Retry,service,unavailable"),
    S("service unsupported"),U("Address unavailable"),ZERO("No_service_available")
    ;

    private String url;

    AVSResultCardFraudResult(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
