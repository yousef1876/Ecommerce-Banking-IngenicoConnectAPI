package com.hr.framework.po.horlder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Oauth access token.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 26/10/2016
 * @since JDK1.8
 */
@Entity
@Table(name = "oauth_access_token")
@Data
public class OauthAccessToken {

  @Id
  private String tokenId;
  private String userName;
  private String clientId;
public String getTokenId() {
	return tokenId;
}
public void setTokenId(String tokenId) {
	this.tokenId = tokenId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getClientId() {
	return clientId;
}
public void setClientId(String clientId) {
	this.clientId = clientId;
}
  
  
  
}
