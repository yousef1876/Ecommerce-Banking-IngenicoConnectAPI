package com.hr.framework.po.business.crm.products;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "product_quotes")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ProductsQuotes extends Auditable<ProductsQuotes>{

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
    private AssignedUsers assignedUsers;

    @Column(name  = "currency" , nullable = false)
    private String currency;

    @Column(name  = "part_number" , nullable = false)
    private String partNumber;

    @Column(name  = "item_description" , nullable = true)
    private String itemDescription;

    @Column(name  = "number" , nullable = false)
    private int number;

    @Column(name  = "product_qty" , nullable = false)
    private String productQty;

    @Column(name  = "product_cost_price" , nullable = false)
    private String product_cost_price;

    @Column(name  = "product_cost_price_usdollar" , nullable = false)
    private String product_cost_price_usdollar;

    @Column(name  = "product_list_price" , nullable = false)
    private String product_list_price;

    @Column(name  = "product_list_price_usdollar" , nullable = false)
    private String product_list_price_usdollar;

    @Column(name  = "product_discount" , nullable = false)
    private String product_discount;

    @Column(name  = "product_discount_usdollar" , nullable = false)
    private String product_discount_usdollar;

    @Column(name  = "product_discount_amount" , nullable = false)
    private String product_discount_amount;

    @Column(name  = "product_discount_amount_usdollar" , nullable = false)
    private String product_discount_amount_usdollar;

    @Column(name  = "discount" , nullable = false)
    private String discount;

    @Column(name = "product_unit_price" , nullable = false)
    private String product_unit_price;

    @Column(name  = "product_unit_price_usdollar" , nullable = false)
    private String product_unit_price_usdollar;

    @Column(name  = "vat_amt" , nullable = false)
    private String vat_amt;

    @Column(name  = "vat_amt_usdollar" , nullable = false)
    private String vat_amt_usdollar;

    @Column(name  = "product_total_price" , nullable = false)
    private String product_total_price;

    @Column(name  = "product_total_price_usdollar" , nullable = false)
    private String product_total_price_usdollar;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "parent_id" , nullable = false)
    private ProductsQuotes parent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "product_id" , nullable = true)
    private Products products;




}
