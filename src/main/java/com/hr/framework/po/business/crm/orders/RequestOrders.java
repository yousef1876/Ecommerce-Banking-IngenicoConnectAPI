package com.hr.framework.po.business.crm.orders;


import com.enums.OrderSalesChannel;
import com.enums.RequestOrderStatus;
import com.enums.RequestOrderType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.contract.Contract;
import com.hr.framework.po.business.customers.Customers;
import lombok.Data;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "request_order")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class RequestOrders extends Auditable<RequestOrders>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "customer_id" , nullable = false)
    private Customers customers;

    @OneToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name  = "parent_id" , nullable = false)
    private RequestOrders parent;

    @Column(name  = "status" , nullable = false)
    private RequestOrderStatus status;

    @Column(name  = "type" , nullable = false)
    private RequestOrderType type;

    @Column(name  = "request_name" , nullable = false)
    private String requestName;

    @Column(name  = "request_serial" , nullable = false)
    private String requestSerial;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name = "note" , nullable = true)
    private String note;

    @Column(name  = "channel_id" , nullable = false)
    private OrderSalesChannel channel;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "contract_id" , nullable = false)
    private Contract contracts;

    @Column(name = "open_date" , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date openDate;

    @Column(name  = "closed_date" , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date closedDate;

    @Column(name  = "internal_commit" , nullable = true)
    private String internalCommit;

    @Column(name  = "reason" , nullable = true)
    private String reason;

    @Column(name  = "billed" , nullable = false)
    private boolean isBilled = false;

    @OneToMany(fetch = FetchType.LAZY , cascade =  CascadeType.ALL , mappedBy = "requestOrders")
    private List<ReturnRequestOrders> returnRequestOrders = new ArrayList<>();
    
    
    

}
