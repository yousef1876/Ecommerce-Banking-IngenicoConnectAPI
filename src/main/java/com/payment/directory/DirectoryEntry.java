package com.payment.directory;


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
@Table(name  = "directory_entry")
@Data
@EntityListeners(EntityListener.class)
@AllArgsConstructor
@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DirectoryEntry extends Auditable<DirectoryEntry>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "country_name" , nullable = false)
    private String countryNames;


    @Column(name  = "issuer_id" , nullable = false)
    private String issuerId;


    @Column(name = "issuer_list" , nullable = false)
    private String issuerList;


    @Column(name  = "issuer_name" , nullable = false)
    private String issuerName;



}
