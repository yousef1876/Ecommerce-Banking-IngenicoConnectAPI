package com.hr.framework.repo;

import com.hr.framework.po.address.State;
import com.hr.framework.projections.adresses.StateProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource( collectionResourceRel = "state" , path = "state" , excerptProjection = StateProjection.class)
public interface StateRepository extends PagingAndSortingRepository<State,Long> {

    List<State> findById(@Param("id") String id);


    List<State> findByStateCode(@Param("code") String code);


    List<State> findByState(@Param("state") String state);

}
