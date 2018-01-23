package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.Attachment;
import com.hr.framework.po.bug.tracking.users.Project;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "attachment_bugs" , types = {Attachment.class})
public interface AttachmentBugsProjections {

    String getFileName();

    Long getId();

    Project getProjects();


}
