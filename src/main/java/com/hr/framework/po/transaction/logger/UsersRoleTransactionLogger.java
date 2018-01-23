package com.hr.framework.po.transaction.logger;


import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "users_role_transaction_logger")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class UsersRoleTransactionLogger extends Auditable<UsersRoleTransactionLogger> {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "role_id" , nullable = false)
    private Roles roles;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "user_id" , nullable = false)
    private Users users;


    @Column(name  = "text" , nullable = false)
    private String text;

    @Column(name = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;


}
