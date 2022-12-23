package com.bikkad.IT.springBootJPA.Service;



import java.util.List;

import com.bikkad.IT.springBootJPA.model.User;


public interface ServiceI {
	
	public void saveUser(User user);
	
	public void savealluser(List<User> user);

	public User findBy(Integer UserId);
	
	public List<User> getallId(List<Integer>list);
	
	public List<User> getAllUser();
	
	public boolean contactExists(Integer Id);
	
	public long countRecord();
	
	public void delete(int Id);
	
	public void deleteByObject(User user);
	
	public void deletAllByIDContact(List<Integer>list);
	
	public void deleteAllContacts();
	
	public void UserPagination();
	
	public void SortingUser();
	
	public User getContactByUserAge(int userAge);
	
	public User getContactByUserName(String userName);
	
	public List<User> findByUserAgeGreaterThanEqual(int age);
	
	public List<User> findByUserAgeLessThanEqual(int Lage);
	
	public List<User> findByUserAgeLessThan(int age);
	
	public List<User> findByUserAgeGreaterThan(int age);
	
	public User LoginCheck(String username,String password);
	
	public User LoginCheck1(String username,String password);
	
	
	public User getUserIdCustomQuery(int userId);
	
	public User getUserNameCustomQuery(String userName);
	
	public User getUserAge(int userAge);
	
	public User getUserIdSql(int userId);
	
	
	

}
