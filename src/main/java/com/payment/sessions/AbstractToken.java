package com.payment.sessions;

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
public class AbstractToken extends com.config.payment.audit.Auditable<AbstractToken>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "alias" , nullable = false)
    private String alias;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;



}
