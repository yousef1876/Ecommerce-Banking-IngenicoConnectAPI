package com.payment.bank;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bank_account")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
public class BankAccount extends Auditable<BankAccount>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "account_holder_name" , nullable = false)
    private String accountHolderName;



}
