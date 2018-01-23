package com.hr.framework.po.business.crm.leads;

import com.enums.LeadStatus;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.contact.Contact;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import com.hr.framework.po.employee.base.Department;
import com.hr.framework.po.person.Person;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "leads")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Leads extends Auditable<Leads>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name = "deleted" , nullable = false)
    private boolean isDeleted;

    @Column(name  = "first_name" , nullable = false)
    private String firstName;

    @Column(name  = "second_name" , nullable = true)
    private String secondName;

    @Column(name  = "last_name" , nullable = false)
    private String lastName;

    @Column(name  = "title" , nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "dept_id" , nullable = false)
    private Department dept;

    @Column(name  = "phone_home" , nullable = true)
    private String phoneHome;

    @Column(name  = "mobile_home" , nullable = true)
    private String mobileHome;

    @Column(name  = "assistant" , nullable = false)
    private String assistant;

    @Column(name  = "assistant_phone" , nullable = false)
    private String assistantPhone;

    @Column(name  = "refered_by" , nullable = false)
    private String referedBy;

    @Column(name  = "lead_source" , nullable = true)
    private String leadSource;

    @Column(name  = "lead_status" , nullable = true)
    private LeadStatus leadStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "contact_id" , nullable = false)
    private Contact contacts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "person_id" , nullable = false)
    private Person persons;





}
