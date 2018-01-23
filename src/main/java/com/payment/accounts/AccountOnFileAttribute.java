package com.payment.accounts;


import com.config.payment.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "account_file_attribute")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@EntityListeners(EntityListener.class)
@Data
@Getter
@Setter
@AllArgsConstructor
public class AccountOnFileAttribute extends Auditable<AccountOnFileAttribute>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "status" , nullable = false)
    private String status;

    @Column(name  = "key" , nullable = false)
    private String key;

    @Column(name  = "value" , nullable = false)
    private String value;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;


}
