package com.hr.framework.po.issue.tracking.users;

import com.hr.framework.annotation.SizeField;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;
import springfox.documentation.spring.web.scanners.ApiListingScanner;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name  = "issue_status")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class IssueStatus extends Auditable<IssueStatus>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "status_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "status" , nullable = false)
	private String status;
	
	@Column(name  = "rank" , nullable = false)
	private String rank;
	
	@Column(name  = "note" , nullable = true)
	private String note;
	
	@Column(name  = "description" , nullable = true)
	private String description;





}
