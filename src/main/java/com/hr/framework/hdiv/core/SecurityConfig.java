package com.hr.framework.hdiv.core;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(mode = AdviceMode.ASPECTJ)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("david").password("david").roles("USER","ADMIN").and()
                .withUser("alex").password("alex").roles("USER").and()
                .withUser("tim").password("tim").roles("USER");
	}
    
    @Override
    @Primary
    protected void configure(HttpSecurity http) throws Exception {
    	http
	        .authorizeRequests()
	            .antMatchers("/authenticated/**").hasRole("USER")
	            .anyRequest().permitAll()
	            .and()
	        .formLogin().loginPage("/login.html").permitAll()
	        	.and()
	        .logout().logoutUrl("/logout.html").logoutSuccessUrl("/");
    }
}
