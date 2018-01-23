package com.hr.framework.po.business.parties;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.agreements.AgreementRoleType;
import com.hr.framework.po.business.agreements.Agreements;
import com.hr.framework.po.business.crm.assets.Assets;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import com.hr.framework.po.business.invoices.PurchasesInvoices;
import com.hr.framework.po.business.invoices.SalesInvoices;
import com.hr.framework.po.business.payments.IncomingPayment;
import com.hr.framework.po.business.payments.OutGoingPayment;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "agreement_party")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class AgreementParty extends Auditable<AgreementParty>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "party_id" , nullable = false)
    private String partyId;

    @Column(name  = "first_name" , nullable = false)
    private String firstName;

    @Column(name  = "second_name" , nullable = false)
    private String secondName;

    @Column(name  = "shortcut" , nullable = false)
    private String shortcut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "agreement_id" , nullable = false)
    private Agreements agreements;

    @Column(name  = "group_name" , nullable = false)
    private String groupName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "role_type" , nullable = false)
    private AgreementRoleType roles;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "parts")
    private List<Assets> assets =  new ArrayList<>(); 
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "firstParty")
    private List<PurchasesInvoices> purchasesInvoicesFP =  new ArrayList<>();

    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "secondParty")
    private List<PurchasesInvoices> purchasesInvoicesSecP =  new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "firstParty")
    private List<SalesInvoices> salesInvoicesFP =  new ArrayList<>();

    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "secondParty")
    private List<SalesInvoices> salesInvoicesSecP =  new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "party")
    private List<Party> partiesInvolved;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "organizations")
    private List<IncomingPayment> paymentsOrganizationPartyIncPay;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "secondParty")
    private List<IncomingPayment> secondPartyIncPay;
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "organizations")
    private List<OutGoingPayment> paymentsOrganizationPartyOutPay;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "secondParty")
    private List<OutGoingPayment> secondPartyOutPay;
    
    
    
}
