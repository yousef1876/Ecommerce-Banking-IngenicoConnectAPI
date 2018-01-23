package com.hr.framework.po.employee.base.reports;

import com.enums.EmployeeEvaluationSteps;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "employee_evaluation_template")
@Data
@Cacheable(true)
public class EmployeeEvaluationTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "created_date" , nullable = false)
    private Date createdDate;

    @Column(name  = "updated_date" , nullable = true)
    private Date updatedate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by" , nullable = false)
    private Employee createdBy;

    @Column(name  = "item_id" , nullable = false)
    private EmployeeEvaluationSteps items;

    @Column(name  = "result" , nullable = false)
    private String result;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employees;

    @Column(name  = "description" , nullable = true)
    private String description;


}
