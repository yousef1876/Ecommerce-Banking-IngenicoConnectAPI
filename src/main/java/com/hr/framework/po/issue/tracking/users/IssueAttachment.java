package com.hr.framework.po.issue.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "issue_attachment")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class IssueAttachment extends Auditable<IssueAttachment>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "attachment_title" , nullable = false)
    private String attachmentTitle;

    @Column(name  = "attachment_file_name" , nullable = false)
    private String attachmentFileName;

    @Column(name  = "file_type" , nullable = false)
    private String fileType;

    @Column(name  = "body" , nullable = false)
    @Lob
    private byte[] body;

    /*Issue FK*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "issue_id" , nullable = false)
    private Issue issues;

}
