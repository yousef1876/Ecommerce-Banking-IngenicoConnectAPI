package com.hr.framework.po.bug.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task_assignee")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class TaskAssignee extends Auditable<TaskAssignee>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "task_title" , nullable = false)
    private  String taskTitle;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;


    @Column(name  = "task_name" , nullable = false)
    private String taskName;

    /*@Column(name  = "created_date" , nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;*/

   /* @Column(name = "updated_date" , nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;*/


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "super_role" , nullable = false)
    private Employee superRole;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assign_to" , nullable = false)
    private Employee assignTo;

    @Column(name  = "is_urgent" , nullable = true)
    private boolean isUrgent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "project_id" , nullable = false)
    private Project projects;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "version_id" , nullable = false)
    private ProjectVersion versions;


}
