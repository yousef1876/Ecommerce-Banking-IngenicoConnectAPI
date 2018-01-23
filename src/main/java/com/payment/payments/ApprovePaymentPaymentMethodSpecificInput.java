package com.payment.payments;

import com.config.payment.audit.EntityListener;
import com.hr.framework.config.audit.Auditable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "approve_payment_method_specification")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
public class ApprovePaymentPaymentMethodSpecificInput extends Auditable<ApprovePaymentPaymentMethodSpecificInput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "date_collect" , nullable = false)
    private String dateCollect;

    @Column(name  = "token" , nullable = false)
    private String token;


}
