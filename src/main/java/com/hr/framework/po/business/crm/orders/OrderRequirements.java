package com.hr.framework.po.business.crm.orders;

import com.enums.RequirementType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.assets.Assets;
import com.hr.framework.po.business.crm.products.Products;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import com.hr.framework.po.business.customers.Customers;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "order_requirement")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class OrderRequirements extends Auditable<OrderRequirements>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "requirement_name" , nullable = false)
    private String requirementName;

    @Column(name  = "quantity" , nullable = false)
    private String quantity;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "asset_id" , nullable = false)
    private Assets assets;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "product_id" , nullable = true)
    private Products products;


    @Column(name  = "type" , nullable = false)
    private RequirementType type;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;


    @Column(name  = "requirement_by_date" , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date requirementByDate;

    @Column(name  = "requirement_date" , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date requirementDate;

    @Column(name  = "budget" , nullable = false)
    private String Budget;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "customer_id" , nullable = false)
    private Customers customers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers users;

}
