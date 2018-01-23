package com.hr.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;


import com.hr.framework.component.BaselineOnMigrateMigrationStrategy;
import com.hr.framework.config.SpringWebMvcConfig;
import com.hr.framework.config.database.DatabaseConfig;
import com.hr.framework.hdiv.core.SecurityConfig;


@SpringBootApplication
@EnableAsync
@Import({
   
    SpringWebMvcConfig.class,DatabaseConfig.class,SecurityConfig.class

    })
@ComponentScan(basePackages = {"com.hr.framework.annotation","com.hr.framework.config.*","com.hr.framework.dao.*","com.hr.framework.po.*","com.hr.framework.controller.*","com.hr.framework.component","com.hr.framework.domain","com.hr.framework.repo","com.hr.framework.service.*","com.hr.framework.controller.open.*","com.hr.framework.config.database","com.hr.framework.hdiv.core"})
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
