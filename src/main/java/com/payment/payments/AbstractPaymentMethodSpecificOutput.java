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
@Table(name  = "abstract_payment_method_specification_output")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
@AllArgsConstructor
public class AbstractPaymentMethodSpecificOutput extends com.config.payment.audit.Auditable<AbstractPaymentMethodSpecificOutput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "methods" , nullable = false)
    private AbstractPaymentMethod methods;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;




}
