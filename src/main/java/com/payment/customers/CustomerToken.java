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
@Table(name  = "customer_token")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CustomerToken extends Auditable<CustomerToken>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /*Address FK*/


    /*companyInformation	 FK*/

    @Column(name  = "merchant_customer_id" , nullable = false)
    private String merchantCustomerId;



    /*personalInformation FK*/


    @Column(name  = "vat_number" , nullable = false)
    private String vatNumber;





}
