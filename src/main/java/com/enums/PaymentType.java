package com.enums;

public enum PaymentType {

    CommissionPayment("CommissionPayment"),
    CustomerRefund("CustomerRefund"),
    GiftCertificateWithdrawal("GiftCertificateWithdrawal"),IncomeTaxPayment("IncomeTaxPayment"),PayCheck("PayCheck"),
    PayrollPayment("PayrollPayment"),PayrollTaxPayment("PayrollTaxPayment"),SalesTaxPayment("SalesTaxPayment"),
    TaxPayment("TaxPayment"),VendorPayment("VendorPayment"),VendorPrepayment("VendorPrepayment");

    private String url;

    PaymentType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
