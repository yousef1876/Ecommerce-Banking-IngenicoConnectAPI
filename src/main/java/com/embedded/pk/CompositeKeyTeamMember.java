package com.embedded.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class CompositeKeyTeamMember implements Serializable{
	    @Column(name = "user_id")
	    private long userId;
	    
	    
	    
	    @Column(name = "project_version_id")
	    private long versionId;
}
