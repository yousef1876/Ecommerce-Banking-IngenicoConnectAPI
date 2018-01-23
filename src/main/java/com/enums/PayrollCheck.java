package com.enums;




public enum PayrollCheck {

    RegularEarnings("RegularEarnings"),
    OvertimeEarnings("OvertimeEarnings"),
    BackPay("BackPay"),HolidayEarnings("HolidayEarnings"),VacationEarnings("VacationEarnings");

    private String url;

    PayrollCheck(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
