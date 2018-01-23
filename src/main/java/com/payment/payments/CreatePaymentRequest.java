package com.payment.payments;

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
@Table(name  = "payment_request")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CreatePaymentRequest extends Auditable<CreatePaymentRequest>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /*     /bankTransferPaymentMethodSpecificInput         FK*/


    /*      cardPaymentMethodSpecificInput                 FK*/


    /*      cashPaymentMethodSpecificInput                 fk*/


    /*      directDebitPaymentMethodSpecificInput          fk*/


    private String encryptedCustomerInput;


    /*fraudFields    FK*/



    /*invoicePaymentMethodSpecificInput FK*/


    /*mobilePaymentMethodSpecificInput  FK*/



    /*order                             FK*/



    /* redirectPaymentMethodSpecificInput  FK */



    /* sepaDirectDebitPaymentMethodSpecificInput   FK*/










}
