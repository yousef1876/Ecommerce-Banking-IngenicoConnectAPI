package com.payment.payments;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.PaymentStatusCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "created_payment_output")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class CreatedPaymentOutput extends Auditable<CreatedPaymentOutput>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /* displayedData  FK*/


    /* payment FK*/



    /*paymentCreationReferences FK*/


    @Column(name  = "status" , nullable = false)
    private PaymentStatusCategory status;


    @Column(name  = "tokens" , nullable = false)
    private String tokens;

}
