package com.hr.framework.repo;

import com.hr.framework.po.applicant.Applicant;
import com.hr.framework.projections.applicant.ApplicantProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "applicant" , path = "applicant" , excerptProjection = ApplicantProjection.class)
public interface ApplicantRepository extends PagingAndSortingRepository<Applicant,Long>{

List<Applicant> findByFirstName(@Param("firstName") String firstName);

List<Applicant> findById(@Param("id") String id);

List<Applicant> findBySecondName(@Param("secondName") String secondName);

List<Applicant> findByIdNo(@Param("idno") String idno);

List<Applicant> findByMobile(@Param("mobile") String mobile);

List<Applicant> findByPhone(@Param("phone") String phone);

List<Applicant> findByPassportNo(@Param("passport") String passport);

}
