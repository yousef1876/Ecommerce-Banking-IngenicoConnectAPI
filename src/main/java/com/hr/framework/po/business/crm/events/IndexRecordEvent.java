package com.hr.framework.po.business.crm.events;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "idex_events")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class IndexRecordEvent extends Auditable<IndexRecordEvent>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @Column(name  = "error" , nullable = false)
    private String error;

    @Column(name  = "success" , nullable = false)
    private boolean isSuccess;

    @Column(name  = "record_id" , nullable = false)
    private String recordId;

    @Column(name = "table_name" , nullable = false)
    private String tableName;

}
