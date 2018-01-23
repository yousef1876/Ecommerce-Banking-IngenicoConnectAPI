package com.enums;

public enum HireDocuments {

    JobDescription("JobDescription"),
    Resume("Resume"),OfferLetter("OfferLetter"),
    ConfidentialInformation("CV"),BackGroundCheck("BackGroundCheck"),
    DirectDepositForm("DirectDepositForm"),EmploymentApplication("EmploymentApplication"),
    PersonalDataForm("PersonalForm"),EmployeeManualAcknowledgement("EmployeeManualAcknowledgement");

    private String url;

    HireDocuments(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
