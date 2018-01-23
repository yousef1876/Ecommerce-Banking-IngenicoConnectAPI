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
@Table(name  = "hosted_checkout_request")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CreateHostedCheckoutRequest extends Auditable<CreateHostedCheckoutRequest>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /* bankTransferPaymentMethodSpecificInput FK */


    /* cardPaymentMethodSpecificInput FK         */


    /* cashPaymentMethodSpecificInput  FK        */


    /* fraudFields FK*/


    /* hostedCheckoutSpecificInput     FK         */


    /* order   FK                                 */




    /*redirectPaymentMethodSpecificInput    FK    */














}
