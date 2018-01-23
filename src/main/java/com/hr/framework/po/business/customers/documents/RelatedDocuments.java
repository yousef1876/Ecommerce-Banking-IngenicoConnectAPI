package com.hr.framework.po.business.customers.documents;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.customers.Customers;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "related_customer_documents")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class RelatedDocuments extends Auditable<RelatedDocuments>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name = "file_name" , nullable = false)
    private String fileName;

    @Column(name  = "content" , nullable = false)
    private byte[] content;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "customer_id" , nullable = false)
    private Customers customers;





}
