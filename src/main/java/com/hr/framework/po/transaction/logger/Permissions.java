package com.hr.framework.po.transaction.logger;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "role_access_permission")
@Data
@Cacheable(true)
public class Permissions{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "permission_id", updatable = false, nullable = false)
	private Long id;
	
	
	@Column(name  = "can_view" , nullable = false)
	private boolean canView;
	
	@Column(name = "can_edit" , nullable = false)
	private boolean canEdit;
	
	@Column(name  = "can_insert" , nullable = false)
	private boolean canInsert;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id" , nullable = false )
	private Roles roles;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "permissions")
    private List<Operations> operationsList = new ArrayList<>();



}
