package com.bikkad.IT.springBootJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bikkad.IT.springBootJPA.model.User;
//CrudRepository//j<User, Integer>//



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

		public User findByUserAge(int userAge);
	 
		public User findByUserName(String userName);
		
		public List<User> findByUserAgeGreaterThanEqual(int userAge);

		public List<User> findByUserAgeLessThanEqual(int userAge);
		
		public List<User> findByUserAgeLessThan(int age);

		public List<User> findByUserAgeGreaterThan(int age);
		
		public User findByUserNameAndPassword(String username,String password);

		public User findByUserNameOrPassword(String username,String password);

		
		
//		@Query("from User where userId=:userId")
//		public User getUserId(int userId);
		
		@Query("from User where userName=:userName")
		public User getUserName(String userName);
		
		@Query("from User where userAge=:userAge")
		public User getUserAge(int userAge);
		
		
		@Query(value="select *from User_details where User_ID=:userId")
		public User getUserId(int userId);
		
		
}
