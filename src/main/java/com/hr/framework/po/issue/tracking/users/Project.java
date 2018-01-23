package com.hr.framework.po.issue.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.bug.tracking.users.Users;
import com.hr.framework.po.horlder.User;

import lombok.Data;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "issues_projects")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Project extends Auditable<Project>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "project_name" , nullable = false)
	private String projectName;
	
	@Column(name  = "project_title" , nullable = true)
	private String projectTitle;
	
	@Column(name = "from_date" , nullable = false)
	@Temporal(TemporalType.DATE)
	private Date   fromDate;
	
	@Column(name  = "to_date" , nullable = false)
	@Temporal(TemporalType.DATE)
	private Date   toDate;
	
	@Column(name  = "note" , nullable = true)
	private String note;
	
	@Column(name  = "description" , nullable = true)
	private String description;
	
	@Column(name  = "project_code" , nullable = false)
	private String projectCode;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "projects" , cascade = CascadeType.ALL             )
	private List<Issue>  projects;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "user_id" , nullable = false)
	private Users users;
}
