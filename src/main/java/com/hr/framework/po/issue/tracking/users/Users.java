package com.hr.framework.po.issue.tracking.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.bug.tracking.users.Groups;
import com.hr.framework.po.horlder.User;

import lombok.Data;


@Entity
@Table(name = "issue_users_account")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Users  extends Auditable<Users>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", updatable = false, nullable = false)
	private Long id;

	@Column(name = "first_name" , nullable = false)
	private String firstName;

	@Column(name = "second_name" , nullable = true)
	private String secondName;

	@Column(name  = "last_name" , nullable = false)
	private String lastName;

	@Column(name  = "user_name" , nullable = false)
	private String userName;

	@Column(name = "password" , nullable = false)
	private String password;

	@Column(name  = "last_login_date" , nullable = false)
	private Date lastLoginDate;

	@Column(name  = "email" , nullable = true)
	private String email;

	@Column(name  = "mobile" , nullable = false)
	private String mobile;

	@Column(name ="phone" , nullable = true)
	private String phone;

	@Column(name = "enabled" , nullable = false)
	private boolean enabled;
	
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "users")
	private List<Project> users = new ArrayList<>();




}
