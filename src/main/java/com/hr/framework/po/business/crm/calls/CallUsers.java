package com.hr.framework.po.business.crm.calls;

import com.enums.CallAcceptStatus;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "calls_users")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class CallUsers extends Auditable<CallUsers>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "call_id" , nullable = false)
    private Calls calls;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @Column(name  = "required" , nullable = false)
    private boolean isRequired;

    @Column(name  = "status" , nullable = false)
    private CallAcceptStatus status;


    @Column(name  = "description" , nullable = true)
    private String description;
    
    
    @Column(name  = "note" , nullable = true)
    private String note;
    
    @Column(name = "comments" , nullable = true)
    private String comments;

}
