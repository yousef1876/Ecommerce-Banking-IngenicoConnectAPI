package com.payment.payments;


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
@Table(name  = "decrypted_payment_data")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage =   CacheConcurrencyStrategy.READ_WRITE)
public class DecryptedPaymentData extends Auditable<DecryptedPaymentData>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "card_holder_name" , nullable = false)
    private String cardholderName;


    @Column(name  = "cryptogram" , nullable = false)
    private String cryptogram;


    @Column(name  = "dpan" , nullable = false)
    private String dpan;


    @Column(name  = "eci" , nullable = false)
    private String eci;


    @Column(name  = "expiry_date" , nullable = false)
    private String expiryDate;


}
