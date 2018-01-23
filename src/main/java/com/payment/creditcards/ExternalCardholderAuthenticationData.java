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
@Table(name  = "external_card_holder_authentication_data")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ExternalCardholderAuthenticationData extends Auditable<ExternalCardholderAuthenticationData> {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "cavv" , nullable = false)
    private String cavv;


    @Column(name  = "cavv_algorthim" , nullable = false)
    private String cavvAlgorithm;


    @Column(name  = "eci" , nullable = false)
    private String eci;


    @Column(name  = "validation_result" , nullable = false)
    private String validationResult;


    @Column(name  = "xid" , nullable = false)
    private String xid;

}
