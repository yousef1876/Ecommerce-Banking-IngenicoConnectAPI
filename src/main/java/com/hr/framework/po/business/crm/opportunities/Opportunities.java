package com.hr.framework.po.business.crm.opportunities;


import com.enums.OpportunityType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.jdo.annotations.Join;
import javax.persistence.*;

@Entity
@Table(name  = "Opportunities")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Opportunities extends Auditable<Opportunities>{


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
    private AssignedUsers users;

    @Column(name  = "type_id" , nullable = false)
    private OpportunityType types;

    @Column(name  = "lead_source" , nullable = false)
    private String leadSource;

    @Column(name  = "amount" , nullable = false)
    private String amount;

    @Column(name  = "amount_usa_dollars" , nullable = false)
    private String amountUsDollars;

    @Column(name  = "currency" , nullable = false)
    private String currency;



}
