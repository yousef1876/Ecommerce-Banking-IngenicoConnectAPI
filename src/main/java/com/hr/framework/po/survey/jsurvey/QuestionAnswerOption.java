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

import com.hr.framework.po.survey.jsurvey.setting.QuestionOption;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;

/*import com.jd.survey.domain.settings.QuestionOption;*/


@Entity
@Table(name  = "questions_answer_options")
@Data
@Cacheable(true)
public class QuestionAnswerOption  {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
      
	    @Column(name  = "orderNo" , nullable = false)
	  	private Short order;
	  	
	    @Column(name  = "values" , nullable = false)
	  	private String value;
	  	
	  	@Column(name  = "text" , nullable = true)
	  	private String text;
 	
}
