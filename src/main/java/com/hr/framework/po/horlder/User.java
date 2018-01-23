package com.hr.framework.po.horlder;

import com.hr.framework.listener.PersistentListener;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.hr.framework.po.issue.tracking.users.Issue;
import com.hr.framework.po.issue.tracking.users.Project;
import com.hr.framework.po.transaction.logger.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name = "users")
@EntityListeners({PersistentListener.class})
@NamedEntityGraph(name = "User.roles", attributeNodes = @NamedAttributeNode("roles"))
@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"roles", "accounts"})
@ToString(exclude = {"roles", "accounts"})
@Cacheable(true)
public class User {



  public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public boolean isAccountNonExpiredAlias() {
		return isAccountNonExpiredAlias;
	}

	public void setAccountNonExpiredAlias(boolean isAccountNonExpiredAlias) {
		this.isAccountNonExpiredAlias = isAccountNonExpiredAlias;
	}

	public boolean isAccountNonLockedAlias() {
		return isAccountNonLockedAlias;
	}

	public void setAccountNonLockedAlias(boolean isAccountNonLockedAlias) {
		this.isAccountNonLockedAlias = isAccountNonLockedAlias;
	}

	public boolean isCredentialsNonExpiredAlias() {
		return isCredentialsNonExpiredAlias;
	}

	public void setCredentialsNonExpiredAlias(boolean isCredentialsNonExpiredAlias) {
		this.isCredentialsNonExpiredAlias = isCredentialsNonExpiredAlias;
	}

	public boolean isEnabledAlias() {
		return isEnabledAlias;
	}

	public void setEnabledAlias(boolean isEnabledAlias) {
		this.isEnabledAlias = isEnabledAlias;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getLastLoginAt() {
		return lastLoginAt;
	}

	public void setLastLoginAt(long lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	public List<Project> getUsers() {
		return users;
	}

	public void setUsers(List<Project> users) {
		this.users = users;
	}

public User(){}
  
  @GenericGenerator(
      name = "userSequenceGenerator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
          @Parameter(name = "sequence_name", value = "users_seq"),
          @Parameter(name = "initial_value", value = "1"),
          @Parameter(name = "increment_size", value = "1")
      }
  )
  @Id
  @GeneratedValue(generator = "userSequenceGenerator")
  @Column(updatable = false)
  private long id;

  @NotEmpty
  @Column(length = 50)
  private String name;

  @NotEmpty
  @Column(nullable = false, length = 20)
  private String usr;

  @NotEmpty
  @Column(nullable = false, length = 200)
  private String pwd;

  @Column(nullable = false)
  @Builder.Default
  private boolean isAccountNonExpiredAlias = true;

  @Column(nullable = false)
  @Builder.Default
  private boolean isAccountNonLockedAlias = true;

  @Column(nullable = false)
  @Builder.Default
  private boolean isCredentialsNonExpiredAlias = true;

  @Column(nullable = false)
  @Builder.Default
  private boolean isEnabledAlias = true;


  @Column(columnDefinition = "TEXT")
  private String description;

  // Last login time
  @Builder.Default
  private long lastLoginAt = System.currentTimeMillis();

  // Last login IP address
  private String ip;


  @Version
  @Column(nullable = false)
  private int version;

  @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
  @JoinTable(name = "users_has_roles",
      joinColumns = {@JoinColumn(name = "user_id")},
      inverseJoinColumns = {@JoinColumn(name = "role_id")})
  private Set<Role> roles;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.REMOVE)
    private Set<Account> accounts;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "users" , cascade = CascadeType.ALL )
    private List<Project> users;


    @Column(name  = "username" , nullable = false)
    private String username;
}
