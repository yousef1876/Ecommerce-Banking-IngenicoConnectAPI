package com.enums;



public enum ExternalCardholderAuthenticationData {

    ZERO("No_Authentication"),
    ONE("Authentication_Attempted(MasterCard)"),
    TWO("Successful_Authentication(MasterCard)"),FIVE("Successful_Authentication(Visa,DinersClub,Amex)"),
    SEX("Authentication_Attempted(Visa,DinersClub,Amex)"),SEVEN("No_Authentication");

    private String url;

    ExternalCardholderAuthenticationData(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }



}
