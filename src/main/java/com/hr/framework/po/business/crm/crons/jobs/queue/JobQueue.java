package com.hr.framework.po.business.crm.crons.jobs.queue;


import com.enums.JobQueueStatus;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "job_queue")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class JobQueue extends Auditable<JobQueue>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @Column(name  = "status" , nullable = false)
    private JobQueueStatus status;

    @Column(name  = "text" , nullable = true)
    private String text;

    @Column(name  = "message" , nullable = true)
    private String message;

}
