package com.hr.framework.projections.persons;


import com.hr.framework.po.person.Person;
import com.hr.framework.po.person.Skills;
import com.hr.framework.po.person.SkillsProcessed;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "skillsProcessedProjection" , types = {SkillsProcessed.class})
public interface SkillsProcessedPersonProjection {

    Long getId();

    Date getLastUsed();

    Skills getSkills();


    Person getPersons();

}
