package com.payment.airline;

import com.config.payment.audit.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "airline_flight_leng")
@Data
@EntityListeners(com.config.payment.audit.EntityListener.class)
@Getter
@Setter
@AllArgsConstructor
public class AirlineFlightLeg extends Auditable<AirlineFlightLeg>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "airline_clazz" , nullable = false)
    private String airlineClass;

    @Column(name  = "arrival_airport" , nullable = false)
    private String arrivalAirport;

    @Column(name  = "carrier_code" , nullable = false)
    private String carrierCode;

    @Column(name  = "date" , nullable = false)
    private String date;

    @Column(name  = "departure_time" , nullable = false)
    private String departureTime;

    @Column(name  = "fare" , nullable = false)
    private String fare;

    @Column(name  = "fare_basis" , nullable = false)
    private String fareBasis;

    @Column(name  = "flight_number" , nullable = false)
    private String flightNumber;

    @Column(name  = "number" , nullable = false)
    private String number;

    @Column(name  = "origin_airport" , nullable = false)
    private String originAirport;


    @Column(name  = "stop_over_code" , nullable = false)
    private String stopoverCode;


}
