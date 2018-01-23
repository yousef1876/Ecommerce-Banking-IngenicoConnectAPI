package com.hr.framework.po.business.agreements.documents;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.agreements.Agreements;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "agreement_related_documents")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class AgreementRelatedDocuments extends Auditable<AgreementRelatedDocuments> {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "file_name" , nullable = false)
    private String fileName;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "content" , nullable = false)
    @Lob
    private byte[] content;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "agreement_id" , nullable = false)
    private Agreements agreements;



}
