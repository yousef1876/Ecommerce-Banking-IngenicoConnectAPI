package com.payment.transactions.fruaddetection;


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
@Table(name  = "fraud_result_retail_decisions")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FraudResultsRetailDecisions extends Auditable<FraudResultsRetailDecisions>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "fraud_code" , nullable = false)
    private String fraudCode;


    @Column(name  = "fraud_neural" , nullable = false)
    private String fraudNeural;


    @Column(name  = "fraud_RCF" , nullable = false)
    private String fraudRCF;

}
