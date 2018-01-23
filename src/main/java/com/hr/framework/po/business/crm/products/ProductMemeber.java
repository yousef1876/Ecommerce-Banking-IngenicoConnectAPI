package com.hr.framework.po.business.crm.products;

import com.enums.ProductMemberRoleType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import com.hr.framework.po.business.customers.Customers;
import com.hr.framework.po.person.Person;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "product_memeber")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ProductMemeber extends Auditable<ProductMemeber>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private AssignedUsers useers;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "person_id" , nullable = true)
    private Person persons;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @Column(name  = "member_type" , nullable = false)
    private ProductMemberRoleType member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "customer_id" , nullable = false)
    private Customers customers;





}
