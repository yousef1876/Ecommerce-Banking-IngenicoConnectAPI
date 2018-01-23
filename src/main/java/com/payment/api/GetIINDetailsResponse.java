package com.payment.api;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name  = "iin_details_respond")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class GetIINDetailsResponse extends Auditable<GetIINDetailsResponse>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "co_brands" , nullable = false)
    private String coBrands;


    @Column(name  = "country_code" , nullable = false)
    private String countryCode;


    @Column(name  = "is_allowed_context" , nullable = false)
    private boolean isAllowedInContext;


    @Column(name  = "payment_product_id" , nullable = false)
    private String paymentProductId;

    

}
