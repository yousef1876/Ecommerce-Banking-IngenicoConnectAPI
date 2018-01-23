package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.aclactions.AclRoles;
import com.hr.framework.projections.business.crm.CRMAclRoleProjection;

@RepositoryRestResource(collectionResourceRel = "crmAclRole" , path = "crmAclRole" , excerptProjection = CRMAclRoleProjection.class)
public interface CRMAclRolesRepository extends PagingAndSortingRepository<AclRoles, Long> {

	List<AclRoles> findByRoleName(String id);
	
}
