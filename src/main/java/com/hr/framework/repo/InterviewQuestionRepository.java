package com.hr.framework.repo;

import com.hr.framework.po.applicant.InterviewQuestion;
import com.hr.framework.projections.applicant.InterviewQuestionProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "questions" , path = "questions" , excerptProjection = InterviewQuestionProjection.class)
public interface InterviewQuestionRepository extends PagingAndSortingRepository<InterviewQuestion,Long>{

    List<InterviewQuestion> findById(Long id);





}
