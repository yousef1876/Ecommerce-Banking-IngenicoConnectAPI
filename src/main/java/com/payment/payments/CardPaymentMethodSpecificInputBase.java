package com.payment.payments;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.AuthorizationMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "card_payment_method_base")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CardPaymentMethodSpecificInputBase extends Auditable<CardPaymentMethodSpecificInputBase>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "mode" , nullable = false)
    private AuthorizationMode mode;


    @Column(name  = "customer_reference" , nullable = false)
    private String customerReference;


    @Column(name  = "payment_product" , nullable = false)
    private String paymentProductId;


    @Column(name  = "recurring_payment_sequence_indicator" , nullable = false)
    private String recurringPaymentSequenceIndicator;


    @Column(name  = "requires_approval" , nullable = false)
    private String requiresApproval;


    @Column(name  = "skip_authentication" , nullable = false)
    private String skipAuthentication;


    @Column(name  = "skip_fraud_service" , nullable = false)
    private String skipFraudService;


    @Column(name  = "token" , nullable = false)
    private String token;


    @Column(name  = "tokenize" , nullable = false)
    private String tokenize;


    @Column(name  = "transaction_channel" , nullable = false)
    private String transactionChannel;



}
