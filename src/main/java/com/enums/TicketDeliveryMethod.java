package com.enums;

public enum TicketDeliveryMethod {

    e_ticket("e_ticket"),
    city_ticket_office("city_ticket_office"),
    airport_ticket_office("airport_ticket_office"),
    ticket_by_mail("ticket_by_mail"),
    ticket_on_departure("ticket_on_departure");

    private String url;

    TicketDeliveryMethod(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
