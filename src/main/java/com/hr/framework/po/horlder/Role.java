package com.hr.framework.po.horlder;


import com.hr.framework.listener.PersistentListener;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Authorized roles, provide for spring security.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 6/23/15
 * @since JDK1.8
 */
@Entity
@Table(name = "roles")
@EntityListeners({PersistentListener.class})
@NamedEntityGraph(name = "Role.resources", attributeNodes = @NamedAttributeNode("resources"))
@Data
@Builder
/*@NoArgsConstructor*/
@AllArgsConstructor
@EqualsAndHashCode(exclude = "users")
@ToString(exclude = "users")
@Cacheable(true)
public class Role implements Serializable {

  private static final long serialVersionUID = -5193344128221526323L;

  public Role(){}
  
  
  @GenericGenerator(
      name = "roleSequenceGenerator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
          @Parameter(name = "sequence_name", value = "roles_seq"),
          @Parameter(name = "initial_value", value = "1"),
          @Parameter(name = "increment_size", value = "1")
      }
  )
  @Id
  @GeneratedValue(generator = "roleSequenceGenerator")
  @Column(updatable = false)
  private long id;

  @NotEmpty
  @Column(unique = true, nullable = false, length = 20)
  private String name;

  @Column(length = 500)
  private String description;



  /*@Column(nullable = false, updatable = false)
  private long createdAt;

  @Column(nullable = false, updatable = false)
  private long createdBy;

  @Column(nullable = false)
  private long lastModifiedAt;

  @Column(nullable = false)
  private long lastModifiedBy;*/

  @Version
  @Column(nullable = false)
  private int version;

  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles", cascade = CascadeType.REFRESH)
  private Set<User> users;

  @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH})
  @JoinTable(name = "roles_has_resources",
      joinColumns = {@JoinColumn(name = "role_id")},
      inverseJoinColumns = {@JoinColumn(name = "resource_id")})
  private Set<Resource> resources;

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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}



public int getVersion() {
	return version;
}

public void setVersion(int version) {
	this.version = version;
}

public Set<User> getUsers() {
	return users;
}

public void setUsers(Set<User> users) {
	this.users = users;
}

public Set<Resource> getResources() {
	return resources;
}

public void setResources(Set<Resource> resources) {
	this.resources = resources;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}




}
