package com.hr.framework.repo;

import java.util.Optional;

import com.hr.framework.po.horlder.Account;


public interface AccountRepository extends CustomRepository<Account, Long> {

  Optional<Account> findByAccount(String account);
}
