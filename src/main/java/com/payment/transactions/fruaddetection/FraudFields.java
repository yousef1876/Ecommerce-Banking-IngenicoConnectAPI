package com.payment.transactions.fruaddetection;


import com.config.payment.audit.Auditable;
import com.config.payment.audit.EntityListener;
import com.enums.GiftCardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name  = "fraud_fields")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FraudFields extends Auditable<FraudFields>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "address_are_identical" , nullable = false)
    private String addressesAreIdentical;


    @Column(name  = "black_list_data" , nullable = false)
    private String blackListData;



    /* Address FK */

    @Column(name = "customer_ip_address" , nullable = false)
    private String customerIpAddress;


    @Column(name  = "default_form_fill" , nullable = false)
    private String defaultFormFill;


    @Column(name  = "finger_print_activated" , nullable = false)
    private boolean fingerPrintActivated;


    @Column(name  = "gift_card_type" , nullable = true)
    private GiftCardType giftCardType;


    @Column(name  = "gift_message" , nullable = false)
    private String giftMessage;


    @Column(name  = "has_forgetten_pwd" , nullable = false)
    private boolean hasForgottenPwd;


    @Column(name  = "has_password" , nullable = false)
    private boolean hasPassword;


    @Column(name  = "is_prev_customer" , nullable = false)
    private boolean isPreviousCustomer;


    @Column(name  = "order_time_zone" , nullable = false)
    private String orderTimezone;


    @Column(name  = "ship_comments" , nullable = true)
    private String shipComments;


    @Column(name  = "shipment_tracking_number" , nullable = false)
    private String shipmentTrackingNumber;



    /* shippingDetails  FK  */


    @Column(name  = "user_data" , nullable = false)
    private String userData;


    @Column(name  = "website" , nullable = false)
    private String website;


}
