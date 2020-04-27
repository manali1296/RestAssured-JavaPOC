package models;

import java.util.List;

import lombok.Data;

@Data
public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String programme;
	private List<String> courses;
	
	
}
