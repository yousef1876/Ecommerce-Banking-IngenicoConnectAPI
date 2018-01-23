package com.payment.bank;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.AbstractPaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "bank_details")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
public class BankDetails extends Auditable<BankDetails>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /*BankAccount B Bean FK*/

    /*BankAccount I Bean FK*/
}
