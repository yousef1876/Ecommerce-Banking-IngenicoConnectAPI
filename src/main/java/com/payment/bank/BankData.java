package com.payment.bank;

import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "bank_data")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
public class BankData extends Auditable<BankData>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "new_bank_name" , nullable = false)
    private String newBankName;

    @Column(name  = "reformatted_account_number" , nullable = false)
    private String reformattedAccountNumber;

    @Column(name  = "reformatted_bank_code" , nullable = false)
    private String reformattedBankCode;

    @Column(name  = "reformatted_branch_code" , nullable = false)
    private String reformattedBranchCode;



}
