package com.payment.sessions;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "approve_token_request")
@Data
@EntityListeners(EntityListener.class)
@Getter
@Setter
public class ApproveTokenRequest extends Auditable<ApproveTokenRequest>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "mandate_signature_date" , nullable = false)
    private String mandateSignatureDate;

    @Column(name = "mandate_signature_place" , nullable = false)
    private String mandateSignaturePlace;

    @Column(name  = "mandate_signed" , nullable = false)
    private String mandateSigned;

}
