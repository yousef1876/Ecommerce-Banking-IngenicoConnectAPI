  /*Copyright (C) 2014  JD Software, Inc.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
  */
package com.hr.framework.po.survey.jsurvey;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.hr.framework.po.survey.jsurvey.setting.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.validator.routines.DateValidator;
import org.mvel2.MVEL;

import javax.persistence.*;

/*import com.jd.survey.domain.settings.GroupingOperator;
import com.jd.survey.domain.settings.LogicalCondition;
import com.jd.survey.domain.settings.PageLogic;
import com.jd.survey.domain.settings.Question;
import com.jd.survey.domain.settings.QuestionType;
import com.jd.survey.domain.settings.SurveyDefinitionPage;*/


@Entity
@NamedQueries({
	@NamedQuery(name = "SurveyPage.findAll", query = "select o from SurveyPage o"),
	@NamedQuery(name = "SurveyPage.findById", query = "select o from SurveyPage o where o.id = ?1"),
	@NamedQuery(name = "SurveyPage.findByPageOrder", query = "select o from SurveyPage o where o.survey.id = ?1 and o.order=?2"),
	@NamedQuery(name = "SurveyPage.getCount", query = "select count(o) from SurveyPage o")
	})
@Cacheable(true)
public class SurveyPage {
	
		private static final long serialVersionUID = -8982532265326369227L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;


        @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name  = "survey_id" , nullable = false)
	    private Survey survey;

        @Column(name  = "orderNo" , nullable = false)
	    private Short order;

	    private String title;

	    private String instructions;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name  = "question_answer_id" , nullable = false)
	    private QuestionAnswer questionAnswers ;
	    
	    
	    //private String visibilityExpression;
	    private boolean randomizeQuestions = false;    
	    private boolean visible = true;
	    
	    public SurveyPage() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
	    public SurveyPage(Survey survey, SurveyDefinitionPage surveyDefinitionPage) {
	    		super();
	    		this.survey=survey;
	    		this.order=surveyDefinitionPage.getOrder();
	    		this.title = surveyDefinitionPage.getTitle();
	    		this.instructions  =  surveyDefinitionPage.getInstructions();
	    		//this.visibilityExpression = surveyDefinitionPage.getVisibilityExpression();
	    		this.randomizeQuestions = surveyDefinitionPage.getRandomizeQuestions();
	    		
	    
	    		
	    }
	    
	    /*
	    public void UpdateSettings(SurveyPage surveyPage) {
	    	this.order=surveyPage.getOrder();
    		this.title = surveyPage.getTitle();
    		this.instructions  =  surveyPage.getInstructions();
    		this.visibilityExpression = surveyPage.getVisibilityExpression();
	    	for (int i = 0;  i < this.questionAnswers.size() ;i++){
    			this.questionAnswers.get(i).UpdateSettings(surveyPage.questionAnswers.get(i));
    		}
	    } 
	    */
	    
		public Survey getSurvey() {
			return survey;
		}


		public void setSurvey(Survey survey) {
			this.survey = survey;
		}


		public Short getOrder() {
			return order;
		}
		public void setOrder(Short order) {
			this.order = order;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		
		
		public String getInstructions() {
			return instructions;
		}


		public void setInstructions(String instructions) {
			this.instructions = instructions;
		}

	
}
