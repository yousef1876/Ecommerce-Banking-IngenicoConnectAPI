package com.payment.bank;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bank_account_b_ban_refund")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
public class BankAccountBbanRefund extends Auditable<BankAccountBbanRefund>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "account_holder_name" , nullable = false)
    private String accountHolderName;

    @Column(name  = "account_number" , nullable = false)
    private String accountNumber;

    @Column(name  = "bank_city" , nullable = false)
    private String bankCity;

    @Column(name  = "bank_code" , nullable = false)
    private String bankCode;

    @Column(name  = "bank_name" , nullable = false)
    private String bankName;

    @Column(name  = "branch_code" , nullable = false)
    private String branchCode;

    @Column(name  = "check_digit" , nullable = false)
    private String checkDigit;

    @Column(name  = "country_code" , nullable = false)
    private String countryCode;

    @Column(name  = "swift_code" , nullable = false)
    private String swiftCode;
}
