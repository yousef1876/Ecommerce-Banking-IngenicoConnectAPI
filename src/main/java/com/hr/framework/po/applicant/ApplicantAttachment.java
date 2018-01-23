package com.hr.framework.po.applicant;


import com.enums.ApplicantDocType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name  = "applicant_attachment")
@EntityListeners(EntityListener.class)
@Data
@Cacheable(true)
public class ApplicantAttachment extends Auditable<ApplicantAttachment>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "applicant_id" , nullable = false)
    private Applicant applicant;

    @Column(name  = "file_name" , nullable = false)
    private String fileName;

    @Column(name  = "file_type" , nullable = true)
    private String fileType;

    @Column(name = "content" , nullable = false)
    @Lob
    private byte[] body;

    @Column(name  = "applicant_doc_type" , nullable = false )
    private ApplicantDocType type;

}
