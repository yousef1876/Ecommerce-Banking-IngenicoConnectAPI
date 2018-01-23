package com.hr.framework.po.horlder;

import com.google.common.collect.Sets;
import com.hr.framework.constant.CommonsConstant;
import com.hr.framework.listener.PersistentListener;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * Authorized client, provide for spring security.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 10/23/15
 * @since JDK1.8
 */
@Entity
@EntityListeners(PersistentListener.class)
@Table(name = "clients")
@Data
@Builder
@AllArgsConstructor
@Cacheable(true)
public class Client {

  private static final long serialVersionUID = 6500601540965188191L;

  public Client(){}
  
  @GenericGenerator(
      name = "clientSequenceGenerator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
          @Parameter(name = "sequence_name", value = "clients_seq"),
          @Parameter(name = "initial_value", value = "1"),
          @Parameter(name = "increment_size", value = "1")
      }
  )
  
  
  
  @Id
  @GeneratedValue(generator = "clientSequenceGenerator")
  @Column(updatable = false)
  private long id;

  @NotEmpty
  @Column(length = 50)
  private String clientIdAlias;

  @NotEmpty
  @Column(length = 100)
  private String resourceIdStr;

  @NotEmpty
  @Column(length = 100)
  private String clientSecretAlias;

  /**
   * Available values: read, write
   */
  @NotEmpty
  @Column(length = 100)
  private String scopeStr;

  /**
   * grant types include "authorization_code", "password", "assertion", and "refresh_token". Default
   * description is "authorization_code,refresh_token".
   */
  @NotEmpty
  @Column(length = 100)
  private String authorizedGrantTypeStr;

  /**
   * The redirect URI(s) established during registration (optional, comma separated).
   */
  @Column(length = 1024)
  private String registeredRedirectUriStr;

  /**
   * Authorities that are granted to the client (comma-separated). Distinct from the authorities
   * granted to the user on behalf of whom the client is acting.
   * <pre>
   *     For example: USER
   * </pre>
   */
  @Column(length = 500)
  private String authoritiesStr;

  /**
   * The access token validity period in seconds (optional). If unspecified a global default will be
   * applied by the token services.
   */
  @Builder.Default
  private int accessTokenValiditySecondsAlias = 1800;

  /**
   * The refresh token validity period in seconds (optional). If unspecified a global default will
   * be applied by the token services.
   */
  @Builder.Default
  private int refreshTokenValiditySecondsAlias = 3600;

  /**
   * Additional information for this client, not needed by the vanilla OAuth protocol but might be
   * useful, for example, for storing descriptive information.
   */
  private String additionalInformationStr;

  @Column(nullable = false, updatable = false)
  private long createdAt;

  @Column(nullable = false, updatable = false)
  private long createdBy;

  @Column(nullable = false)
  private long lastModifiedAt;

  @Column(nullable = false)
  private long lastModifiedBy;

  @Version
  @Column(nullable = false)
  private int version;

  @Column(nullable = false, length = 5000)
  private String publicKey;

  

 
  
  
  
}
