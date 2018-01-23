package com.hr.framework.po.bug.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "project_version")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ProjectVersion extends Auditable<ProjectVersion>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "version_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "version_name" , nullable = false)
	private String versionName;
	
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name = "to_date" , nullable = false)
	private Date toDate;
	
	@Column(name = "version_number" , nullable = false)
	private String versionNumber;
	
	@Column(name = "dead_line" , nullable = false)
	private Date deadLine;
	
	@Column(name  = "note" , nullable = true)
	private String note;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	/*Project FK*/

	@ManyToOne
	@JoinColumn(name = "project_id" , nullable = false)
	private Project projects;


	@ManyToOne
	@JoinColumn(name  = "phase_id" , nullable = false)
	private  Phases phases;

	@OneToMany(fetch = FetchType.LAZY , mappedBy =  "versions" , cascade = CascadeType.ALL)
	private List<TaskAssignee> assignTasksAssignee;

	@OneToMany(fetch = FetchType.LAZY , mappedBy =  "versions" , cascade = CascadeType.ALL)
	private List<Tasks> assignTasks;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}

	public Phases getPhases() {
		return phases;
	}

	public void setPhases(Phases phases) {
		this.phases = phases;
	}

	public List<TaskAssignee> getAssignTasksAssignee() {
		return assignTasksAssignee;
	}

	public void setAssignTasksAssignee(List<TaskAssignee> assignTasksAssignee) {
		this.assignTasksAssignee = assignTasksAssignee;
	}

	public List<Tasks> getAssignTasks() {
		return assignTasks;
	}

	public void setAssignTasks(List<Tasks> assignTasks) {
		this.assignTasks = assignTasks;
	}
}
