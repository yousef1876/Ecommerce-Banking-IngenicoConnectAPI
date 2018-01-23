package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Customer extends Auditable<Customer>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "first_name" , nullable = false)
	private String firstName;

	@Column(name  = "second_name" , nullable = true)
	private String secondName;

	@Column(name  = "last_name" , nullable = false)
	private String lastName;
	
	@Column(name  = "mobile_number" , nullable = false)
    private String mobileNumber;
    
    @Column(name  = "phone_number" , nullable = false)
    private String phoneNumber;
    
    @Column(name  = "email" , nullable = false)
    private String email;
    
    
    /* Address FK*/

    @ManyToOne
	@JoinColumn(name  = "city_id" , nullable = true)
    private City cities;

    /* Address FK  */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "country_id" , nullable = false)
    private Country country;


    @Column(name  = "id_card" , nullable = false)
    private String idCard;
    
    @Column(name = "passport" , nullable = false)
    private String passport;
	

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<BlogComment> blogComments = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<BlogCommentRelatedImages> blogCommentRelatedImages = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<ForumPost> forumPostList = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<ReturnBackProduct> backProducts = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "customers")
    private List<TierPrice> tierPriceList = new ArrayList<>();

}
