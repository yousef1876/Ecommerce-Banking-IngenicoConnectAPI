package com.hr.framework.po.leave;

import java.util.Date;

import javax.persistence.*;

import com.enums.LeaveType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

@Entity
@Table(name = "employee_leave")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Leave extends Auditable<Leave>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "leave_name" , nullable = false)
	private String leaveName;
	
	@Column(name  = "reason" , nullable = false)
	private String reason;
	
	@Column(name  = "note" , nullable = true)
	private String note;
	
	@Column(name  = "description" , nullable = true )
	private String description;
	
	@Column(name  = "from_date" , nullable = false)
	private Date fromDate;

	@Column(name = "to_date" , nullable = false)
	private Date toDate;
	
	@Column(name = "type" , nullable = false)
	private LeaveType type;
	
	/*Person FK*/
	
	
	
}
