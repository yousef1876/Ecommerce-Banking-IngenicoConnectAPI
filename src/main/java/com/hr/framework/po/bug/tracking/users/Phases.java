package com.hr.framework.po.bug.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "phases")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Phases extends Auditable<Phases> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "phase_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name ="phase_name" , nullable = false)
	private String phaseName;
	
	@Column(name = "phase_title" , nullable = false)
	private String phaseTitle;
	
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name = "to_date" , nullable = false)
	private Date toDate;
	
	@Column(name = "note" , nullable = true)
	private String note;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	/*Project Version FK*/

	@ManyToOne
	@JoinColumn(name  = "project_id" , nullable = false)
	private Project projects;


	@OneToMany(fetch =  FetchType.LAZY , cascade =  CascadeType.ALL , mappedBy = "phases")
	private List<ProjectVersion> versions;

	@OneToMany(fetch =  FetchType.LAZY , cascade =  CascadeType.ALL , mappedBy = "phases")
	private List<Tasks> versionsTasks;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhaseName() {
		return phaseName;
	}

	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}

	public String getPhaseTitle() {
		return phaseTitle;
	}

	public void setPhaseTitle(String phaseTitle) {
		this.phaseTitle = phaseTitle;
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

	public List<ProjectVersion> getVersions() {
		return versions;
	}

	public void setVersions(List<ProjectVersion> versions) {
		this.versions = versions;
	}
}
