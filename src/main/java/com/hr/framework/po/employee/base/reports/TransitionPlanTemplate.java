package com.hr.framework.po.employee.base.reports;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.bug.tracking.users.Tasks;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "transition_plan_template")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class TransitionPlanTemplate extends Auditable<TransitionPlanTemplate>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


   /* @Column(name  = "created_date" , nullable = false)
    private Date createDate;

    @Column(name  = "updated_date" , nullable = true)
    private Date updatedDate;*/


    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "created_date" , nullable = false)
    private Employee createdBy;*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "employee_id" , nullable = false)
    private Employee employees;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "notes" , nullable = true)
    private String note;

    @Column(name  = "goal" , nullable = false)
    private String goal;

    @Column(name  = "risk" , nullable = false)
    private String risk;

    @Column(name  = "assumption" , nullable = false)
    private String assumptions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "task_id" , nullable = false)
    private Tasks tasks;

    @Column(name  = "from_date" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date fromDate;

    @Column(name  = "to_date" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date toDate;

}
