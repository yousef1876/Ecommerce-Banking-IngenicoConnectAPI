package com.hr.framework.po.bug.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "users_bugs")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Users extends Auditable<Users>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", updatable = false, nullable = false)
	private Long id;
	
	
	@Column(name = "username" , nullable = false)
	private String username;
	
	@Column(name = "password" , nullable = false)
	private String password;
	
	@Column(name = "first_name" , nullable = false)
	private String firstName;
	
	@Column(name = "second_name" , nullable = true)
	private String secondName;
	
	@Column(name = "last_name" , nullable = true)
	private String lastName;
	
	@Column(name = "is_active" , nullable = false)
	private boolean isActive;
	
	@Column(name = "is_blocked" , nullable = true)
	private boolean isBlocked = false;
	
	@Column(name = "deleted" , nullable = false)
	private boolean deleted;

	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="manager_id")
	private Users manager;

	/*@OneToMany(mappedBy="manager")
	private Set<Users> subordinates = new HashSet<Users>();*/
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "issues_users_groups_accounts", catalog = "crmmix", joinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false) },inverseJoinColumns = { @JoinColumn(name = "group_id",nullable = false, updatable = false) })
	private List<Groups> users;

	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "users")
	private List<TaskStatus> status;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
}
