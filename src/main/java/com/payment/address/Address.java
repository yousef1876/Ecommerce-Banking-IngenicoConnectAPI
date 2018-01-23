package com.payment.address;


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
@Table(name  = "address")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@EntityListeners(EntityListener.class)
@Data
@Getter
@Setter
@AllArgsConstructor
public class Address extends Auditable<Address>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "additional_info" , nullable = false)
    private String additionalInfo;

    @Column(name  = "city" , nullable = false)
    private String city;

    @Column(name  = "country_code" , nullable = false)
    private String countryCode;

    @Column(name  = "house_number" , nullable = true)
    private String houseNumber;

    @Column(name  = "state" , nullable = true)
    private String state;

    @Column(name  = "state_code" , nullable = true)
    private String stateCode;

    @Column(name = "street" , nullable = true)
    private String street;

    @Column(name  = "zip" , nullable = true)
    private String zip;

}
