package com.hr.framework.po.issue.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name  = "issue_severity")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Severity extends Auditable<Severity>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "server_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "serverity_code" , nullable = false)
	private String serverityCode;
	
	@Column(name  = "serverity_name" , nullable = false)
	private String serverityName;
	
	@Column(name  = "serverity_rank" , nullable = false)
	private String serverityRank;
	
	@Column(name  = "description" , nullable = true)
	private String description;
	
	@Column(name  = "note" , nullable = true)
	private String note;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServerityCode() {
		return serverityCode;
	}

	public void setServerityCode(String serverityCode) {
		this.serverityCode = serverityCode;
	}

	public String getServerityName() {
		return serverityName;
	}

	public void setServerityName(String serverityName) {
		this.serverityName = serverityName;
	}

	public String getServerityRank() {
		return serverityRank;
	}

	public void setServerityRank(String serverityRank) {
		this.serverityRank = serverityRank;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
