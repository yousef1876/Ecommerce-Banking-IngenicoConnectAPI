package com.payment.api;

import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.CapturePaymentResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "capture_payment_response")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CapturePaymentResponse extends Auditable<CapturePaymentResponse>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    /* Capture Output FK*/


    private CapturePaymentResponseEnum status;


    /* statusOutput FK*/




}
