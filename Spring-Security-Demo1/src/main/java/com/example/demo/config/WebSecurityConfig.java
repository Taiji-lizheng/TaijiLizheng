package com.example.demo.config;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

@EnableWebSecurity(debug=false)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER")
		.and().withUser("admin").password("password").roles("ADMIN")
		.and().withUser("dba").password("password").roles("DBA")
		.and().withUser("1").password("1").roles("ADMIN","DBA");
		
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		.authorizeRequests()                                                                
			.antMatchers("/login","/loginP","/resources/**", "/signup", "/about","/my/logout","/logoutSuccess").permitAll()                  
			.antMatchers("/admin/**").hasRole("ADMIN")                                      
			.antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")            
			.anyRequest().authenticated()                                                   
			.and()
		// ...
		.formLogin()
		.loginPage("/loginP")
		.loginProcessingUrl("/login")
		.usernameParameter("username")
		.successHandler(customAuthenticationSuccessHandler())
		//.successForwardUrl("/hello") 
		//.permitAll()
		;   
		
		http.logout()
			.logoutUrl("/my/logout")                                               
			                                      
			.logoutSuccessHandler(customLogoutSuccessHandler())                             
			/*.invalidateHttpSession(true)                                             
			.addLogoutHandler(logoutHandler)     */                                    
			.deleteCookies("DAY2SESSIONID");
	}

	@Bean
	public CustomLogoutSuccessHandler customLogoutSuccessHandler(){
		return new CustomLogoutSuccessHandler();
	}
	@Bean
	public CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler() {
		
		return new CustomAuthenticationSuccessHandler();
	}
	
	/*@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("user").password("password").roles("USER").build());
		manager.createUser(User.withUsername("admin").password("password").roles("ADMIN").build());
		manager.createUser(User.withUsername("dba").password("password").roles("DBA").build());
		manager.createUser(User.withUsername("1").password("password").roles("ADMIN","DBA").build());
		
		return manager;
	}*/
	
}
