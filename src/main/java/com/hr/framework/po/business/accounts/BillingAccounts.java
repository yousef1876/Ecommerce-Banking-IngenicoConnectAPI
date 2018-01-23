package com.hr.framework.po.business.accounts;

import com.enums.AccountBillingStatus;
import com.enums.AccountBillingType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.orders.ReturnRequestOrders;
import com.hr.framework.po.business.parties.Party;
import com.hr.framework.po.business.payments.IncomingPayment;
import com.hr.framework.po.business.payments.OutGoingPayment;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class BillingAccounts extends Auditable<BillingAccounts>{



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "acc_no" , nullable = false)
    private String accNo;

    @Column(name  = "acc_name" , nullable = false)
    private String accName;

    @Column(name  = "due_date" , nullable = false)
    private Date dueDate;

    @Column(name  = "type" , nullable = false)
    private AccountBillingType type;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "balance" , nullable = false)
    private BigDecimal balance;

    @Column(name  = "status" , nullable = false)
    private AccountBillingStatus status;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "accounts")
    private List<Party> partiesInvolved;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "billingAccounts")
    private List<IncomingPayment> billingAccountsIncPay;



    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "billingAccounts")
    private List<OutGoingPayment> billingAccountsOutPay;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "accounts")
    private List<ReturnRequestOrders> returnRequestOrders = new ArrayList<>();
    
    
    

}
