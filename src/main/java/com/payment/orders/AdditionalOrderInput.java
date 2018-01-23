package com.payment.orders;


import com.config.payment.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "abstract_order_status")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
public class AdditionalOrderInput extends Auditable<AdditionalOrderInput>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "airline_data" , nullable = false)
    private String airlineData;

    @Column(name  = "level_summary_data" , nullable = false)
    private String level3SummaryData;

    @Column(name  = "number_installments" , nullable = false)
    private String numberOfInstallments;

    @Column(name  = "order_data" , nullable = false)
    private String orderDate;

    @Column(name  = "information" , nullable = false)
    private String typeInformation;



}
