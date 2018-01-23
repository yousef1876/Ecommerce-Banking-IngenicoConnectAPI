package com.hr.framework.po.bug.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.TransitionPlanTemplate;
import lombok.Data;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Tasks extends Auditable<Tasks>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "task_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "task_name" , nullable = false)
	private String taskName;
	
	@Column(name  = "task_title" , nullable = false)
	private String taskTitle;
	
	@Column(name  = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name  = "to_date" , nullable = true)
	private Date toDate;
	
	@Column(name  = "description" , nullable = true)
	private String description;
	
	@Column(name  = "note" , nullable = true)
	private String note;
	
	@Column(name = "modified_date" , nullable = true)
	private Date modifiedDate;
	
	@Column(name = "added_date" , nullable = true)
	private Date addedDate;
	
	/*AddedBy FK*/
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "employee_added_id" , nullable = false)
	private Employee employees;


	/*Modified BY FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "employee_modified_id" , nullable = true)
	private Employee employeesModified;

	/*Phase FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phase_id" , nullable = false)
	private Phases phases;

	/*Project FK*/
	@ManyToOne(fetch =  FetchType.LAZY)
	@JoinColumn(name  = "project_id" , nullable = false)
	private Project projects;

	/*Project Version FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "version_id" , nullable = false)
	private ProjectVersion versions;

	/* Assign TO FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "assign_to" , nullable = false)
	private Employee assignTo;

	@OneToMany(fetch = FetchType.LAZY , cascade =  CascadeType.ALL ,   mappedBy = "tasks")
	private List<TransitionPlanTemplate> transitionPlanTemplates;

     @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "tasks")
	 private List<TaskStatus> status;
}
