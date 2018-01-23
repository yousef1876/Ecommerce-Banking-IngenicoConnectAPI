package com.payment.companyinfo;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "contact_details")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ContactDetails extends Auditable<ContactDetails>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "email_address" , nullable = false)
    private String emailAddress;

    @Column(name  = "email_message_type" , nullable = false)
    private String emailMessageType;

    @Column(name  = "fax_number" , nullable = false)
    private String faxNumber;

    @Column(name  = "phone_number" , nullable = false)
    private String phoneNumber;
}
