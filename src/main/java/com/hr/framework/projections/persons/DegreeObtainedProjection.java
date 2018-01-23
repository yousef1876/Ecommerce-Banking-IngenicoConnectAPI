package com.hr.framework.projections.persons;

import com.enums.UniversityDegreeTyped;
import com.hr.framework.po.person.DegreeObtained;
import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "degreeObtainedProjection" , types = {DegreeObtained.class})
public interface DegreeObtainedProjection {

    Long getId();


    String getUniversityName();


    Date getFromDate();

    Date getToDate();


    String getUniversityPlace();


    boolean getIscompleted();


    String getFacultyName();


    String getMajorName();


    String getGPA();


    UniversityDegreeTyped getTyped();


    Person getPersons();

}
