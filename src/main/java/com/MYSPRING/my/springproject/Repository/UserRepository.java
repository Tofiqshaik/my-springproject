package com.MYSPRING.my.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MYSPRING.my.springproject.User.User;

@Repository

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUserName(String name);
	
	

}
