package com.payment.bank;


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
@Table(name  = "bank_details_response")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Getter
@Setter
public class BankDetailsResponse extends Auditable<BankDetailsResponse>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    /* bankAccountBban FK */


    /* bankAccountIban FK */


    /* bankData FK*/


    /* Swift FK*/



}
