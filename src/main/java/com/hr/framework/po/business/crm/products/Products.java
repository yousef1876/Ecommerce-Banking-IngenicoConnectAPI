package com.hr.framework.po.business.crm.products;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.assets.Assets;
import com.hr.framework.po.business.crm.orders.OrderRequirements;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "products")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Products extends Auditable<Products>{


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

    @Column(name  = "is_deleted" , nullable = false)
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @Column(name  = "main_code" , nullable = false)
    private String maincode;

    @Column(name  = "part_number" , nullable = false)
    private String partNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "cat_id" , nullable = false)
    private  ProductCategories cat;

    @Column(name  = "cost" , nullable = false)
    private String cost;

    @Column(name  = "cost_usdollars" , nullable = false)
    private String costUsdollar;

    @Column(name  = "currency" , nullable = false)
    private String currency;

    @Column(name  = "price" , nullable = false)
    private String price;

    @Column(name  = "price_usdollars" , nullable = false)
    private String priceUsdollar;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "products")
    private List<Assets> assets = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "products")
    private List<OrderRequirements> orderRequirements = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "products")
    private List<ProductsQuotes> productsQuotes = new ArrayList<>();
}
