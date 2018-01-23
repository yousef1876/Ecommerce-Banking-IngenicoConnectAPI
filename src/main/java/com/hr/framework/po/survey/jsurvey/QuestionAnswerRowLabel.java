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

import com.hr.framework.po.survey.jsurvey.setting.QuestionRowLabel;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;

/*import com.jd.survey.domain.settings.QuestionRowLabel;*/


@Entity
@Table(name  = "questions_answer_row_label")
@Data
@Cacheable(true)
public class QuestionAnswerRowLabel  {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;


	private static final long serialVersionUID = 5918540139500121474L;

	@Column(name  = "orderNo" , nullable = false)
	  	private Short order;
	  	
	  	@Column(name  = "labelText" , nullable = true)
	  	private String label;
	  	
	  	
	  	public QuestionAnswerRowLabel() {
			super();
			// TODO Auto-generated constructor stub
		}
	 	

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		public Short getOrder() {
			return order;
		}
		public void setOrder(Short order) {
			this.order = order;
		}

		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}

		
		
		


		@Override
		public String toString() {
			 return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
			}
}
