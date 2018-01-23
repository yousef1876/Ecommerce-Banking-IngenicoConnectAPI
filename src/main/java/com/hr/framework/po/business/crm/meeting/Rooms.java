package com.hr.framework.po.business.crm.meeting;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "rooms")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Rooms extends Auditable<Rooms> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "room_name" , nullable = false)
    private String roomName;

    @Column(name  = "room_number" , nullable = false)
    private String roomNumber;

    @Column(name  = "deleted" , nullable = false)
    private boolean isDeleted;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;

    @OneToMany(fetch =  FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "rooms")
    private List<MeetingInvolved> meetingInvolveds = new ArrayList<>();

}
