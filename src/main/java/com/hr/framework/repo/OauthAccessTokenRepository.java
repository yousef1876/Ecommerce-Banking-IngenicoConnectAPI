package com.hr.framework.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.framework.po.horlder.OauthAccessToken;


public interface OauthAccessTokenRepository extends JpaRepository<OauthAccessToken, String> {

  Optional<OauthAccessToken> findByUserName(String userName);
}
