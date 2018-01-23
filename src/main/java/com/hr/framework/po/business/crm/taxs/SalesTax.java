package com.hr.framework.po.business.crm.taxs;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name  = "slaes_tax")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class SalesTax extends Auditable<SalesTax>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "rate" , nullable = false)
    private BigDecimal rate;

    @Column(name  = "tax_code" , nullable = false)
    private String taxCode;

    @Column(name  = "tax_name" , nullable = false)
    private String taxName;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "tax_master_id" , nullable = false)
    private TaxMaster taxMaster;

}
