package com.hr.framework.po.business.crm.assets;

import com.enums.FixedAssetTypes;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.orders.OrderRequirements;
import com.hr.framework.po.business.crm.products.Products;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import com.hr.framework.po.business.parties.AgreementParty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "assets")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Assets extends Auditable<Assets>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name  = "assets_serial_number" , nullable = false)
    private String assetsSerialNumber;

    @Column(name  = "type" , nullable = false)
    private FixedAssetTypes type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "asset_parent_id" , nullable =true)
    private Assets parent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "product_id" , nullable = true)
    private Products products;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "second_party_user" , nullable = false)
    private AgreementParty parts;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers users;


    @Column(name  = "assets_name" , nullable = false)
    private String assetName;
    
    
    @Column(name  = "description" , nullable = true)
    private String description;
    
    
    @Column(name  = "note" , nullable = true)
    private String note;
    
    @Column(name  = "comments" , nullable = true)
    private String comments;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "assets")
    private List<OrderRequirements> orderRequirements = new ArrayList<>();


}
