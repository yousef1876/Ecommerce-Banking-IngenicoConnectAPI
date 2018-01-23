package com.payment.api;


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
@Table(name  = "create_token_request")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CreateTokenRequest extends Auditable<CreateTokenRequest>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /* Card FK        */


    /*eWallet   FK      */


    /*nonSepaDirectDebit FK*/


    /* sepaDirectDebit FK */


    @Column(name  = "payment_product" , nullable = false)
    private String paymentProductId;



}
