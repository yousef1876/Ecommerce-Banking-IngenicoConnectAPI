package com.hr.framework.po.business.crm.aclactions;

import com.enums.AclType;
import com.enums.ActionCategory;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;

import lombok.Data;

import javax.jdo.annotations.Join;
import javax.persistence.*;

@Entity
@Table(name  = "acl_actions")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class AclActions extends Auditable<AclActions>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "cat_id" , nullable = false)
    private ActionCategory actionCategory;


    @Column(name = "type_id" , nullable = false)
    private AclType types;


    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "action_id" , nullable = false)
    private Actions actions;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "useer_id" , nullable = false)
    private AssignedUsers users;




}
