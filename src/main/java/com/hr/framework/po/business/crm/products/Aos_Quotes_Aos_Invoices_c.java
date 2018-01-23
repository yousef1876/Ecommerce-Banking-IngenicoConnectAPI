package com.hr.framework.po.business.crm.products;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Aos_Quotes_Aos_Invoices_c  extends Auditable<Aos_Quotes_Aos_Invoices_c>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "aos_quotes77d9_quotes_ida" , nullable = false)
    private String aos_quotes77d9_quotes_ida;

    @Column(name  = "aos_quotes6b83nvoices_idb" , nullable = false)
    private String aos_quotes6b83nvoices_idb;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;


}
