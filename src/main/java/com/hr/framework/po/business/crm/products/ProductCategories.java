package com.hr.framework.po.business.crm.products;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "product_categories")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ProductCategories extends Auditable<ProductCategories>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name = "deleted" , nullable = false)
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "cat_id" , nullable = false)
    private ProductCategories productCategories;

    @Column(name  = "parent_id" , nullable = true)
    private boolean isParent;

    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "cat")
    private List<Products> products = new ArrayList<>();

}
