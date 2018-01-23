package com.hr.framework.po.business.crm.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.po.applicant.Applicant;
import com.hr.framework.po.applicant.ApplicantAttachment;
import com.hr.framework.po.applicant.ApplicantExperience;
import com.hr.framework.po.applicant.ApplicantInterviewedBy;
import com.hr.framework.po.applicant.ApplicantQualification;
import com.hr.framework.po.applicant.ApplicantSkills;
import com.hr.framework.po.applicant.InterviewQuestion;
import com.hr.framework.po.applicant.Interviews;
import com.hr.framework.po.applicant.Positions;
import com.hr.framework.po.bug.tracking.users.Attachment;
import com.hr.framework.po.bug.tracking.users.Bugs;
import com.hr.framework.po.bug.tracking.users.Groups;
import com.hr.framework.po.bug.tracking.users.Phases;
import com.hr.framework.po.bug.tracking.users.Project;
import com.hr.framework.po.bug.tracking.users.ProjectTeamMember;
import com.hr.framework.po.bug.tracking.users.ProjectVersion;
import com.hr.framework.po.bug.tracking.users.TaskAssignee;
import com.hr.framework.po.bug.tracking.users.TaskStatus;
import com.hr.framework.po.bug.tracking.users.Tasks;
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
import com.hr.framework.po.business.crm.orders.OrderEntry;
import com.hr.framework.po.business.crm.orders.OrderRequirements;
import com.hr.framework.po.business.crm.orders.Orders;
import com.hr.framework.po.business.crm.orders.RequestOrders;
import com.hr.framework.po.business.crm.orders.ReturnRequestOrders;
import com.hr.framework.po.business.crm.products.Aos_Quotes_Aos_Invoices_c;
import com.hr.framework.po.business.crm.products.ProductCategories;
import com.hr.framework.po.business.crm.products.ProductMemeber;
import com.hr.framework.po.business.crm.products.Products;
import com.hr.framework.po.business.crm.products.ProductsQuotes;
import com.hr.framework.po.business.crm.products.Quotes;
import com.hr.framework.po.business.crm.taxs.CountriesSalesTax;
import com.hr.framework.po.business.crm.taxs.SalesTax;
import com.hr.framework.po.business.crm.taxs.SalesTaxDetails;
import com.hr.framework.po.business.crm.taxs.SalesTaxTypes;
import com.hr.framework.po.business.crm.taxs.TaxAuthorities;
import com.hr.framework.po.business.crm.taxs.TaxMaster;
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
import com.hr.framework.po.employee.base.Bonus;
import com.hr.framework.po.employee.base.Department;
import com.hr.framework.po.employee.base.Discount;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.EmployeePicture;
import com.hr.framework.po.employee.base.EmployeeType;
import com.hr.framework.po.employee.base.Holidays;
import com.hr.framework.po.employee.base.Hourly;
import com.hr.framework.po.employee.base.JobTitle;
import com.hr.framework.po.employee.base.PayRoll;
import com.hr.framework.po.employee.base.Salary;
import com.hr.framework.po.employee.base.TimeSheet;
import com.hr.framework.po.employee.base.reports.*;
import com.hr.framework.po.employee.performance.EmployeeCourses;
import com.hr.framework.po.employee.performance.EmployeeJobAssignment;
import com.hr.framework.po.employee.performance.EmployeeTrainingHistory;
import com.hr.framework.po.employee.performance.PerformanceReview;
import com.hr.framework.po.issue.tracking.users.Issue;
import com.hr.framework.po.issue.tracking.users.IssueAttachment;
import com.hr.framework.po.issue.tracking.users.IssueComment;
import com.hr.framework.po.issue.tracking.users.IssuePriority;
import com.hr.framework.po.issue.tracking.users.IssueStatus;
import com.hr.framework.po.issue.tracking.users.Resolution;
import com.hr.framework.po.issue.tracking.users.Severity;
import com.hr.framework.po.leave.Leave;
import com.hr.framework.po.leave.LeaveApproval;
import com.hr.framework.po.person.Citizen;
import com.hr.framework.po.person.CountryCode;
import com.hr.framework.po.person.DegreeObtained;
import com.hr.framework.po.person.Employeed;
import com.hr.framework.po.person.Employer;
import com.hr.framework.po.person.Gender;
import com.hr.framework.po.person.Identification;
import com.hr.framework.po.person.Job;
import com.hr.framework.po.person.Passport;
import com.hr.framework.po.person.Person;
import com.hr.framework.po.person.PersonExperience;
import com.hr.framework.po.person.PersonLanguage;
import com.hr.framework.po.person.Skills;
import com.hr.framework.po.person.SkillsProcessed;
import com.hr.framework.po.store.BlogComment;
import com.hr.framework.po.store.BlogCommentRelatedImages;
import com.hr.framework.po.store.BlogPost;
import com.hr.framework.po.store.Customer;
import com.hr.framework.po.store.ForumCategory;
import com.hr.framework.po.store.ForumGroup;
import com.hr.framework.po.store.ForumPost;
import com.hr.framework.po.store.ForumTopic;
import com.hr.framework.po.store.Forums;
import com.hr.framework.po.store.Product;
import com.hr.framework.po.store.ProductCategory;
import com.hr.framework.po.store.ProductQuality;
import com.hr.framework.po.store.QuantityUnit;
import com.hr.framework.po.store.ReturnBackProduct;
import com.hr.framework.po.store.Store;
import com.hr.framework.po.store.StoreAddress;
import com.hr.framework.po.store.StoreContact;
import com.hr.framework.po.store.TierPrice;
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
public class AssignedUsers{


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

    @OneToMany(fetch =  FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<AccountsCases> cases;
    
    
    @OneToMany(fetch =  FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "users")
    private List<AclActions> actions ;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "users")
    private List<Assets> assets =  new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<CallReschedule> callReschedules;
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<Calls> calls;
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<Cases> caeses ;
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "users")
    private List<Contract> contracts ;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<JobQueue> jobQueue ; 

    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<IndexRecordEvent> indexRecordEvent ;
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<AgreementParty> agreementParty ;
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<AgreementRoleType> agreementRoleTypes ;
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<LineItemGroups> lineItemGroups =  new ArrayList<>();
    
    @OneToMany(fetch =  FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<Meeting> meetings = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<Leads> assignedUsers = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<Meeting> meetings2 = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<MeetingInvolved> meetingInvolveds =  new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "users")
    private List<Opportunities> opportunities =  new ArrayList<>();
    
    
    @OneToMany(fetch =  FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "users")
    private List<OrderRequirements> orderRequirements = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<ProductCategories> productCategories = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<Products> products = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<ProductsQuotes> productsQuotes = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<Quotes> quotes = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "billingAccount")
    private List<Quotes> billingAccount =  new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<ForumTopic> forumTopicList = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY ,  mappedBy = "createdBy" , cascade = CascadeType.ALL)
	private List<Holidays> employeesHoliday;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "employees")
    private List<PerformanceReview> performnaces;


    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "createdBy")
    private List<EmployeeEvaluationTemplate> templates = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "createdBy")
    private List<EmployeeAttendanceTracker> trackers = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "createdBy")
    private List<EmployeeScheduleTemplate> scheduleTemplates = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "createdBy")
    private List<HireCheckList> checkLists = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "createdBy")
    private List<MonthlyWorkSchedule> monthlyWorkSchedules = new ArrayList<>() ;


    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "createdBy")
    private List<PayrollTemplate> payrollTemplates = new ArrayList<>();


    @OneToMany(mappedBy = "createdBy" ,  cascade = CascadeType.ALL , fetch =  FetchType.LAZY)
    private List<RecruitingPlan> recruitingPlans = new ArrayList<>();

    @OneToMany(mappedBy = "createdBy" ,  cascade = CascadeType.ALL , fetch =  FetchType.LAZY)
    private List<TimesheetPlan> timesheetPlans = new ArrayList<>();


    @OneToMany(mappedBy = "createdBy" ,  cascade = CascadeType.ALL , fetch =  FetchType.LAZY)
    private List<TransitionPlanTemplate> transitionPlanTemplates = new ArrayList<>() ;


    @OneToMany(mappedBy = "createdBy" ,  cascade = CascadeType.ALL , fetch =  FetchType.LAZY)
    private List<VacationScheduleTemplate> vacationScheduleTemplates = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ApplicantInterviewedBy> employeeInterviews = new ArrayList<>();



    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<PayRoll> payRolls  = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assignedUsers")
    private List<SalesTaxTypes> salesTaxTypes = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<UsersRoleTransactionLogger> roleTransactionLoggers  = new ArrayList<>(); 
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Resolution> resolutions  = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ProjectVersion>  projectVersions  = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<TaskAssignee>  taskAssignees  = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Attachment>  attachments   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Groups> groups    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Bugs>   bugs  = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Phases>  phases   = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Project>  projects    = new ArrayList<>();



    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ProjectTeamMember>   projectTeamMembers   = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Tasks> tasks     = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<TaskStatus>  taskStatus     = new ArrayList<>();



    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Users>    users2    = new ArrayList<>();

 
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Applicant>   applicants     = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ApplicantAttachment>    applicantAttachments    = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ApplicantExperience>    applicantExperiences     = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ApplicantQualification>    applicantQualifications      = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ApplicantSkills>     applicantSkills      = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<InterviewQuestion>  interviewQuestions         = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Interviews> interviews          = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Positions>  positions         = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<BillingAccounts>  billingAccounts         = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Agreements>   agreements        = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<AgreementRelatedDocuments>   agreementRelatedDocuments        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Accounts>     accounts2      = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<AccountsCases>    accountsCases       = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<AclActions>    aclActions       = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<AclRoles>    aclRoles       = new ArrayList<>();
    
   
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Actions>    actions2       = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Assets>   assets2        = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<CallContact>     callContacts      = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<CallReschedule>  callReschedules2         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Calls>   calls2        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<CallUsers>  callUsers         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Cases>  cases2         = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Contact>     contacts      = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Contract>  contracts2         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<JobQueue>  jobQueues         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<IndexRecordEvent>  recordEvents         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<LineItemGroups>  itemGroups         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Leads> leads          = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Meeting>  meetings3         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<MeetingInvolved>  involveds         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Role>   roles        = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Rooms>  rooms         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Opportunities>  opportunities2         = new ArrayList<>();
    
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<OrderEntry>  orderEntries         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<OrderRequirements>  requirements         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Orders>  orders         = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<RequestOrders>  requestOrders         = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ReturnRequestOrders>   returnRequestOrders        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Aos_Quotes_Aos_Invoices_c>  cs         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ProductCategories>  categories         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ProductMemeber>  productMemebers         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Products>  listProducts         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ProductsQuotes>  productsQuotes2         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Quotes> quotes2          = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<CountriesSalesTax>  countriesSalesTaxs         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<SalesTax>  salesTaxs         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<SalesTaxDetails>  salesTaxDetails        = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<SalesTaxTypes>  taxTypes        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<TaxAuthorities>  taxAuthorities        = new ArrayList<>(); 
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<TaxMaster>    taxMasters      = new ArrayList<>();  
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<CustomerAddress>  customerAddresses        = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<CustomerIdentification>    customerIdentifications      = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Customers>  customers        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<RelatedDocuments> relatedDocuments         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<PurchasesInvoices>  purchasesInvoices        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<SalesInvoices>  salesInvoices        = new ArrayList<>(); 
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<AgreementParty>    agreementParties      = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Party>  parties        = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<IncomingPayment> incomingPayments         = new ArrayList<>(); 
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<OutGoingPayment>  goingPayments        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Bonus>  bonus        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Department>  departments        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Discount>  discounts        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Employee>  employees        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<EmployeePicture>  employeePictures        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<EmployeeType>  employeeTypes        = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Holidays>  holidays        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Hourly> hours         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<JobTitle>  jobTitles        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<PayRoll>   rolls        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Salary>  salaries         = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<TimeSheet>  timeSheets         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<EmployeeCourses>  employeeCourses         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<EmployeeJobAssignment>  employeeJobAssignments         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<EmployeeTrainingHistory>   employeeTrainingHistories        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<PerformanceReview>   performanceReviews        = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Issue>  issues         = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<IssueAttachment>  issueAttachments         = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<IssueComment>    issueComments = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<IssuePriority>  issuePriorities   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<IssueStatus>  issueStatus   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<com.hr.framework.po.issue.tracking.users.Project>  projects2   = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Severity>  severities   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<com.hr.framework.po.issue.tracking.users.Users>  users3   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Leave>  leaves   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<LeaveApproval>  leaveApprovals   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Citizen> citizens    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<com.hr.framework.po.person.Contact>  contacts2   = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<CountryCode> countryCodes    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<DegreeObtained>  degreeObtaineds   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Employeed> employeeds    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Employer> employers    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Person> persons    = new ArrayList<>(); 
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<PersonExperience> personExperiences    = new ArrayList<>(); 
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<PersonLanguage>  personLanguages   = new ArrayList<>(); 
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Job>  jobs   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Identification> identifications    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Passport> passports    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Skills> skills    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<SkillsProcessed>  skillsProcesseds   = new ArrayList<>(); 
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<BlogComment> blogComments    = new ArrayList<>();
    
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<BlogCommentRelatedImages>  commentRelatedImages   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<BlogPost> blogPosts    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Customer>  customers2   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ForumTopic> forumTopics    = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ForumCategory> forumCategories    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ForumGroup>  forumGroups   = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ForumPost> forumPosts    = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Forums> forums    = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Product> products2    = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ProductCategory>  productCategories2   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ProductQuality>  productQualities   = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<QuantityUnit> quantityUnits    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<ReturnBackProduct> returnBackProducts    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<Store>  stores   = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<StoreAddress> storeAddresses    = new ArrayList<>();
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<StoreContact> storeContacts    = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "createdBy")
    private List<TierPrice> tierPrices    = new ArrayList<>();
    
    
    
    
    

}
