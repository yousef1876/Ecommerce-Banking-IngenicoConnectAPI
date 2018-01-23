package com.hr.framework.repo;

import java.util.Optional;

import com.hr.framework.po.horlder.Client;


public interface ClientRepository extends CustomRepository<Client, Long> {

  Optional<Client> findByClientIdAlias(String clientIdAlias);
}
