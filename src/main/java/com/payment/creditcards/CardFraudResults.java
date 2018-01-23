package com.payment.creditcards;


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
@Table(name  = "card_fraud_result")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CardFraudResults extends Auditable<CardFraudResults>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "avs_result" , nullable = false)
    private String avsResult;

    @Column(name = "cvv_result" , nullable = false)
    private String cvvResult;

    @Column(name  = "fraud_service" , nullable = false)
    private String fraudServiceResult;


    /* retailDecisions FK*/

}
