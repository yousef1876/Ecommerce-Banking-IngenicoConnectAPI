package com.hr.framework.po.employee.base;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name  = "employee_picture")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class EmployeePicture extends Auditable<EmployeePicture>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name = "image" , nullable = false)
	@Lob
	private byte[] picture;

	@Column(name  = "file_name" , nullable = false)
	private String file;


	@ManyToOne(fetch =  FetchType.LAZY)
	@JoinColumn(name  = "employee_id" , nullable = false)
	private Employee employees;






}
