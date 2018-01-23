package com.payment.transactions.fruaddetection;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.FraudServiceResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "fraud_results")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FraudResults extends Auditable<FraudResults>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "result" , nullable = false)
    private FraudServiceResultEnum result;



}
