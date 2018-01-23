package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.assets.Assets;
import com.hr.framework.projections.business.crm.CRMAssetsProjection;

@RepositoryRestResource(collectionResourceRel = "crmAssets" , path = "crmAssets" , excerptProjection = CRMAssetsProjection.class)
public interface CRMAssetsRepository extends PagingAndSortingRepository<Assets, Long>{
	
	
	List<Assets> findById(Long id);

}
