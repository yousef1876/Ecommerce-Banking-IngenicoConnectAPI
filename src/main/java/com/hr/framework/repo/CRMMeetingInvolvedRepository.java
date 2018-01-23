package com.hr.framework.repo;

import com.hr.framework.po.business.crm.meeting.MeetingInvolved;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "meetingInvolved" , path = "meetingInvolved")
public interface CRMMeetingInvolvedRepository extends PagingAndSortingRepository<MeetingInvolved,Long>{

    List<MeetingInvolved> findById(Long id);

}
