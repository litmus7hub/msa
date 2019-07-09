package com.l7.msa.profileservice.service;

import java.util.List;
import java.util.Optional;

import com.l7.msa.profileservice.model.User;

/*user service interface to perform different actions related to database using jpa*/

public interface UserService {
	User createUser(User userBean);
	List<User> findAllUser();
	Optional<User> findUserById(int userId);
	List<User> findUserByFirstName(String firstName); 
	Optional<User> findUserByEmail(String email);
	 
}
