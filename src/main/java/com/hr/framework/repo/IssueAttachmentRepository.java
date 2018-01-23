package com.hr.framework.repo;


import com.hr.framework.po.issue.tracking.users.IssueAttachment;
import com.hr.framework.projections.issues.IssueAttachmentProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "issueAttachment" , path = "issueAttachment" , excerptProjection = IssueAttachmentProjection.class)
public interface IssueAttachmentRepository extends PagingAndSortingRepository<IssueAttachment,Long>{


    List<IssueAttachment> findById(Long id);


}
