package com.bikkad.IT.springBootJPAAllMethods.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkad.IT.springBootJPAAllMethods.Model.Student;
import com.bikkad.IT.springBootJPAAllMethods.repositry.StudentRepository;
@Service
public class StudentServicImpl implements StudentServiceI {

		@Autowired
		private StudentRepository studentRepository;

		@Override
		public int addData(Student stu) {
			studentRepository.save(stu);
			return stu.getRollno();
		}

		@Override
		public Student findByRollno(int rollno) {
			Student byRollno = studentRepository.findByRollno(rollno);
			return byRollno;
		}

		@Override
		public List<Student> ByName(String name) {
			List<Student> findByName = studentRepository.findByName(name);
			return findByName ;
		}

		@Override
		public List<Student> ByAge(int age) {
			List<Student> findByAge = studentRepository.findByAge(age);
			
			return findByAge;
		}

		@Override
		public List<Student> ByAddress(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Student ByEmail(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameLike(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameNotLike(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailLike(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressLike(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeLike(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailNotLike(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressNotLike(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeNotLike(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int countByNameLike(String name) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByEmailLike(String email) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByAddressLike(String address) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByAgeLike(int age) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByNameNotLike(String name) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByEmailNotLike(String email) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByAddressNotLike(String address) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByAgeNotLike(int age) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<Student> ByNameStartingWith(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailStartingWith(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressStartingWith(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameOrAddress(String name, String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameOrEmail(String name, String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameOrAge(String name, int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressOrEmail(String address, String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressOrAge(String address, int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailOrAge(String email, int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameAndAddress(String name, String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameAndEmail(String name, String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameAndAge(String name, int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressAndEmail(String address, String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressAndAge(String address, int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailAndAge(String email, int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeLessThan(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeLessThanEqual(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeGreaterThan(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeGreaterThanEqual(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Student ByRollnoIs(int rollno) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameIs(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailIs(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressIs(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeIs(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Student ByRollnoEquals(int rollno) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameEquals(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailEquals(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressEquals(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeEquals(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> DistinctByAddress(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> DistinctByAge(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> DistinctByAddressAndEmail(String address, String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> DistinctByAddressAndAge(String address, int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeBetween(int age1, int age2) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int countByName(String name) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByAddress(String address) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByAge(int age) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countByEmail(String email) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<Student> ByAgeAfter(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeBefore(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameEndingWith(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressEndingWith(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailEndingWith(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameContaining(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressContaining(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailContaining(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeContaining(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameOrderByAge(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeOrderByName(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailOrderByAddress(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressOrderByEmail(String address) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByNameOrderByAgeDesc(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAgeOrderByNameDesc(int age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByEmailOrderByAddressDesc(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> ByAddressOrderByEmailDesc(String address) {
			// TODO Auto-generated method stub
			return null;
		}
		
}
