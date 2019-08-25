package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.models.DUserDetails;
import com.demo.models.DUserDtlsEntity;
import com.demo.repo.DUserRepository;

@Service
public class DUserService implements UserDetailsService {

	@Autowired
	private DUserRepository repository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		DUserDtlsEntity user = repository.findByUsername(username);
		DUserDetails userDetails = new DUserDetails(user);
		
		return userDetails;
	}
}
