package com.hr.framework.po.bug.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.TimeSheet;
import lombok.Data;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "projects")
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
	
	@Column(name  = "project_title" , nullable = false)
	private String projectTitle;
	
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name = "to_date" , nullable = false)
	private Date toDate;
	
	@Column(name = "note" , nullable = true)
	private String notes;
	
	@Column(name = "description" , nullable = true)
	private String description;


	@OneToMany(mappedBy = "projects" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private List<Attachment> attchments;

	@OneToMany(mappedBy = "projects" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Phases> phases;

	@OneToMany(mappedBy = "projects" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<ProjectVersion> versions;

	@OneToMany(mappedBy = "projects" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<TaskAssignee> assignTasksAssignee;


	@OneToMany(mappedBy = "projects" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Tasks> assignTasks;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "projects")
	private List<TimeSheet> sheets;
	
}
