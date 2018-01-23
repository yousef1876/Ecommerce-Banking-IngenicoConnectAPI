package com.hr.framework.repo;

import com.hr.framework.po.applicant.ApplicantAttachment;
import com.hr.framework.projections.applicant.ApplicantAttachmentProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "attachment" , path = "attachment" , excerptProjection = ApplicantAttachmentProjection.class)
public interface ApplicantAttachmentRepository extends PagingAndSortingRepository<ApplicantAttachment,Long>{

    List<ApplicantAttachment> findById(@Param("id") String id);

}
