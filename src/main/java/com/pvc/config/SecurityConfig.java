/*package com.pvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private MyAppUserDetailsService myAppUserDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(myAppUserDetailsService);
		
	}
	
    protected void configure(HttpSecurity http) throws Exception {
    	
    	 http
         .csrf().disable()
         .authorizeRequests()
         .antMatchers(HttpMethod.GET, "/rest/**").authenticated()
           .antMatchers(HttpMethod.POST, "/rest/**").authenticated()
           .antMatchers(HttpMethod.PUT, "/rest/**").authenticated()
           .antMatchers(HttpMethod.DELETE, "/rest/**").authenticated()
           .anyRequest().permitAll()
           .and()
         .httpBasic().and()
         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    	
    	 http
         .csrf().disable().authorizeRequests()
        .antMatchers("/**").hasRole("USER")
        .anyRequest()
        .authenticated()
      ;

    }
	
	@Autowired
	private AuthenticationEntryPoint authEntryPoint;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
				.anyRequest().authenticated()
				.and().httpBasic();
				//.authenticationEntryPoint(authEntryPoint);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("john123").password("password").roles("USER");
	}

}
*/