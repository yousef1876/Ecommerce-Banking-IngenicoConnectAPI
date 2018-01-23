package com.hr.framework.po.business.payments;


import com.enums.PaymentStatus;
import com.enums.PaymentType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.accounts.BillingAccounts;
import com.hr.framework.po.business.parties.AgreementParty;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name  = "incoming_payment")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class IncomingPayment extends Auditable<IncomingPayment>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "organization_id" , nullable = false)
    private AgreementParty organizations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "second_party_id" , nullable = false)
    private AgreementParty secondParty;

    @Column(name  = "reference_number" , nullable = false)
    private String referenceNumber;

    @Column(name  = "amount" , nullable = false)
    private BigDecimal amount;

    @Column(name  = "acc_no" , nullable = false)
    private String accNo;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name  = "billing_account" , nullable = false)
    private BillingAccounts billingAccounts;

    @Column(name = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "status_id" , nullable = false)
    private PaymentStatus stutas;

    @Column(name  = "type_id" , nullable = false)
    private PaymentType type;

}
