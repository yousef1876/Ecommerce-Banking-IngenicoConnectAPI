package com.payment.payments;

import com.enums.AbstractPaymentMethod;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "abstract_payment_method_specification_input")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
@AllArgsConstructor
public class AbstractPaymentMethodSpecificInput extends com.config.payment.audit.Auditable<AbstractPaymentMethodSpecificInput>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "methods" , nullable = false)
    private AbstractPaymentMethod methods;

    @Column(name  = "text" , nullable = false)
    private String text;


}
