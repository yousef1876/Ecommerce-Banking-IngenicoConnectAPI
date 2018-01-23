package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "store_contact")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class StoreContact extends Auditable<StoreContact>{



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contact_id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "work_phone" , nullable = false)
    private String workPhone;

    @Column(name  = "work_mobile" , nullable = false)
    private String workMobile;

    @Column(name  = "work_email" , nullable = false)
    private String workEmail;

    @Column(name  = "morning_shift_contact" , nullable = false)
    private String morningShiftContact;

    @Column(name  = "evening_shift_contact" , nullable = true)
    private String eveningShiftContact;

    @Column(name  = "service_contact_email" , nullable = true)
    private String serviceContactEmail;

    @Column(name  = "service_contact_phone" , nullable = false)
    private String serviceContactPhone;

    @Column(name  = "service_contact_mobile" , nullable = false)
    private String serviceContactMobile;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "store_id" , nullable = false)
    private Store stores;

}
