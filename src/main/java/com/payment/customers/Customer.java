package com.payment.customers;


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
@Table(name  = "customer")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Customer extends Auditable<Customer>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /* Address FK  */


    /*companyInformation FK*/


    /*contactDetails     FK*/


    @Column(name  = "fiscal_number" , nullable = false)
    private String fiscalNumber;


    @Column(name  = "locale" , nullable = false)
    private String locale;


    @Column(name  = "merchant_customer_id" , nullable = false)
    private String merchantCustomerId;



    /* personalInformation  FK*/



    /* shippingAddress FK*/


    @Column(name = "vat_number" , nullable = false)
    private String vatNumber;
}
