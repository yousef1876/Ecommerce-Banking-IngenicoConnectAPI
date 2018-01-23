package com.hr.framework.po.business.crm.orders;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import com.hr.framework.po.business.customers.Customers;
import lombok.Data;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "order_entity")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class OrderEntry extends Auditable<OrderEntry> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "customer_id" , nullable = false)
    private Customers customers;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers users;

    @Column(name  = "po"  , nullable = false)
    private String po;

    @Column(name  = "after_date" , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date  afterDate;

    @Column(name  = "before_date" , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date beforeDate;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "entry")
    private List<ReturnRequestOrders> returnRequestOrders = new ArrayList<>();
    
}
