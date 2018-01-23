package com.hr.framework.po.business.crm.calls;

import com.enums.CallStatus;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "calls")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Calls extends Auditable<Calls>{

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

    @Column(name  = "hours" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date hours;


    @Column(name  = "from_date" , nullable = true)
    private Date fromDate;

    @Column(name  = "to_date" , nullable = true)
    private Date toDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "parent_id" , nullable = true)
    private Calls calls;

    @Column(name = "status_id" , nullable = true)
    private CallStatus status;

    @Column(name  = "reminder_time" , nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date reminderTime;

 
    @Column(name  = "email_reminder_sent" , nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date emailReminderSent;

    @Column(name  = "outlook" , nullable = false)
    private String outlook;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "calls")
    private List<CallContact> callContact;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "calls")
    private List<CallReschedule> callReschedule;

}
