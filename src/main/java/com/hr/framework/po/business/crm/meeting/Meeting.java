package com.hr.framework.po.business.crm.meeting;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "meeting")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Meeting extends Auditable<Meeting>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name = "description" , nullable = true)
    private String description;

    @Column(name = "note" , nullable = true)
    private String note;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @Column(name  = "location" , nullable = false)
    private String location;

    @Column(name  = "password" , nullable = false)
    private String password;

    @Column(name  = "user_name" , nullable = false)
    private String userName;

    @Column(name = "join_url" , nullable = false)
    private String joinUrl;

    @Column(name = "hours" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date durationHours;

    @Column(name  = "minutes" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date durationMinutes;

    @Column(name  = "from_date" , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name  = "to_date"  , nullable = false)
    @Temporal(TemporalType.DATE)
    private Date toDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "parent_id" , nullable = true)
    private Meeting parent;

    @Column(name  = "reminder_time" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date reminderTime;

    @Column(name  = "email_reminder_time" , nullable = false)
    @Temporal(TemporalType.TIME)
    private Date email_reminder_time;

    @Column(name  = "outlook_email" , nullable = false)
    private String outlook_id;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "meetings")
    private List<MeetingInvolved> meetingInvolveds = new ArrayList<>();







}
