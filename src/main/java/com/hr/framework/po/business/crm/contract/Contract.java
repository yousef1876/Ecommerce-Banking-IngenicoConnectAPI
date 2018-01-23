package com.hr.framework.po.business.crm.contract;

import com.enums.ContractStatus;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.contact.Contact;
import com.hr.framework.po.business.crm.orders.RequestOrders;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "contract")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Contract extends Auditable<Contract>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers users;

    @Column(name  = "reference_code" , nullable = false)
    private String referenceCode;

    @Column(name  = "from_date" , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name  = "to_date" , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date toDate;


    @Column(name  = "total" , nullable = false)
    private String totalContractValue;

    @Column(name = "us_dollars" , nullable =  true)
    private String usDollar;

    @Column(name  = "currency" , nullable = false)
    private String currency;


    @Column(name  = "status" , nullable = false)
    private ContractStatus contractStatus;


    @Column(name  = "customer_signed_date" , nullable = false)
    private Date customerSignedDate;


    @Column(name  = "company_signed_date" , nullable = false)
    private Date companySignedDate;


    @Column(name  = "reminder_date" , nullable = false)
    private Date renewalReminderDate;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name  = "contact_id" , nullable = false)
    private Contact contacts;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "contracts")
    private List<RequestOrders> requestOrders = new ArrayList<>();


}
