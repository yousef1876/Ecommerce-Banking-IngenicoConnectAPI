package com.hr.framework.po.employee.base.reports;


import com.enums.HireDocuments;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "hiring_documents")
@Data
@Cacheable(true)
public class HiringFiles {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name = "file_name" , nullable = false)
    private String fileName;

    @Column(name  = "file_type" , nullable = false)
    private String fileType;

    @Column(name  = "body" , nullable = false)
    private byte[] body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "employee_id" , nullable = false)
    private Employee employees;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "hiring_list" , nullable = false)
    private HireCheckList list;

    @Column(name  = "type_id" , nullable = false)
    private HireDocuments type;

}
