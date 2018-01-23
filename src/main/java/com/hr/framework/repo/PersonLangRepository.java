package com.hr.framework.repo;

import com.hr.framework.po.person.PersonLanguage;
import com.hr.framework.projections.persons.PersonLanguageProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "personLanguage" , path = "personLanguage" , excerptProjection = PersonLanguageProjection.class)
public interface PersonLangRepository extends PagingAndSortingRepository<PersonLanguage,Long>{


}
