package com.payment.orders;

import com.enums.AbstractPaymentMethod;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "abstract_order_status")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
public class AbstractOrderStatus extends Auditable<AbstractOrderStatus>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "status" , nullable = false)
    private com.enums.AbstractOrderStatus status;

    @Column(name  = "methods" , nullable = false)
    private AbstractPaymentMethod methods;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;


}
