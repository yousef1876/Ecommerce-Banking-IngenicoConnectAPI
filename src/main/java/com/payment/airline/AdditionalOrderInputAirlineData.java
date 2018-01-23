package com.payment.airline;

import com.config.payment.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name  = "additional_order_input_airline_data")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
public class AdditionalOrderInputAirlineData extends Auditable<AdditionalOrderInputAirlineData>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "airline_data")
    private String airlineData;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;



}
