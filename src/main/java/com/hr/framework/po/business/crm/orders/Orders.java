package com.hr.framework.po.business.crm.orders;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "orders")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Orders extends Auditable<Orders>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "order_name" , nullable = false)
    private String orderName;
    
    @Column(name  = "order_title" , nullable = false)
    private String orderTitle;
    
    @Column(name  = "from_date" , nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    
    @Column(name  = "delivery_time" , nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryTime;
    
    @Column(name = "reason" , nullable = false)
    private String reason;
    
    @Column(name  = "content" , nullable = true)
    private String content;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers  assignedUsers;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "parent_id" , nullable = true)
    private Orders parentOrders;
    
    @Column(name = "description" , nullable = true)
    private String description;
    
    @Column(name = "note" , nullable = true)
    private String note;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "orders")
    private List<ReturnRequestOrders> returnRequestOrders = new ArrayList<>();
    
    
    
    
}
