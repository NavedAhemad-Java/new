package com.bikkad.IT.springBootJPAAllMethods.Service;

import java.util.List;

import com.bikkad.IT.springBootJPAAllMethods.Model.Student;

public interface StudentServiceI {

	public int addData(Student stu);

	public Student findByRollno(int rollno);

	public List<Student> ByName(String name);

	public List<Student> ByAge(int age);

	public List<Student> ByAddress(String address);

	public Student ByEmail(String email);

	public List<Student> ByNameLike(String name);

	public List<Student> ByNameNotLike(String name);

	public List<Student> ByEmailLike(String email);

	public List<Student> ByAddressLike(String address);

	public List<Student> ByAgeLike(int age);

	public List<Student> ByEmailNotLike(String email);

	public List<Student> ByAddressNotLike(String address);

	public List<Student> ByAgeNotLike(int age);

	public int countByNameLike(String name);

	public int countByEmailLike(String email);

	public int countByAddressLike(String address);

	public int countByAgeLike(int age);

	public int countByNameNotLike(String name);

	public int countByEmailNotLike(String email);

	public int countByAddressNotLike(String address);

	public int countByAgeNotLike(int age);

	public List<Student> ByNameStartingWith(String name);

	public List<Student> ByEmailStartingWith(String email);

	public List<Student> ByAddressStartingWith(String address);

	public List<Student> ByNameOrAddress(String name, String address);

	public List<Student> ByNameOrEmail(String name, String email);

	public List<Student> ByNameOrAge(String name, int age);

	public List<Student> ByAddressOrEmail(String address, String email);

	public List<Student> ByAddressOrAge(String address, int age);

	public List<Student> ByEmailOrAge(String email, int age);

	public List<Student> ByNameAndAddress(String name, String address);

	public List<Student> ByNameAndEmail(String name, String email);

	public List<Student> ByNameAndAge(String name, int age);

	public List<Student> ByAddressAndEmail(String address, String email);

	public List<Student> ByAddressAndAge(String address, int age);

	public List<Student> ByEmailAndAge(String email, int age);

	public List<Student> ByAgeLessThan(int age);

	public List<Student> ByAgeLessThanEqual(int age);

	public List<Student> ByAgeGreaterThan(int age);

	public List<Student> ByAgeGreaterThanEqual(int age);

	public Student ByRollnoIs(int rollno);

	public List<Student> ByNameIs(String name);

	public List<Student> ByEmailIs(String email);

	public List<Student> ByAddressIs(String address);

	public List<Student> ByAgeIs(int age);

	public Student ByRollnoEquals(int rollno);

	public List<Student> ByNameEquals(String name);

	public List<Student> ByEmailEquals(String email);

	public List<Student> ByAddressEquals(String address);

	public List<Student> ByAgeEquals(int age);

	public List<Student> DistinctByAddress(String address);

	public List<Student> DistinctByAge(int age);

	public List<Student> DistinctByAddressAndEmail(String address, String email);

	public List<Student> DistinctByAddressAndAge(String address, int age);

	public List<Student> ByAgeBetween(int age1, int age2);

	public int countByName(String name);

	public int countByAddress(String address);

	public int countByAge(int age);

	public int countByEmail(String email);

	public List<Student> ByAgeAfter(int age);

	public List<Student> ByAgeBefore(int age);

	public List<Student> ByNameEndingWith(String name);

	public List<Student> ByAddressEndingWith(String address);

	public List<Student> ByEmailEndingWith(String email);

	public List<Student> ByNameContaining(String name);

	public List<Student> ByAddressContaining(String address);

	public List<Student> ByEmailContaining(String email);

	public List<Student> ByAgeContaining(int age);

	public List<Student> ByNameOrderByAge(String name);

	public List<Student> ByAgeOrderByName(int age);

	public List<Student> ByEmailOrderByAddress(String email);

	public List<Student> ByAddressOrderByEmail(String address);

	public List<Student> ByNameOrderByAgeDesc(String name);

	public List<Student> ByAgeOrderByNameDesc(int age);

	public List<Student> ByEmailOrderByAddressDesc(String email);

	public List<Student> ByAddressOrderByEmailDesc(String address);

}
