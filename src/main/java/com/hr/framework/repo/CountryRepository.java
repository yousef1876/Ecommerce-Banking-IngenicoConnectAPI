package com.hr.framework.repo;

import com.hr.framework.po.address.Country;
import com.hr.framework.projections.adresses.CountryProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "country" , path = "country" , excerptProjection = CountryProjection.class)
public interface CountryRepository extends PagingAndSortingRepository<Country,Long> {

    List<Country> findById(@Param("id") Long id);
    List<Country> findByCountryName(@Param("countryName") String countryName);


}
