package com.hr.framework.po.employee.base.reports;


import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "hire_checklist")
@Data
@Cacheable(true)
public class HireCheckList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "comments" , nullable = true)
    private String comments;

    @Column(name  = "created_date" , nullable = false)
    private Date createdDate;

    @Column(name  = "update_date" , nullable = true)
    private Date updateDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_employee" , nullable = false)
    private Employee createdBy;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "list")
    private List<HiringFiles> files;



}
