package com.hr.framework.po.business.customers;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import com.hr.framework.po.business.crm.orders.OrderEntry;
import com.hr.framework.po.business.crm.orders.OrderRequirements;
import com.hr.framework.po.business.crm.orders.RequestOrders;
import com.hr.framework.po.business.customers.documents.RelatedDocuments;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "customers")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Customers extends Auditable<Customers>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "first_name" , nullable = false)
    private String firstName;

    @Column(name  = "second_name" , nullable = true)
    private String secondName;

    @Column(name  = "last_name" , nullable = false)
    private String lastName;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name  = "country_id" , nullable = false)
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "city_id" , nullable = false)
    private City city;

    @Column(name  = "serial_number" , nullable = false)
    private String serialNumber;


    @Column(name = "email" , nullable = true)
    private String email;

    @Column(name = "phone" , nullable = true)
    private String phone;

    @Column(name = "address" , nullable =  true)
    private String address;

    @Column(name = "mobile" , nullable = false)
    private String mobile;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<OrderEntry> orderEntries =  new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<OrderRequirements> customers = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<RequestOrders> requestOrders = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<Customers> customers2 = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<Customers>  customers3 = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<CustomerIdentification>  customers4 = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<RelatedDocuments> relatedDocuments = new ArrayList<>();
}
