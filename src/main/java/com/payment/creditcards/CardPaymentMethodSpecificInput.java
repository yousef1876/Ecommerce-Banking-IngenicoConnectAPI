package com.payment.creditcards;


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
@Table(name  = "card_payment_method_specific_input")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CardPaymentMethodSpecificInput extends Auditable<CardPaymentMethodSpecificInput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "auth" , nullable = false)
    private AuthorizationMode auth;


    /* Cards FK  */

   @Column(name  = "customer_reference" , nullable = false)
   private String customerReference;



   /* externalCardholderAuthenticationData	FK */

   @Column(name = "is_recurring" , nullable = false)
   private boolean isRecurring;


   @Column(name = "payment_product" , nullable = false)
   private String paymentProductId;


   @Column(name  = "recurring_payment_sequence_indicator" , nullable = false)
   private String recurringPaymentSequenceIndicator;



   @Column(name = "requires_approval" , nullable = false)
   private boolean requiresApproval;


   @Column(name  = "return_url" , nullable = false)
   private String returnUrl;


   @Column(name  = "skip_authenication" , nullable = false)
   private boolean skipAuthentication;


    @Column(name  = "skip_fraud_service" , nullable = false)
    private boolean skipFraudService;


    @Column(name  = "token" , nullable = false)
    private String token;


    @Column(name  = "tokenizer" , nullable = false)
    private String tokenize;


    @Column(name  = "transaction_channel" , nullable = false)
    private String transactionChannel;



}
