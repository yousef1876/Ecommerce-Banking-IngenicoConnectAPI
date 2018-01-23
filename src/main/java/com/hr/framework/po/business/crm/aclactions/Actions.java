package com.hr.framework.po.business.crm.aclactions;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "actions")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Actions extends Auditable<Actions>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "url" , nullable = false)
    private String url;

    @Column(name  = "methods" , nullable = false)
    private String methods;

    @Column(name  = "clazz" , nullable = false)
    private String clazz;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "acl_roles_actions",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "action_id")
    )
    private List<AclRoles> acls = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "actions")
    private List<AclActions> actions;

}
