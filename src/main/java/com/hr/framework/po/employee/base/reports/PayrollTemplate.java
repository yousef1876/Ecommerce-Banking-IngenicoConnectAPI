package com.hr.framework.po.employee.base.reports;


import com.enums.Deductions;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import com.hr.framework.po.applicant.Positions;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "payroll_template")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class PayrollTemplate extends Auditable<PayrollTemplate>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /*@Column(name  = "created_date" , nullable = false)
    private Date createdDate;

    @Column(name = "updated_date" , nullable = true)
    private Date updatedDate;*/


    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "created_by" , nullable = false)
    private Employee createdBy;*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "employee_id" , nullable = false)
    private Employee employees;

    @Column(name = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "comments" , nullable = true)
    private String comments;

    @Column(name  = "social_security" , nullable = false)
    private String socialSecurity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "city_id" , nullable = true)
    private City city;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "country_id" , nullable = false)
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "position_id" , nullable = false)
    private Positions positions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "hire_check_list")
    private HireCheckList lists;

    @Column(name  = "hour_rate" , nullable = false)
    private String hourRate;

    @Column(name  = "annual_salary" , nullable = false)
    private String annualSalary;

    @Column(name  = "regular_hourly_rate" , nullable = false)
    private String regularHourlyRate;

    @Column(name  = "over_time_hourly_rate" , nullable = false)
    private String overTimeHourlyRate;

    @Column(name  = "deduction_id" , nullable = false)
    private Deductions deduction;



}
