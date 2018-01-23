package com.payment.payments;


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
@Table(name  = "card_without_cvv")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CardWithoutCvv extends Auditable<CardWithoutCvv>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "card_number" , nullable = false)
    private String cardNumber;

    @Column(name = "card_holder_name" , nullable = false)
    private String cardholderName;

    @Column(name  = "expiry_date" , nullable = false)
    private String expiryDate;

    @Column(name  = "issue_number" , nullable = false)
    private String issueNumber;



}
