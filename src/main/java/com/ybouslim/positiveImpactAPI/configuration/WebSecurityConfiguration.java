package com.ybouslim.positiveImpactAPI.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

//	@Autowired
//	private DataSource dataSource;
//	
	
	
	/* *** Authentication *** */
	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		
//		
//	    auth.jdbcAuthentication()
//	      .dataSource(dataSource)
//	      .withDefaultSchema()
//	      .withUser(User.withUsername("user")
//	        .password(passwordEncoder().encode("pass"))
//	        .roles("USER"));
//	}
	
	
	
	/* *** Authorization *** */
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		// Security measure 
		// FIXME : Je ne comprend pas pourquoi il est conseillé de le désactiver
		http.csrf().disable();
		
		// Permit all requests excepts 2
		http.authorizeRequests()
			.antMatchers("/admin/**").authenticated()
			.antMatchers("/donors/**").authenticated()
			.anyRequest().permitAll();
		
		// Basic Authentication (credentials in HTTP request)
		http.httpBasic();
		
		
		
		
//		http
//			.authorizeRequests()
//			.antMatchers("/h2-console/**").permitAll()
//			.anyRequest().authenticated()
//			.and().formLogin();
//		
//			http.csrf()
//			.ignoringAntMatchers("/h2-console/**");
//			
//			http.headers()
//	          .frameOptions()
//	          .sameOrigin();
	}
	
	

	
	/* *** Others *** */
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	
}
