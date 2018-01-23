package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.calls.CallUsers;
import com.hr.framework.projections.business.crm.CRMCallUsersProjection;

@RepositoryRestResource(collectionResourceRel = "crmCallUsers" , path = "crmCallUsers" , excerptProjection = CRMCallUsersProjection.class)
public interface CRMCallUsersRepository extends PagingAndSortingRepository<CallUsers,Long>{
	
	
	List<CallUsers> findById(Long id);

}
