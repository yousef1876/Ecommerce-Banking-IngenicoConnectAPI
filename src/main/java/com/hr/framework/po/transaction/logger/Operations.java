package com.hr.framework.po.transaction.logger;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "methods_operation")
@Data
@Cacheable(true)
public class Operations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "operation_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "methods" , nullable = false)
	private String method; 
	
	@Column(name  = "operation" , nullable = false)
	private String operation;
	
	@Column(name  = "clazz" , nullable = false)
	private String clazz;
	
	@Column(name  = "package_name" , nullable = false)
	private String packageName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "permission_id" , nullable = false)
	private Permissions permissions;
}
