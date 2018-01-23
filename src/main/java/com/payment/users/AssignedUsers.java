package com.payment.users;

import com.hr.framework.po.applicant.*;
import com.hr.framework.po.bug.tracking.users.*;
import com.hr.framework.po.bug.tracking.users.Project;
import com.hr.framework.po.bug.tracking.users.Users;
import com.hr.framework.po.business.accounts.BillingAccounts;
import com.hr.framework.po.business.agreements.AgreementRoleType;
import com.hr.framework.po.business.agreements.Agreements;
import com.hr.framework.po.business.agreements.documents.AgreementRelatedDocuments;
import com.hr.framework.po.business.crm.Accounts;
import com.hr.framework.po.business.crm.AccountsCases;
import com.hr.framework.po.business.crm.aclactions.AclActions;
import com.hr.framework.po.business.crm.aclactions.AclRoles;
import com.hr.framework.po.business.crm.aclactions.Actions;
import com.hr.framework.po.business.crm.assets.Assets;
import com.hr.framework.po.business.crm.calls.CallContact;
import com.hr.framework.po.business.crm.calls.CallReschedule;
import com.hr.framework.po.business.crm.calls.CallUsers;
import com.hr.framework.po.business.crm.calls.Calls;
import com.hr.framework.po.business.crm.cases.Cases;
import com.hr.framework.po.business.crm.contact.Contact;
import com.hr.framework.po.business.crm.contract.Contract;
import com.hr.framework.po.business.crm.crons.jobs.queue.JobQueue;
import com.hr.framework.po.business.crm.events.IndexRecordEvent;
import com.hr.framework.po.business.crm.items.LineItemGroups;
import com.hr.framework.po.business.crm.leads.Leads;
import com.hr.framework.po.business.crm.meeting.Meeting;
import com.hr.framework.po.business.crm.meeting.MeetingInvolved;
import com.hr.framework.po.business.crm.meeting.Role;
import com.hr.framework.po.business.crm.meeting.Rooms;
import com.hr.framework.po.business.crm.opportunities.Opportunities;
import com.hr.framework.po.business.crm.orders.*;
import com.hr.framework.po.business.crm.products.*;
import com.hr.framework.po.business.crm.taxs.*;
import com.hr.framework.po.business.customers.CustomerAddress;
import com.hr.framework.po.business.customers.CustomerIdentification;
import com.hr.framework.po.business.customers.Customers;
import com.hr.framework.po.business.customers.documents.RelatedDocuments;
import com.hr.framework.po.business.invoices.PurchasesInvoices;
import com.hr.framework.po.business.invoices.SalesInvoices;
import com.hr.framework.po.business.parties.AgreementParty;
import com.hr.framework.po.business.parties.Party;
import com.hr.framework.po.business.payments.IncomingPayment;
import com.hr.framework.po.business.payments.OutGoingPayment;
import com.hr.framework.po.employee.base.*;
import com.hr.framework.po.employee.base.reports.*;
import com.hr.framework.po.employee.performance.EmployeeCourses;
import com.hr.framework.po.employee.performance.EmployeeJobAssignment;
import com.hr.framework.po.employee.performance.EmployeeTrainingHistory;
import com.hr.framework.po.employee.performance.PerformanceReview;
import com.hr.framework.po.issue.tracking.users.*;
import com.hr.framework.po.leave.Leave;
import com.hr.framework.po.leave.LeaveApproval;
import com.hr.framework.po.person.*;
import com.hr.framework.po.store.*;
import com.hr.framework.po.transaction.logger.UsersRoleTransactionLogger;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "assigned_users")
@Data
@Cacheable(true)
public class AssignedUsers {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    /*@Column(name = "login" , nullable = false)
    private String login;

    @Column(name  = "password" , nullable = false)
    private String password;*/

    @Column(name  = "first_name" , nullable = false)
    private String firstName;

    @Column(name  = "second_name" , nullable = true)
    private String secondName;

    @Column(name  = "last_name" , nullable = false)
    private String lastName;

    @Column(name  = "pw_last_changed" , nullable = true)
    private Date pwdlastChanged;

    @Column(name  = "auth_id" , nullable = false)
    private String authenticateId;

    @Column(name = "is_admin" , nullable = true)
    private boolean isAdmin;

    @Column(name = "is_deleted" , nullable = true)
    private boolean isDeleted;

    @Column(name  = "super_admin" , nullable = true)
    private boolean superAdmin;

    @Column(name  = "title" , nullable = true)
    private String title;

    @Column(name  = "phone_home" , nullable = true)
    private String phoneHome;

    @Column(name  = "mobile_home" , nullable = true)
    private String mobileHome;

    @Column(name  = "mobile_work" , nullable = true)
    private String mobileWork;

    @Column(name  = "phone_work" , nullable = true)
    private String phoneWork;

    @Column(name  = "is_accessible" , nullable = true)
    private boolean isAccessible;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "account_id" , nullable = false)
    private Accounts accounts;


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "acl_role_users",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<AclRoles> users = new ArrayList<>();


    
    
    
    
    

}
