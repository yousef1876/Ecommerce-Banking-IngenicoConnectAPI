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
@Table(name  = "account_file_display_hints")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@EntityListeners(EntityListener.class)
@Data
@Getter
@Setter
@AllArgsConstructor
public class AccountOnFileDisplayHints extends Auditable<AccountOnFileDisplayHints>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "logo" , nullable = false)
    private String logo;


}
