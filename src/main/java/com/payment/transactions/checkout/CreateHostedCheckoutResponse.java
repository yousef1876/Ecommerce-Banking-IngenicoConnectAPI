package com.payment.transactions.checkout;


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
@Table(name  = "checkout_response")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CreateHostedCheckoutResponse extends Auditable<CreateHostedCheckoutResponse>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "return_mac" , nullable = false)
    private String RETURNMAC;

    @Column(name  = "hosted_checkout_id" , nullable = false)
    private String hostedCheckoutId;

    @Column(name  = "invalid_token" , nullable = false)
    private byte[] invalidTokens;

    @Column(name  = "parial_redirect_url" , nullable = false)
    private String partialRedirectUrl;




}
