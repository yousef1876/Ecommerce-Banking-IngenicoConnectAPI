package com.hr.framework.repo;

import java.util.List;

import com.hr.framework.po.address.City;
import com.hr.framework.projections.adresses.CityProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "city", path = "city" , excerptProjection = CityProjection.class)
public interface CityRepository extends PagingAndSortingRepository<City, Long> {

    List<City> findByCity(@Param("name") String name);
    List<City> findById(@Param("id") String id);

}