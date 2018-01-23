package com.payment.bank;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bank_account_i_ban")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
public class BankAccountIban extends Auditable<BankAccountIban>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "account_holder_name" , nullable = false)
    private String accountHolderName;

    @Column(name  = "iban" , nullable = false)
    private String iban;
}
