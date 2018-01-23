package com.hr.framework.po.business.crm.cases;

import com.enums.CasePriority;
import com.enums.CaseStatus;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "cases")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Cases extends Auditable<Cases>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "case_name" , nullable = false)
    private String caseName;

    @Column(name = "case_title" , nullable = false)
    private String caseTitle;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "case_number" , nullable = false)
    private String caseNumber;

    @Column(name  = "status" , nullable = false)
    private CaseStatus status;

    @Column(name = "case_priority" , nullable = false)
    private CasePriority casePriority;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

}
