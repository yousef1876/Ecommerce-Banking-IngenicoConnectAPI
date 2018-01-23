package com.embedded.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class CompositeKeySurvey implements Serializable {

	@Column( name  = "question_id" , nullable = false)
	private String questionId;
	
	@Column(name  = "choice_no" , nullable = true)
	private String choiceNo;
	
	@Column(name  = "choice_name" , nullable = true)
	private String choiceName;
	
	@Column(name  = "text" , nullable = false)
	private String choiceText;
	
	
}
