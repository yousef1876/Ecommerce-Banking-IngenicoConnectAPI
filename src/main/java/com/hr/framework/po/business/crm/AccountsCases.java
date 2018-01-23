package com.hr.framework.po.business.crm;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "accounts_cases")
@Data
@EntityListeners(EntityListener.class)
public class AccountsCases extends Auditable<AccountsCases> {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name  = "assigned_user_id" , nullable = false)
    private AssignedUsers assignedUsers;
    
    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name  = "account_id" , nullable =  false)
    private Accounts accounts;

    @Column(name  = "deleted" , nullable = true)
    private boolean isDeleted;
    
    @Column(name  = "auth_type" , nullable = false)
    private String authType;
    
    

}
