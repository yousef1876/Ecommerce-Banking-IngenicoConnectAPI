package com.hr.framework.repo;

import com.hr.framework.po.business.crm.meeting.Meeting;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel =  "meeting" , path = "meeting")
public interface CRMMeetingRepository extends PagingAndSortingRepository<Meeting,Long>{

    List<Meeting> findById(Long id);
}
