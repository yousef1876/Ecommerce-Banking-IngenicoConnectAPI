package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.contact.Contact;
import com.hr.framework.projections.business.crm.CRMContactProjection;

@RepositoryRestResource(collectionResourceRel = "crmContact" , path = "crmContact" , excerptProjection = CRMContactProjection.class)
public interface CRMContactRepository extends PagingAndSortingRepository<Contact,Long>{
	
	List<Contact> findById(Long id);

}
