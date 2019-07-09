package com.l7.msa.profileservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.l7.msa.profileservice.model.User;
@Repository

/*
 * userRepository is an extended class of JpaRepositroy to make JPA enable in
 * User Bean and In <User,Integer> represents the class name of bean and
 * datatype of primary key
 */
public interface UserRepository extends JpaRepository<User,Integer> {
	/* JPA implementation using Query 
	 * custom query to select the user details based on email...
	 * 
	 * */
	@Query(value = "select * from user  where email=?1", nativeQuery = true)
	Optional<User> findByEmail(String email);
	
	/*
	 * JPA implementation using entity field name ie,column name without @Query for
	 * customization
	 */
	
	 List<User> findByFirstName(String firstName);

}
