package com.hr.framework.po.business.crm.taxs;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import com.hr.framework.po.address.State;
import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name  = "tax_authoritie")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class TaxAuthorities extends Auditable<TaxAuthorities>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "tax_master_id" , nullable = false)
    private TaxMaster taxMaster;

    @Column(name  = "auth_code" , nullable = false)
    private String authCode;

    @Column(name  = "auth_name" , nullable = false)
    private String authName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "country_id" , nullable = false)
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "state_id" , nullable = true)
    private State state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "city_id" , nullable = true)
    private City city;

    @Column(name  = "zip_code" , nullable = true)
    private String zipCode;

    @Column(name  = "street" , nullable = true)
    private String street;

    @Column(name  = "mobile" , nullable = false)
    private String mobile;

    @Column(name  = "phone" , nullable = true)
    private String phone;

    @Column(name  = "email" , nullable = true)
    private String email;

    @Column(name  = "url" , nullable = true)
    private String url;

}
