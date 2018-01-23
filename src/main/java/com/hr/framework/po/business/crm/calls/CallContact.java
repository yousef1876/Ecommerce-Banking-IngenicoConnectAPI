package com.hr.framework.po.business.crm.calls;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.contact.Contact;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class CallContact extends Auditable<CallContact>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "contact_id" , nullable = false)
    private Contact contacts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "call_id" , nullable = false)
    private Calls calls;

    @Column(name  = "required" , nullable = true)
    private boolean isRequired;

    @Column(name  = "deleted" , nullable = true)
    private boolean isDeleted;

    @Column(name  = "description" , nullable = true)
    private String description;
    
    @Column(name  = "note" , nullable = true)
    private String note;
    
    @Column(name  = "comments" , nullable = true)
    private String comments;



}
