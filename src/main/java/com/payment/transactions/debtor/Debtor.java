package com.payment.transactions.debtor;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "debtor")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Debtor extends Auditable<Debtor>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "additional_address_info" , nullable = false)
    private String additionalAddressInfo;


    @Column(name  = "city" , nullable = false)
    private String city;


    @Column(name  = "country_code" , nullable = false)
    private String countryCode;


    @Column(name  = "first_name" , nullable = false)
    private String firstName;


    @Column(name  = "house_number" , nullable = false)
    private String houseNumber;


    @Column(name  = "state" , nullable = true)
    private String state;


    @Column(name  = "state_code" , nullable = false)
    private String stateCode;


    @Column(name  = "street" , nullable = false)
    private String street;


    @Column(name  = "surname" , nullable = false)
    private String surname;


    @Column(name = "surename_prefix" , nullable = false)
    private String surnamePrefix;


    @Column(name  = "zip" , nullable = false)
    private String zip;





}
