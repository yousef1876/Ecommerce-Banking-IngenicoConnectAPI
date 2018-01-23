package com.hr.framework.dao.applicant.interfaces;

import com.hr.framework.dao.Specification;
import com.hr.framework.po.applicant.Applicant;

import com.querydsl.core.types.Predicate;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDate;

public class ApplicantSpecifications<T> {

     private static Long id;
     private static String firstName;

     static Specification<Applicant> customerHasBirthday() {
        return new Specification<Applicant>() {
            public javax.persistence.criteria.Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder cb) {
                /*return cb.equal(root.get(Applicant.class.), id);*/ return null;
            }
        };
    }



}
