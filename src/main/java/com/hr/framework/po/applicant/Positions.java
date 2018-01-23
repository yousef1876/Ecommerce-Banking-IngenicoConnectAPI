package com.hr.framework.po.applicant;

import com.enums.PositionType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name  = "positions")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Positions extends Auditable<Positions>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "position_name" , nullable = false)
    private String positionName;

    @Column(name  = "title" , nullable = false)
    private String title;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "city_id" , nullable = false)
    private City city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "country_id" , nullable = false)
    private Country country;

    @Column(name = "position_type" , nullable = false)
    private PositionType typs;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "position")
    private List<Interviews> interviews;


}
