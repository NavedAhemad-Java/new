package com.bikkad.IT.springBootJPAAllMethods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkad.IT.springBootJPAAllMethods.Model.Student;
import com.bikkad.IT.springBootJPAAllMethods.Service.StudentServiceI;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceI studentServiceI;
	
	@PostMapping("/addData")
	public int addData(@RequestBody Student stu) {
		int i =studentServiceI.addData(stu);
		return i;
	}
	@GetMapping("/findByRollno/{rollno}")
		public Student findByRollno(@PathVariable int rollno){
		Student byRollnoIs = studentServiceI.ByRollnoIs(rollno);
		return  byRollnoIs;
		
	}
	

}
