package com.bikkad.IT.springBootJPAAllMethods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bikkad.IT.springBootJPAAllMethods.Model.Student;
import com.bikkad.IT.springBootJPAAllMethods.Service.StudentServicImpl;

@SpringBootApplication
public class SpringBootJpaAllMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaAllMethodsApplication.class, args);
		
		StudentServicImpl bean = context.getBean(StudentServicImpl.class);
		
	
	
		Student s1 = new Student();
		s1.setName("Naved");
		s1.setAddress("Rajura");
		s1.setEmail("naved@12");
		s1.setRollno(1);
		
		
		Student s2= new Student();
		s2.setName("Ahemad");
		s2.setAddress("chandrapur");
		s2.setEmail("naved@123");
		s2.setRollno(2);
		
		Student s3 = new Student();
		s3.setName("zeeshan");
		s3.setAddress("Hydrabad");
		s3.setEmail("zee@12");
		s3.setRollno(3);
		
	
		List<Student> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		System.out.println(l);
		
	int addData = bean.addData(s3);
	System.out.println(addData);
		
		
		
	
	}

}
