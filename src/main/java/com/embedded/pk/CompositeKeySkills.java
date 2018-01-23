package com.embedded.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class CompositeKeySkills implements Serializable {
	
	    @Column(name = "person_id")
	    private long personId;
	    
	    
	    
	    @Column(name = "skill_id")
	    private long skillId;
}
