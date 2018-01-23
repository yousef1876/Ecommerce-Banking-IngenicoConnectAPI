package com.hr.framework.po.bug.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "file_attachment")
@EntityListeners(EntityListener.class)
@Data
@Cacheable(true)
public class Attachment extends Auditable<Attachment>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bug_id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "file_name" , nullable = false)
    private String fileName;

    @Column(name  = "body" , nullable = false)
    @Lob
    private  byte[] files;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "project_id" , nullable = false)
    private Project projects;





}
