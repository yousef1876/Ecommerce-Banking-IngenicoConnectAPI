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
@Table(name  = "card_payment_method_specific_output")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CardPaymentMethodSpecificOutput extends Auditable<CardPaymentMethodSpecificOutput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String authorisationCode;


    /*  Card FK  */


    /* fraudResults FK */


    private String paymentProductId;


    /* threeDSecureResults	FK   */


}
