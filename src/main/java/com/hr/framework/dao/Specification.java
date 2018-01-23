package com.hr.framework.dao;

import com.querydsl.core.types.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public interface Specification<T> {
    javax.persistence.criteria.Predicate toPredicate(Root<T> root, CriteriaQuery query, CriteriaBuilder cb);
}