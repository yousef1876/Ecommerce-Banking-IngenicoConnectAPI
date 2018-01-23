package com.payment.transactions.fruaddetection;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "fraud_fields_shipping_details")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FraudFieldsShippingDetails extends Auditable<FraudFieldsShippingDetails>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "method_details" , nullable = true)
    private String methodDetails;


    @Column(name  = "method_speed" , nullable = true)
    private Integer methodSpeed;


    @Column(name  = "method_type" , nullable = true)
    private Integer methodType;


}
