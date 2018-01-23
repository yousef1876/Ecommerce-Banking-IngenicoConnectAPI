package com.hr.framework.po.store;


import com.enums.StoresRating;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stores")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Store extends Auditable<Store>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "rating" , nullable = true)
    private StoresRating rating;

    @Column(name  = "executive_manager" , nullable = true)
    private String executiveManager;


    @Column(name  = "owner" , nullable = true)
    private String owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "employee_exec_manager" , nullable = false)
    private Employee execManager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "store_owner" , nullable = false)
    private Employee ownerEmployeed;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "address_id" , nullable = false)
    private StoreAddress storeAddress;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "stores")
    private List<Product> productList = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "stores")
    private List<StoreContact> storeContactList = new ArrayList<>();

}
