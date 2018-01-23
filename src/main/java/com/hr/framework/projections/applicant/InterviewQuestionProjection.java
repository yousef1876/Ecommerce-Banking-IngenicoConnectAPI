package com.hr.framework.projections.applicant;

import com.enums.QuestionType;
import com.hr.framework.po.applicant.InterviewQuestion;
import com.hr.framework.po.applicant.Interviews;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "interviewQuestion" , types = {InterviewQuestion.class})
public interface InterviewQuestionProjection {

    String getQuestion();

    QuestionType getType();

    Interviews getInterview();

    Long getId();



}
