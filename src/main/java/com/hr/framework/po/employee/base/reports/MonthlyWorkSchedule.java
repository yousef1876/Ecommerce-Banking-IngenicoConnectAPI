package com.hr.framework.po.employee.base.reports;


import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "monthly_worked_schedule")
@Data
@Cacheable(true)
public class MonthlyWorkSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "created_date" , nullable = false)
    private Date createdDate;

    @Column(name  = "updated_date" , nullable = true)
    private Date updatedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_employee" , nullable = false)
    private Employee createdBy;

    @Column(name  = "from_date" , nullable = false)
    private Date fromDate;

    @Column(name  = "to_date" , nullable = false)
    private Date toDate;


    @OneToMany(fetch = FetchType.LAZY , mappedBy = "schedule" , cascade = CascadeType.ALL)
    private List<MonthlyTeamWorkSchedule> monthlyTeamWorkSchedules;


}
