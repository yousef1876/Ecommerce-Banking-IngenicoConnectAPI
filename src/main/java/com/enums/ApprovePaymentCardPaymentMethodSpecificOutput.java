package com.enums;

public enum ApprovePaymentCardPaymentMethodSpecificOutput {

    Zero_Zero("Successful"),
    ONEZero("Reversal_Request_Submitted"),
    EIGHT("Reversal_Request_Submitted"),
    ELEVEN("Reversal_Request_Submitted"),
    FIVE("Reversal_Request_declined"),FIVE_FIVE("Reversal_Request_declined"),EMPTY("EMPTY"),NINE_EIGHT("empty");

    private String url;

    ApprovePaymentCardPaymentMethodSpecificOutput
            (String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
