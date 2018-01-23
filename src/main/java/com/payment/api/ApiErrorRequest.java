package com.payment.api;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@javax.persistence.Table(name =  "api_error_request")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@EntityListeners(EntityListener.class)
@Audited
public class ApiErrorRequest extends com.config.payment.audit.Auditable<ApiErrorRequest> {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "mandate_signature_date" , nullable = false)
    private String mandateSignatureDate;

    @Column(name  = "mandate_signature_place" , nullable = false)
    private String mandateSignaturePlace;

    @Column(name  = "mandate_signed" , nullable = false)
    private boolean mandateSigned;

    @Column(name = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "text" , nullable = false)
    private String text;

    @Column(name  = "request_header" , nullable = true)
    private String requestHeader;




}
