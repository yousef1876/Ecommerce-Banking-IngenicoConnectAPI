package com.hr.framework.repo;


import com.hr.framework.po.person.LanguageCode;
import com.hr.framework.projections.persons.LanguageCodeProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "languageCodePerson"  , path = "languageCodePerson" , excerptProjection = LanguageCodeProjection.class)
public interface PersonLanguageCodeRepository extends PagingAndSortingRepository<LanguageCode,Long>{

    List<LanguageCode> findById(Long id);

}
