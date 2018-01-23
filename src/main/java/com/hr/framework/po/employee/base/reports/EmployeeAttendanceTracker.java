package com.hr.framework.po.employee.base.reports;

import com.enums.AttendanceType;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "employee_attendance_tracker")
@Data
@Cacheable(true)
public class EmployeeAttendanceTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "created_date" , nullable =  false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name  = "updated_date" , nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_created_id" , nullable = false)
    private Employee createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false , name  = "employee_id")
    private Employee employees;

    @Column(name  = "attendance" , nullable = false)
    private AttendanceType type;



}
