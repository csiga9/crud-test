package com.crudtest.crud;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(2)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.cors().and().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
      .antMatchers("**", "/static/**", "/human/**", "/login", "/actuator/**").permitAll()
      .anyRequest().authenticated().and().exceptionHandling().accessDeniedPage("/401")
      .and().logout().deleteCookies("JSESSIONID").and().rememberMe().key("gonihongo").tokenValiditySeconds(86400)
      .and().csrf().disable().logout().disable();
  }

  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}

