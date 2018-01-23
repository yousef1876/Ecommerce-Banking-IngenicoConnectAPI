package com.hr.framework.po.business.crm.meeting;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name  = "meeting_invloved")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class MeetingInvolved extends Auditable<MeetingInvolved>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "room_id" , nullable = false)
    private Rooms rooms;

    @Column(name  = "is_lead" , nullable = false)
    private boolean isleads;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @Column(name  = "from_date" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date fromDate;
    
    @Column(name  = "to_date" , nullable = false)
    @Temporal(TemporalType.TIME) 
    private Date toDate;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "meeting_id" , nullable = false)
    private Meeting meetings;
    




}
