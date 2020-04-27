package data;

import java.util.Arrays;

import models.Student;

public class StudentApiDataProvider {

	public Student getStudentForPost() {
		Student student =new Student();
		student.setFirstName("Manali");
		student.setLastName("Gaikwad");
		student.setEmail("manali.gaikwad123@gmail.com");
		student.setProgramme("Computer Science");
		student.setCourses(Arrays.asList("Development","Testing"));
		return student;
	}
	
	
	public Student getStudentPutData() {
		Student student =new Student();
		student.setFirstName("Manali");
		student.setLastName("Gaikwad");
		student.setEmail("manaligaikwad121@gmail.com");
		student.setProgramme("Computer Science");
		student.setCourses(Arrays.asList("Development","Testing"));
		return student;
	}
	
	public Student getPatchStudentData() {
		Student student =new Student();
		student.setFirstName("Sunit");
		student.setEmail("sunitdeshpande11@gmail.com");
		return student;
	}
}
