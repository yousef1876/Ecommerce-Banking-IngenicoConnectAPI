package com.hr.framework.repo;


import com.hr.framework.po.person.CountryCode;
import com.hr.framework.projections.persons.CountryCodeProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "countryCode" , path = "countryCode" , excerptProjection = CountryCodeProjection.class)
public interface CountryCodeRepository extends PagingAndSortingRepository<CountryCode,Long>{

    List<CountryCode> findById(Long id);

}
