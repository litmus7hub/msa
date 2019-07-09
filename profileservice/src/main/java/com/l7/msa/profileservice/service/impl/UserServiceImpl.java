package com.l7.msa.profileservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.l7.msa.profileservice.model.User;
import com.l7.msa.profileservice.repository.UserRepository;
import com.l7.msa.profileservice.service.UserService;


/*implementation class of userservice interface*/

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userRepository;
	@Override
	public User createUser(User userBean) {
		return userRepository.save(userBean);//JPA OOTB method to save the details to DB....
		
	}
	@Override
	public List<User> findAllUser() {
		
		return userRepository.findAll();//JPA OOTB method to fetch all user details from DB....
	}
	@Override
	public Optional<User> findUserById(int userId) {
		Optional<User> userBean=userRepository.findById(userId);//JPA OOTB method to fetch the detail of user based on userID from DB....
		if(userBean.isPresent()) {
			return userBean;
		}
		return null;
	}
	@Override
	public List<User> findUserByFirstName(String firstName) {
		 return userRepository.findByFirstName(firstName);//Customized JPA method to find user details based on the FirstName for more details go through UserRepository
		
	}
	@Override
	public Optional<User> findUserByEmail(String email) {
		Optional<User> userBean=userRepository.findByEmail(email);//Customized JPA method to find user details based on the FirstName for more details go through UserRepository
		if(userBean.isPresent()) {
			return userBean;
		}
		return null;
	}
	


}
