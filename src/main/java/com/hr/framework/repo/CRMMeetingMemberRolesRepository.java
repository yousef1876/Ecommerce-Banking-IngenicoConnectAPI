package com.hr.framework.repo;

import com.hr.framework.po.business.crm.meeting.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "meetingRoleMember" , path = "meetingRoleMember")
public interface CRMMeetingMemberRolesRepository extends PagingAndSortingRepository<Role,Long> {

    List<Role> findById(Long id);

}
