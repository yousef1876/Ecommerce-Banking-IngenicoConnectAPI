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

public enum Month {
	
	JANUARY("JAN"),			
	FEBRUARY("FEB"),			
	MARCH("MAR"),				
	APRIL("APR"),				
	MAY("MAY"),					
	JUNE("JUN"),
	JULY("JUL"),
	AUGUST("AUG"),
	SEPTEMBER("SEP"),
	OCTOBER("OCT"),
	NOVEMBER("NOV"),
	DECEMBER("DEC");
	
	private String code;
	
	private Month(String c) {
		code =c; ;
			}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
