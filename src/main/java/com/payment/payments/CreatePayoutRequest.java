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
@Table(name  = "create_payout_request")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CreatePayoutRequest extends Auditable<CreatePayoutRequest>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    /*  amountOfMoney FK   */

    /*  bankAccountBban FK */


    /*  bankAccountIban  fk*/


    /* bankAccountIban FK  */


    /*bankTransferPayoutMethodSpecificInput	 FK*/



    /*cardPayoutMethodSpecificInput FK*/



    /*customer      FK*/


    @Column(name  = "payout_date" , nullable = false)
    private String payoutDate;

    @Column(name  = "payout_text" , nullable = false)
    private String payoutText;



    /* references fk */


    @Column(name  = "swift_code" , nullable = false)
    private String swiftCode;



}
