package com.hr.framework.po.bug.tracking.users;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Department;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "teams")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Teams extends Auditable<Teams>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "team_name" , nullable = false)
    private String teamName;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "department_id" , nullable = false)
    private Department depts;

    @Column(name  = "created_date" , nullable = false)
    @Temporal( TemporalType.TIMESTAMP)
    private Date createDate;



    @Column(name  = "updated_date" , nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "super_role" , nullable = false)
    private Employee superRole;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "active" , nullable = true)
    private boolean active;

    @OneToMany(fetch = FetchType.LAZY ,cascade =  CascadeType.ALL , mappedBy = "teams")
    private List<ProjectTeamMember> teams;


   
}
