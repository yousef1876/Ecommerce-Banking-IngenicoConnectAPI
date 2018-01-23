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


import java.util.Arrays;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.hr.framework.po.survey.jsurvey.setting.DataSetItem;
import com.hr.framework.po.survey.jsurvey.setting.Question;
import com.hr.framework.po.survey.jsurvey.setting.QuestionOption;
import lombok.Data;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.routines.BigDecimalValidator;
import org.apache.commons.validator.routines.CurrencyValidator;
import org.apache.commons.validator.routines.DateValidator;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/*import com.jd.survey.domain.settings.DataSetItem;
import com.jd.survey.domain.settings.Question;
import com.jd.survey.domain.settings.QuestionOption;*/

@Entity
@Table(name  = "question_answer_validator")
@Data
@Cacheable(true)
public class QuestionAnswerValidator {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;


	private static final Log log = LogFactory.getLog(QuestionAnswerValidator.class);

	public final Integer ONE_BYTE = 1048576;
	
	private String dateFormat;
	private String validContentTypes;
	private String validImageTypes;
	private Integer maximunFileSize;
	private String invalidContentMessage;
	private String invalidFileSizeMessage;
	
    public QuestionAnswerValidator(){}
	
	public QuestionAnswerValidator(String dateFormat,
									String 	validcontentTypes, 
									String 	validImageTypes,
									Integer maximunFileSize,
									String 	invalidContentMessage,
									String 	invalidFileSizeMessage) {
		super();
		this.dateFormat=dateFormat; 
		this.validContentTypes=validcontentTypes.toLowerCase();
		this.validImageTypes=validImageTypes.toLowerCase();
		this.maximunFileSize=maximunFileSize;
		this.invalidContentMessage=invalidContentMessage;
		this.invalidFileSizeMessage=invalidFileSizeMessage;
	}

	

	
	 
	

}
