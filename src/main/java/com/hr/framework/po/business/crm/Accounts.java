package com.hr.framework.po.business.crm;

import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;
import org.springframework.data.domain.Auditable;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@EntityListeners(EntityListener.class)
public class Accounts extends com.hr.framework.config.audit.Auditable<Accounts> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column( name  = "full_name" , nullable = false)
    private String fullName;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "industry" , nullable = false)
    private String industry;

    @Column(name  = "annual_revenue" , nullable = false)
    private String annualRevenue;

    @Column(name = "phone_fax" , nullable = true)
    private String phoneFax;

    @Column(name  = "phone_office" , nullable = true)
    private String phoneOffice;

    @Column(name  = "phone_alternate" , nullable = true)
    private String phoneAlternate;

    @Column(name  = "password" , nullable = false)
    private String password;

    @Column(name  = "login" , nullable = false)
    private String login;

   
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "accounts")
    private List<AccountsCases> caeses =  new ArrayList<>();


	
    

}
