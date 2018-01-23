package com.hr.framework.po.business.crm.taxs;

import com.enums.ItemGroupType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.Country;
import com.hr.framework.po.address.State;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name  = "state_sales_tax")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class StateSalesTax extends Auditable<StateSalesTax>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "country_id" , nullable = false)
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "state_id" , nullable = false)
    private State state;

    @Column(name  = "tax_code" , nullable = false)
    private String taxCode;

    @Column(name  = "tax_name" , nullable = false)
    private String taxName;

    @Column(name  = "item_id" , nullable = false)
    private ItemGroupType types;

    @Column(name  = "rate" , nullable = false)
    private BigDecimal rate;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

}
