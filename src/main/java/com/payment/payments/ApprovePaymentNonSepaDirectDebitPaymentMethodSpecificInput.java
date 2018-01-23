package com.payment.payments;

import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "approve_payment_direct_debit")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
@AllArgsConstructor
public class ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput extends Auditable<ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "date_collect" , nullable = false)
    private String dateCollect;

    @Column(name  = "token" , nullable = false)
    private String token;

}
