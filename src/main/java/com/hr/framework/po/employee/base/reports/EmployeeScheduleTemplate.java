package com.hr.framework.po.employee.base.reports;


import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "employee_schdule_template")
@Data
@Cacheable(true)
public class EmployeeScheduleTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "created_date" , nullable = false)
    private Date createdDate;

    @Column(name  = "updated_date" , nullable = true)
    private Date updatedDate;

    @ManyToOne
    @JoinColumn(name  = "created_by" , nullable = false)
    private Employee createdBy;

    @ManyToOne
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employees;

    @Column(name  = "hours" , nullable = false)
    private String hours;

    @Column(name  = "pay" , nullable = false)
    private String pay;

    @Column(name  = "hours_rate" , nullable = false)
    private String hoursRate;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name = "comments" , nullable = true)
    private String comments;



}
