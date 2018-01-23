package com.enums;

public enum Deductions {

    FederalTax("FederalTax"),
    StateTax("StateTax"),
    SSTax("SSTax"),MedicareTax("MedicareTax"),MedicalInsurance("MedicalInsurance"),Uniforms("Uniforms"),
    UnionDues("UnionDues"),CheckingACH("CheckingACH");

    private String url;

    Deductions(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
