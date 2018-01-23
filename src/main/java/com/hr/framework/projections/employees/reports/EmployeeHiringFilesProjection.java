package com.hr.framework.projections.employees.reports;

import com.enums.HireDocuments;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.HiringFiles;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "hiringFilesProjection" , types = {HiringFiles.class})
public interface EmployeeHiringFilesProjection {

    Long getId();

    String getFileName();

    String getFileType();

    Employee getEmployees();

    HireDocuments getType();

}
