package com.hr.framework.po.business.crm.items;

import com.enums.ItemGroupType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "line_item_groups")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class LineItemGroups extends Auditable<LineItemGroups>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "deleted" , nullable = true)
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @Column(name  = "total_amount" , nullable = false)
    private String total_amount;

    @Column(name  = "total_amt_us_dollars" , nullable = false)
    private String total_amt_us_dollars;

    @Column(name  = "discount_amount" , nullable = false)
    private String discount_amount;

    @Column(name  = "discount_amount_us_Dollars" , nullable = false)
    private String discount_amount_us_Dollars;

    @Column(name  = "sub_total_amount_us_dollar" , nullable = false)
    private String sub_total_amount_us_dollar;

    @Column(name = "tax_amount" , nullable = false)
    private String tax_amount;

    @Column(name  = "tax_amount_usdollar" , nullable = false)
    private String tax_amount_usdollar;

    @Column(name  = "subtotal_tax_amount" , nullable = false)
    private String subtotal_tax_amount;

    @Column(name  = "subtotal_tax_amount_usdollar" , nullable = false)
    private String subtotal_tax_amount_usdollar;


    /*private String total_amount;*/

    @Column(name  = "total_amount_usdollar" , nullable = false)
    private String total_amount_usdollar;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "item_group_parent_id" , nullable = false)
    private LineItemGroups itemGroups;


    @Column(name  = "type_id" , nullable = false)
    private ItemGroupType types;

    @Column(name  = "number" , nullable = false)
    private Long number;


    @Column(name  = "currency" , nullable = false)
    private String currency;



}
