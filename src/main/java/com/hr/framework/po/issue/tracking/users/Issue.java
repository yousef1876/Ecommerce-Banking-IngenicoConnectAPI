package com.hr.framework.po.issue.tracking.users;

import com.enums.IssueType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "issues")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Issue extends Auditable<Issue>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "status_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "issue_name" , nullable = false)
	private String issueName;
	
	@Column(name  = "issue_title" , nullable = false)
	private String issueTitle;
	
	@Column(name  = "issue_summary" , nullable = false)
	private String issueSummary;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name  = "note" , nullable = true)
	private String note;
	
	@Column(name  = "estimated_time_date" , nullable = true)
	private  Date estimatedDate;
	
	@Column(name = "actual_spent_date_time" , nullable = false)
	private Date actualSpentDate;
	
	@Column(name  = "usefull_links" , nullable = true)
	private String useFulLink;

	/*Issue Type FK*/
	@Column(name  = "type_id" , nullable = false)
	private IssueType types;


	/*iSSUE Status FK*/
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JoinColumn(name  = "status_id" , nullable = false)
	private IssueStatus status;

	/*Resolution FK*/
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JoinColumn(name  = "resolution_id" , nullable = false)
	private Resolution resolution;

	/*Severity FK*/
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JoinColumn(name  = "severity_id" , nullable = false)
	private Severity severity;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "issues")
	private List<IssueComment> comments;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "issues")
	private List<IssueAttachment> attachments;

	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JoinColumn(name  = "priority_id" , nullable = false)
	private IssuePriority issuePriority;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "project_id" , nullable = false)
	private Project projects;


}
