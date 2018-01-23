package com.hr.framework.repo;

import com.hr.framework.po.business.crm.meeting.Rooms;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "meetingRoom" , path = "meetingRoom")
public interface CRMMeetingRoomRepository extends PagingAndSortingRepository<Rooms,Long>{

    List<Rooms> findById(Long id);

}
