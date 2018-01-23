package com.config.payment.audit;

import com.enums.Action;

import javax.persistence.EntityManager;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.transaction.Transactional;

import static javax.transaction.Transactional.TxType.MANDATORY;


public class EntityListener<T> {

    @PrePersist
    public void prePersist(T target) {
        perform(target, Action.INSERTED);
    }

    @PreUpdate
    public void preUpdate(T target) {
        perform(target, Action.UPDATED);
    }

    @PreRemove
    public void preRemove(T target) {
        perform(target, Action.DELETED);
    }

    @Transactional(MANDATORY)
    public void perform(T target, Action action) {
        EntityManager entityManager = BeanUtil.getBean(EntityManager.class);

        entityManager.persist(target);
    }

}
