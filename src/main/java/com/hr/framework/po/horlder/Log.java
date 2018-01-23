package com.hr.framework.po.horlder;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.http.HttpMethod;



/**
 * Log, record users' behavior.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 10/27/15
 * @since JDK1.8
 */
@Entity
@Table(name = "logs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Cacheable(true)
public class Log implements Serializable {

  private static final long serialVersionUID = 7088091769901805623L;
  /*public Log(){
	  
  }*/
  @GenericGenerator(
      name = "logSequenceGenerator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
          @Parameter(name = "sequence_name", value = "logs_seq"),
          @Parameter(name = "initial_value", value = "1"),
          @Parameter(name = "increment_size", value = "1")
      }
  )
  @Id
  @GeneratedValue(generator = "logSequenceGenerator")
  @Column(updatable = false)
  private long id;

  @NotEmpty
  @Column(nullable = false, length = 50)
  private String ip;

  @Column(nullable = false)
  private String usr;
  private String clientId;
  private String path;
  private HttpMethod method;

  @CreatedDate
  @Column(nullable = false)
  private long createdAt;
  
  public static class EntityBuilder{
      

      
      private static String usr;
      private static String clientId;
      private static String path;
      private static HttpMethod method;
      
     
      
      public EntityBuilder(String usr , String clientId , String path , HttpMethod method) {
      	this.usr = usr;
      	this.clientId = clientId;
      	this.path = path;
      	this.method = method;
      }

      public EntityBuilder( ) {
      
      }
      
      public  Log.EntityBuilder  usr(String error) {
          
          return new EntityBuilder();
      }

      public  Log.EntityBuilder ip(String description) {
        
      	return new EntityBuilder();
      }
      
      public  Log.EntityBuilder clientId(String description) {
          
        	return new EntityBuilder();
      }
      
      public  Log.EntityBuilder path(String description) {
          
      	return new EntityBuilder();
      }
      
      public  Log.EntityBuilder method(HttpMethod method) {
          
        	return new EntityBuilder();
      }
     
      
      public Log build() {
          return new Log();
      }

      public static Log.EntityBuilder builder(){
      	return new EntityBuilder(usr, clientId , path , method);
      }
      
      public String toString() {
          return "de.rpr.EntityBuilder(usr=[" + usr + "],clientId=[" + clientId+"],path=["+clientId+"],method=["+method+")";
      }
  }
}
