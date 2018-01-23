package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.Attachment;
import com.hr.framework.projections.bugs.AttachmentBugsProjections;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "bugsAttachment" , path = "bugsAttachment" , excerptProjection = AttachmentBugsProjections.class)
public interface AttachmentRepository {


    List<Attachment> findById(Long id);



}
