package com.hr.framework.po.business.crm.taxs;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name  = "sales_tax_details")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class SalesTaxDetails extends Auditable<SalesTaxDetails>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "sales_tax" , nullable = false)
    private SalesTax salesTax;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "type_id" , nullable = false)
    private SalesTaxTypes types;

    @Column(name  = "priority" , nullable = false)
    private String priority;

    @Column(name  = "code" , nullable = false)
    private String code;

    @Column(name  = "tax_info_name" , nullable = false)
    private String taxInfo;

    @Column(name  = "shipping_address" , nullable = true)
    private boolean isShippingAddress;

    @Column(name  = "nexus" , nullable = true)
    private boolean isNexus;

    @Column(name  = "applied_shipping_charge" , nullable = true)
    private boolean isAppliedShippingCharge;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_sales_tax" , nullable = true)
    private StateSalesTax stateSalesTax;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "countries_tax" , nullable = false)
    private CountriesSalesTax countriesSalesTax;

    @Column(name  = "rate_type_code" , nullable = false)
    private String rateTypeCode;

    @Column(name  = "rate" , nullable = false)
    private BigDecimal rate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auth_id" , nullable = false)
    private TaxAuthorities taxsAuthorities;








}
