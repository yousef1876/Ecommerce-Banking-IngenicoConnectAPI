package com.hr.framework.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.framework.po.horlder.OauthRefreshToken;


public interface OauthRefreshTokenRepository extends JpaRepository<OauthRefreshToken, String> {

  Optional<OauthRefreshToken> findByTokenId(String tokenId);
}
