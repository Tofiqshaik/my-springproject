package com.MYSPRING.my.springproject.detailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.MYSPRING.my.springproject.Repository.UserRepository;
import com.MYSPRING.my.springproject.User.User;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		User user = repository.findByUserName(name);
		if (user == null) {
			throw new UsernameNotFoundException(" user not found");
		}

		return null;
	}

}
