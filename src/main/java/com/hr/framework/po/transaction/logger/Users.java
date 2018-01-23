package com.hr.framework.po.transaction.logger;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.hr.framework.po.bug.tracking.users.Groups;
import lombok.Data;

@Entity
@Table(name = "transaction_users")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@Cacheable(true)
public class Users  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "first_name" , nullable = false)
	private String firstName;

	@Column(name  = "last_name" , nullable = false)
	private String lastName;

	@Column(name  = "second_name" , nullable = true)
	private String secondName;

	@Column(name  = "email" , nullable = true)
	private String email;

	@Column(name  = "phone" , nullable = true)
	private String phone;

	@Column(name = "mobile" , nullable = true)
	private String mobile;

	@Column(name  = "user_name" , nullable = false)
	private String userName;

	@Column(name  = "password" , nullable = false)
	private String password;

	@Column(name  = "can_view" , nullable = true)
	private boolean canView;

	@Column(name = "can_edit" , nullable = true)
	private boolean canEdit;

	@Column(name  = "can_insert" , nullable = true)
	private boolean canInsert;
	
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "users")
	private List<UsersRoleTransactionLogger> usersRoleTransactionLoggers = new ArrayList<>();
	
}
