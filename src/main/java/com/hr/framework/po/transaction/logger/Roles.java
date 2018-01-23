package com.hr.framework.po.transaction.logger;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "roles")
@Data
@Cacheable(true)
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "role_name" , nullable = false)
	private String roleName;
	
	@Column(name  = "description" , nullable = true)
	private String description;
	
	@Column(name  = "note" , nullable = true)
	private String note;
	

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "roles")
	private List<UsersRoleTransactionLogger> usersRoleTransactionLoggers = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "roles")
	private List<Permissions> permissionsList = new ArrayList<>();


}
