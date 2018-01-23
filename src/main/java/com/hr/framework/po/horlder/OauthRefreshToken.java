package com.hr.framework.po.horlder;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 26/10/2016
 * @since JDK1.8
 */
@Entity
@Table(name = "oauth_access_token")
@Data
@Cacheable(true)
public class OauthRefreshToken {

  @Id
  private String tokenId;
}
