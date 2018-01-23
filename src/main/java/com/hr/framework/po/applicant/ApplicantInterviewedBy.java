package com.hr.framework.po.applicant;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "applicant_interviewed_by_employees")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ApplicantInterviewedBy extends Auditable<ApplicantInterviewedBy>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "interview_id" , nullable = false)
    private Interviews interviews;

    /*@Column(name  = "created_date" , nullable = false)
    private Date createdDate;*/

    /*@Column(name  = "updated_date" , nullable = true)
    private Date updatedDate;*/

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_date" , nullable = false)
    private Employee createdBy;*/

    @Column(name = "is_active" , nullable = false)
    private boolean isactive;


}
