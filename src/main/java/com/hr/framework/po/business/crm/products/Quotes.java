package com.hr.framework.po.business.crm.products;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import com.hr.framework.po.business.crm.contact.Contact;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "quotes")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Quotes extends Auditable<Quotes>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers assignedUsers;

    @Column(name  = "approval_status" , nullable = false)
    private String approvalIssue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billing_account_id" , nullable = false)
    private AssignedUsers billingAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "contact_id" , nullable = false)
    private Contact contacts;

    @Column(name  = "billing_address_street" , nullable = false)
    private String billing_address_street;

    @Column(name  = "billing_address_city" , nullable = false)
    private String billing_address_city;

    @Column(name  = "billing_address_state" , nullable = false)
    private String billing_address_state;

    @Column(name  = "billing_address_postalcode" , nullable = false)
    private String billing_address_postalcode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "country_id" , nullable = false)
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "city_id" , nullable = false)
    private City city;

    @Column(name  = "shipping_address_street" , nullable = false)
    private String shipping_address_street;

    @Column(name  = "shipping_address_city" , nullable = false)
    private String shipping_address_city;


    @Column(name  = "shipping_address_state" , nullable = false)
    private String shipping_address_state;

    @Column( name= "shipping_address_postalcode" , nullable = false)
    private String shipping_address_postalcode;

    @Column(name  = "shipping_address_country" , nullable = false)
    private String shipping_address_country;

    @Column(name  = "expiration" , nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiration;

    @Column(name  = "number" , nullable = false)
    private String number;

    @Column(name  = "total_amt" , nullable = false)
    private String total_amt;

    @Column(name  = "total_amt_usdollar" , nullable = false)
    private String total_amt_usdollar;

    @Column(name  = "subtotal_amount" , nullable = false)
    private String subtotal_amount;

    @Column(name  = "subtotal_amount_usdollar" , nullable = false)
    private String subtotal_amount_usdollar;

    @Column(name  = "discount_amount" , nullable = false)
    private String discount_amount;

    @Column(name  = "discount_amount_usdollar" , nullable = false)
    private String discount_amount_usdollar;

    @Column(name  = "tax_amount" , nullable = false)
    private String tax_amount;

    @Column(name  = "tax_amount_usdollar" , nullable = false)
    private String tax_amount_usdollar;


    /*private String shipping_amount;


    private String shipping_amount_usdollar;


    private String shipping_tax;


    private String shipping_tax_amt;


    private String shipping_tax_amt_usdollar;*/

    @Column(name  = "total_amount" , nullable = false)
    private String total_amount;

    @Column(name  = "total_amount_usdollar" , nullable = false)
    private String total_amount_usdollar;




}
