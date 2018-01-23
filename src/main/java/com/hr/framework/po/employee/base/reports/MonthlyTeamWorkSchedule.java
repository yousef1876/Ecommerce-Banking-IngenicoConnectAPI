package com.hr.framework.po.employee.base.reports;

import com.enums.Colors;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "monthly_team_work_schedule")
@Data
@Cacheable(true)
public class MonthlyTeamWorkSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employees;

    @Column(name  = "day" , nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "event_name" , nullable = false)
    private String event;

    @Column(name  = "period" , nullable = false)
    private String period;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "schedule_id" , nullable = false)
    private MonthlyWorkSchedule schedule;


    @Column(name  = "color_id" , nullable = false)
    private Colors color;




}
