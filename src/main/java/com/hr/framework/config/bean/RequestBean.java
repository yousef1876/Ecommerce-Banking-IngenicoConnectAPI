package com.hr.framework.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@Data
@ConfigurationProperties(prefix = "request")
public class RequestBean {

  private long range;
  private int count;
public long getRange() {
	return range;
}
public void setRange(long range) {
	this.range = range;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
  
  
  
}
