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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.hr.framework.util.SortedSetUpdater;

import lombok.Data;

import org.hibernate.validator.constraints.NotEmpty;

/*import com.jd.survey.util.SortedSetUpdater;*/

@Entity
@Data
@Table(name  = "questions_options")
public class QuestionOption {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

	@Version
    @Column(name = "version")
    private Integer version;
	
	@NotNull
	@NotEmpty
    @Size(max = 50)
    @Column(name = "OPTION_VALUE",length = 50, nullable= false)
    private String value;

	
    @NotNull
    @NotEmpty
    @Size(max = 250)
    @Column(name = "OPTION_TEXT",length = 250, nullable= false)
    private String text;

    @NotNull
    @Column(name = "OPTION_ORDER")
    private Short order;

   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QUESTION_ID" , nullable = false)
    private Question questions;
    
	
}
