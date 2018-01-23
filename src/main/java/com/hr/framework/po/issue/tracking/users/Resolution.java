package com.hr.framework.po.issue.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "issue_resolution")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Resolution extends Auditable<Resolution>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "solution_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "summary" , nullable = false)
	private String summary;
	
	@Column(name  = "note" , nullable = true)
	private String note;
	
	@Column(name  = "description" , nullable = true)
	private String description;
	
	/*@Column(name  = "added_date" , nullable = false)
	private Date addedDate;*/
	
	/*@Column(name  = "added_by" , nullable = false)
	private Users addedBy;*/
	
	/*@Column(name  = "modified_date" , nullable = true)
	private Date modifiedDate;*/
	
	/*@Column(name = "modified_by" , nullable = true)
	private Users modifiedBy;*/

	
}
