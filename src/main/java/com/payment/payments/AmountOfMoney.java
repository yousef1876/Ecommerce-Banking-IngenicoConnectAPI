package com.payment.payments;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "amount_of_money")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
public class AmountOfMoney extends Auditable<AmountOfMoney>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "amount" , nullable = false)
    private String amount;

    @Column(name  = "currency_code" , nullable = false)
    private String currencyCode;

}
