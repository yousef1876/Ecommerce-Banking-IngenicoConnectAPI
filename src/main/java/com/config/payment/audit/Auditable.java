package com.config.payment.audit;

import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class Auditable<U> {

    @CreatedBy
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "username_createdBy" , nullable = false)
    protected AssignedUsers createdBy;

    @CreatedDate
    @Temporal(TIMESTAMP)
    protected Date createdDate;

/*    @LastModifiedBy
    protected AssignedUsers lastModifiedBy;*/



    @LastModifiedDate
    @Temporal(TIMESTAMP)
    protected Date lastModifiedDate;



}