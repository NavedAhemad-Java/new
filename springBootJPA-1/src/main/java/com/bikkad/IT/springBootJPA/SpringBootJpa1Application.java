package com.bikkad.IT.springBootJPA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bikkad.IT.springBootJPA.Service.ServiceImpl;
import com.bikkad.IT.springBootJPA.model.User;

@SpringBootApplication
public class SpringBootJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpa1Application.class, args);

		ServiceImpl bean = context.getBean(ServiceImpl.class);
//
//		User user = new User();
//		user.setUserId(9);
//		user.setUserName("Amit");
//		user.setUserAge(40);
//		user.setPassword("123");
//
//		User user1 = new User();
//		user1.setUserId(10);
//		user1.setUserName("Naved");
//		user1.setUserAge(45);
//		user1.setPassword("124");
//
//		User user2 = new User();
//		user2.setUserId(11);
//		user2.setUserName("Zeeshan");
//		user2.setUserAge(60);
//		user2.setPassword("125");
//		
//		User user3 = new User();
//		user3.setUserId(12);
//		user3.setUserName("Faizan");
//		user3.setUserAge(32);
//		user3.setPassword("126");
//
//		User user4 = new User();
//		user4.setUserId(13);
//		user4.setUserName("Shyam");
//		user4.setUserAge(60);
//		user4.setPassword("127");
//		
//		
//		User user5 = new User();
//		user5.setUserId(14);
//		user5.setUserName("Jaffar");
//		user5.setUserAge(40);
//		user5.setPassword("128");
//		
//		
//		
//		User user6 = new User();
//		user6.setUserId(15);
//		user6.setUserName("Vilas");
//		user6.setUserAge(62);
//		user6.setPassword("109");
//		
//		List<User> list = new ArrayList<>();
//		list.add(user);
//		list.add(user1);
//		list.add(user2);
//		list.add(user3);
//		list.add(user4);
//		list.add(user5);
//		list.add(user6);
//		
//
//		System.out.println(list);
//
//		bean.savealluser(list);

//		User findBy = bean.findBy(9);
//		System.out.println(findBy);

//		List<Integer> asList = Arrays.asList(1,3,5);
//		List<User> getallId = bean.getallId(asList);
//		System.out.println(getallId);
//		
//		for(User u:getallId) {
//			System.out.println(u);
//		}
//
//		List<User> allUser = bean.getAllUser();
//		System.out.println(allUser);
//		
//		for(User u:allUser) {
//			System.out.println(u);
//		}

//		boolean contactExists = bean.contactExists(8);
//		System.out.println(contactExists);

//		long countRecord = bean.countRecord();
//		System.out.println(countRecord);

		// bean.delete(1);
//		
//		User user = new User();
//		user.setUserId(5);
//		bean.deleteByObject(user);
//		
//		List<Integer> asList = Arrays.asList(3,4);
//		bean.deletAllByIDContact(asList);

//		List<User> allUser = bean.getAllUser();
//		System.out.println(allUser);
//		
//		for(User usr:allUser) {
//			System.out.println(usr);
//		}

//		bean.deleteAllContacts();

		// bean.UserPagination();

//		bean.SortingUser();

//		User name = bean.getContactByUserName("Naved");
//		System.out.println(name);

//		User age = bean.getContactByUserAge(60);
//		System.out.println(age);

//		List<User> thanEqual = bean.findByUserAgGreaterThanEqual(30);
//		
//		System.out.println(thanEqual);

//		List<User> lessThanEqual = bean.findByUserAgeLessThanEqual(60);
//		
//		System.out.println(lessThanEqual);

//		List<User> list = bean.findByUserAgeLessThan(40);
//		
//		System.out.println(list);

//		List<User> greaterThan = bean.findByUserAgeGreaterThan(30);
//		System.out.println(greaterThan);

//		User u = new User ();
//		u.setPassword("Naved");
//		u.setPassword("Naved142");
//		bean.saveUser(u);
		
//		User u1 = new User();
//		u1.setUserId(8);
//		u1.setUserName("Ahemad");
//		u1.setUserAge(18);
//		u1.setPassword("Naved123");
//	
//		bean.saveUser(u1);
//		System.out.println(u1);
//		User loginCheck = bean.LoginCheck("Naved", "Naved142");
//		System.out.println(loginCheck);
//	}
		
//		User loginCheck = bean.LoginCheck("Faizan", "126");
//		System.out.println(loginCheck);
		
//		User loginCheck1 = bean.LoginCheck1("Ahemad","Naved123");
//		System.out.println(loginCheck1);
		
		
//		User query = bean.getUserIdCustomQuery(10);
//		
//		System.out.println(query);
		
		
//		User user = bean.getUserNameCustomQuery("Naved");
//		System.out.println(user);
		
//		User age = bean.getUserAge(32);
//		System.out.println(age);
		
		
		User sql = bean.getUserIdSql(10);
		System.out.println(sql);
	}
}
