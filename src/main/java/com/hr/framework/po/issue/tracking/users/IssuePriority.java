package com.hr.framework.po.issue.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "issue_priority")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class IssuePriority extends Auditable<IssuePriority>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "priority_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "code" , nullable = false)
	private String code;
	
	@Column(name  = "rank" , nullable = false)
	private String rank;
	
	@Column(name  = "dewscription" , nullable = true)
	private String description;
	
	@Column(name  = "note" , nullable = true)
	private String note;

}
