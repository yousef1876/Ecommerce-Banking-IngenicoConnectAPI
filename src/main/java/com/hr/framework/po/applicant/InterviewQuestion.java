package com.hr.framework.po.applicant;


import com.enums.QuestionRating;
import com.enums.QuestionType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "interview_question")
@EntityListeners(EntityListener.class)
@Data
@Cacheable(true)
public class InterviewQuestion  extends Auditable<InterviewQuestion> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @Column(name = "question" , nullable = false)
    private String question;

    @Column(name = "type_id" , nullable = false)
    private QuestionType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interview_id" , nullable = false)
    private Interviews interview;

    @Column(name  = "correct_answer" , nullable = false)
    private String correctAnswer;

    @Column(name  = "applicant_answer" , nullable = false)
    private String applicantAnswer;

    @Column(name  = "created_name" , nullable = false)
    private Date createdDate;

    @Column(name  = "updated_date" , nullable = true)
    private Date updatedDate;



    @Column(name = "rating" , nullable = true)
    private QuestionRating rating;
}
