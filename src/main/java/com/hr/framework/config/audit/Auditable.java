package com.hr.framework.config.audit;

import com.hr.framework.po.business.crm.users.AssignedUsers;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.horlder.User;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
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