package com.hr.framework.po.employee.base.reports;


import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "vacation_schedule_template")
@Data
@Cacheable(true)
public class VacationScheduleTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "created_date" , nullable = false)
    private Date createdDate;

    @Column(name  = "updated_date" , nullable = true)
    private Date updatedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by" , nullable = false)
    private Employee createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employees;

    @Column(name = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "from_date" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date fromDate;

    @Column(name  = "to_date" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date toDate;

    @Column(name  = "comments" , nullable = false)
    private String commenets;




}
