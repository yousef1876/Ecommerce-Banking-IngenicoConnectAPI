package com.hr.framework.po.business.parties;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.accounts.BillingAccounts;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "parties")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Party extends Auditable<Party>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "party_id" , nullable = false)
    private AgreementParty party;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "billing_account_id" , nullable = false)
    private BillingAccounts accounts;


    @Column(name = "description" , nullable = true)
    private String description;

    
    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name = "trade_no" , nullable = false)
    private String tradeNo;

    @Column(name  = "official_number" , nullable = false) 
    private String officialName;


    @Column(name  = "private_name" , nullable = false)
    private String privateName;


    @Column(name  = "owner" , nullable = false)
    private String owner;




}
