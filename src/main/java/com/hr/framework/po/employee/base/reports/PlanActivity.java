package com.hr.framework.po.employee.base.reports;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "plan_activity")
@Data
@Cacheable(true)
public class PlanActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "activity_name" , nullable = false)
    private String activity;

    @Column(name = "progress" , nullable = true)
    private boolean inProgress;

    @Column(name  = "completed" , nullable = true)
    private boolean isCompleted;

    @Column(name  = "result" , nullable = false)
    private String result;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id" , nullable = false)
    private RecruitingPlan plan;

}
