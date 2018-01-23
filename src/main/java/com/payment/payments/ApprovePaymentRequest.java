package com.payment.payments;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "approve_payment_request")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
public class ApprovePaymentRequest extends Auditable<ApprovePaymentRequest>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    private String amount;


    /* directDebitPaymentMethodSpecificInput FK  */

    /* order  FK  */


    /* sepaDirectDebitPaymentMethodSpecificInput FK */




}
