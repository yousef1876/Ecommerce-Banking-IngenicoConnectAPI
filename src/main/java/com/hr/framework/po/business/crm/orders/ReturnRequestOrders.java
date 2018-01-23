package com.hr.framework.po.business.crm.orders;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.accounts.BillingAccounts;
import lombok.Data;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "return_request_orders")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ReturnRequestOrders extends Auditable<ReturnRequestOrders>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "name" , nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "order_request_id" , nullable = false)
    private RequestOrders requestOrders;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "account_id" , nullable = false)
    private BillingAccounts accounts;

    @Column(name  = "return" , nullable = false)
    private boolean isReturn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "order_id" , nullable = false)
    private Orders orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "entry_id" , nullable = false)
    private OrderEntry entry;

    
   
    
}
