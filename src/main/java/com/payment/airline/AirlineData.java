package com.payment.airline;


import com.config.payment.audit.Auditable;
import com.enums.TicketDeliveryMethod;
import com.hr.framework.config.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "airline_data")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
@AllArgsConstructor
public class AirlineData extends Auditable<AirlineData>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name = "agent_numeric_code" , nullable = false)
    private String agentNumericCode;

    @Column(name  = "code" , nullable = false)
    private String code;

    @Column(name  = "flight_date" , nullable = false)
    @Temporal( TemporalType.DATE)
    private String flightDate;


    /*flightLegs; FK*/

    @Column(name  = "invoice_number" , nullable = false)
    private String invoiceNumber;

    @Column(name  = "is_e_ticket" , nullable = false)
    private boolean isETicket;

    @Column(name  = "is_registered_customer" , nullable = false)
    private boolean isRegisteredCustomer;

    @Column(name  = "is_restricted_ticket" , nullable = false)
    private boolean isRestrictedTicket;

    @Column(name  = "is_third_party" , nullable = false)
    private boolean isThirdParty;

    @Column(name  = "issue_date" , nullable = false)
    private String issueDate;

    @Column(name  = "merchant_customer_id" , nullable = false)
    private String merchantCustomerId;

    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "passenger_name" , nullable = false)
    private String passengerName;

    @Column(name  = "place_issue" , nullable = false)
    private String placeOfIssue;

    @Column(name  = "pnr" , nullable = false)
    private String pnr;

    @Column(name  = "point_of_sale" , nullable = false)
    private String  pointOfSale;

    @Column(name  = "ps_city_code" , nullable = false)
    private String posCityCode;

    @Column(name  = "method_delivery" , nullable = false)
    private TicketDeliveryMethod methods;

    @Column(name  = "ticket_number" , nullable = false)
    private String ticketNumber;


}
