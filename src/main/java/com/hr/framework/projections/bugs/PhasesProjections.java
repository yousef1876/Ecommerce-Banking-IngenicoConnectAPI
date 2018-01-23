package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.Phases;
import com.hr.framework.po.bug.tracking.users.Project;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "phaseProjection" , types = {Phases.class})

public interface PhasesProjections {

    String getPhaseTitle();


    String getPhaseName();


    Project getProjects();


    Long getId();

}
