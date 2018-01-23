package com.payment.api;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "api_error_response")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
public class ApiErrorResponse extends com.config.payment.audit.Auditable<ApiErrorResponse>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "catogery" , nullable = false)
    private String category;

    @Column(name  = "code" , nullable = false)
    private String code;

    @Column(name =  "http_status_code" , nullable = false)
    private String httpStatusCode;

    @Column(name  = "message" , nullable = false)
    private String message;

    @Column(name = "property_name" , nullable = false)
    private String propertyName;

    @Column(name  = "request_id" , nullable = false)
    private String requestId;

    @Column(name = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;



}
