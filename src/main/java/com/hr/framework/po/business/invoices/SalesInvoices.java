package com.hr.framework.po.business.invoices;

import com.enums.AgreementRoleTypeAuth;
import com.enums.CreateInvoiceStatus;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.parties.AgreementParty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name  = "sales_invoices")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class SalesInvoices extends Auditable<SalesInvoices>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "invoice_date" , nullable = false)
    private Date invoiceDate;

    @Column(name  = "description" , nullable = true)
    private String  description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "due_date" , nullable = false)
    private Date  dueDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "paty_first" , nullable = false)
    private AgreementParty firstParty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "second_party" , nullable = false)
    private AgreementParty secondParty;

    @Column(name  = "auth_id" , nullable = false)
    private AgreementRoleTypeAuth auth;

    @Column(name  = "status" , nullable = false)
    private CreateInvoiceStatus status;

}
