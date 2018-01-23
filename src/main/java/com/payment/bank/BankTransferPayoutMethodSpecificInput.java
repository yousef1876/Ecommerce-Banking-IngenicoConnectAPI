package com.payment.bank;

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
@Table(name  = "bank_transfer_payout_method_input")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class BankTransferPayoutMethodSpecificInput extends Auditable<BankTransferPayoutMethodSpecificInput> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /* bankAccountBban FK */

    /* bankAccountIban	FK */

    /* Customer FK*/

    @Column(name  = "payout_date" , nullable = false)
    private String payoutDate;

    @Column(name  = "payout_text" , nullable = false)
    private String payoutText;

    @Column(name  = "swift_code" , nullable = false)
    private String swiftCode;



}
