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
package com.hr.framework.po.survey.jsurvey.setting;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*import com.jd.survey.util.SortedSetUpdater;*/


import com.hr.framework.po.survey.jsurvey.QuestionAnswer;
import com.hr.framework.util.SortedSetUpdater;
import lombok.Data;
import org.hibernate.annotations.Sort;
import org.hibernate.annotations.SortType;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@NamedQueries({
	@NamedQuery(name = "Question.findAll", query = "select o from Question o"),
	@NamedQuery(name = "Question.findById", query = "select o from Question o where o.id = ?1"),
	@NamedQuery(name = "Question.findByOrder", query = "select q from Question q inner join q.page p inner join p.surveyDefinition sd  where sd.id = ?1 and p.order = ?2 and q.order=?3"),
	@NamedQuery(name = "Question.getCount", query = "select count(o) from Question o"),
	@NamedQuery(name = "Question.deleteBySurveyDefinitionPageId", query = "delete from Question o where o.page.id=?1")
})
@Table(name = "questions")
@Data
public class Question 	{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Version
	@Column(name = "version")
	private Integer version;

	@NotNull
	@Column(name = "QUESTION_ORDER")
	private Short order;

	@NotNull
	@NotEmpty
	@Size(max = 2000)
	@Column(length = 2000, nullable= false)
	private String questionText;
	
	// Used to stored question text piped content 
	@Transient
	private String questionLabel;

	@Size(max = 750)
	@Column(length = 750, nullable= true)
	private String multimediaLink;
	
	private Integer height;
	private Integer width;
	
	private Boolean allowOtherTextBox;

	private Boolean required;
	private Boolean visible;

	private Integer integerMinimum;
	private Integer integerMaximum;

	private BigDecimal decimalMinimum;
	private BigDecimal decimalMaximum;
	
	private Boolean randomizeOptions = false;

	
	@DateTimeFormat(pattern="#{messages['date_format']}")
	private Date dateMinimum;

	
	@DateTimeFormat(pattern="#{messages['date_format']}")
	private Date dateMaximum;


	@Size(max = 2000)
	@Column(length = 2000, nullable= true)
	private String tip;

	
	@Size(max = 250)
	@Column(length = 250, nullable= true)
	private String regularExpression;
	

	private Long dataSetId;	
	
	
	@Enumerated(EnumType.STRING)
    private QuestionType type = QuestionType.SHORT_TEXT_INPUT;
	
	@Enumerated(EnumType.STRING)
    private QuestionDirection direction = QuestionDirection.VERTICAL;	
	

	@NotNull
	@ManyToOne
	@JoinColumn(name = "SURVEY_DEFINITION_PAGE_ID")
	private SurveyDefinitionPage page;

	
	@OneToMany(cascade = CascadeType.REMOVE,fetch=FetchType.LAZY, mappedBy="questions")
	private List<QuestionOption> options = new ArrayList<QuestionOption>();


	@OneToMany(cascade = CascadeType.REMOVE,fetch=FetchType.LAZY, mappedBy="questions")
	private List<QuestionRowLabel> questionRowLabels = new ArrayList<>();
	
	
	@OneToMany(cascade = CascadeType.REMOVE,fetch=FetchType.LAZY, mappedBy="question")
	private List<QuestionColumnLabel> columnLabels = new ArrayList<QuestionColumnLabel>();

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "question")
	private List<QuestionAnswer>  questionAnswerList = new ArrayList<>();
	
	
}
