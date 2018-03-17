/*package com.pvc.config;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyAppUserDetailsService implements UserDetailsService  {
	@Override
	public UserDetails loadUserByUsername(String username) throws
	UsernameNotFoundException {
		
		return new User("admin", "adminpass", getAuthorities()) ;
		
	}
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> auths = new java.util.ArrayList<SimpleGrantedAuthority>();
		auths.add(new SimpleGrantedAuthority("USER"));
		return auths;
	}
}

*/