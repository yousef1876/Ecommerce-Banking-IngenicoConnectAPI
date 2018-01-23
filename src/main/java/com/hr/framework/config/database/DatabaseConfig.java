package com.hr.framework.config.database;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.hr.framework.repo"})
@ComponentScan(basePackages = "com.hr.framework.repo")
@ImportResource(locations = {"classpath*:applicationContext-main.xml"})
public class DatabaseConfig {




}
