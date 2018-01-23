package com.payment.transactions.creditor;


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
@Table(name  = "creditor")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Creditor extends Auditable<Creditor>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "additional_address_information" , nullable = false)
    private String additionalAddressInfo;


    @Column(name  = "city" , nullable = false)
    private String city;


    @Column(name  = "country_code" , nullable = false)
    private String countryCode;


    @Column(name  = "house_number" , nullable = false)
    private String houseNumber;

    @Column(name  = "iban" , nullable = false)
    private String iban;


    @Column(name  = "name" , nullable = false)
    private String name;


    @Column(name  = "reference_party" , nullable = false)
    private String referenceParty;


    @Column(name  = "reference_party_id" , nullable = false)
    private String referencePartyId;


    @Column(name  = "street"  , nullable = false)
    private String street;


    @Column(name  = "zip" , nullable = false)
    private String zip;

}
