package com.hr.framework.po.business.crm.meeting;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import com.hr.framework.po.employee.base.Department;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "roles_")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Role extends Auditable<Role>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "department_id" , nullable = false)
    private Department departments;




}
