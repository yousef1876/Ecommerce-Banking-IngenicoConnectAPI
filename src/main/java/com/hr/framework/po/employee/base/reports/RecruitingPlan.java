package com.hr.framework.po.employee.base.reports;


import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "recruiting_plan")
@Data
@Cacheable(true)
public class RecruitingPlan {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "title" , nullable = false)
    private String title;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "comments" , nullable = true)
    private String comments;

    @Column(name  = "created_date" , nullable = false)
    private Date createdDate;

    @Column(name  = "updated_date" , nullable = true)
    private Date updatedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "employee_created_by" , nullable = false)
    private Employee createdBy;

    @ManyToOne
    @JoinColumn(name  = "employee_id" , nullable = false)
    private Employee employees;

    @OneToMany( fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "plan")
    private List<PlanActivity> planActivities;

}
