package services;

import java.net.URI;
import java.net.URISyntaxException;
import io.restassured.response.Response;
import models.Student;
import models.SucessResponse;

import static io.restassured.RestAssured.given;

public class StudentService {
private Response response;		
	
	public void requestStudentList() throws URISyntaxException {
		URI studentListUri=new URI("/list");
		response=given().get(studentListUri);
	}
	
	public void requestPostStudent(Student student) {
		response=given().body(student).post();
	}
	
	public void requestDeleteStudent(int id) throws URISyntaxException {
		URI studentDeleteUri=new URI("/"+id);
		response=given().delete(studentDeleteUri);
	}
	
	public void requsetPutStudent(int id,Student student) throws URISyntaxException {
		URI studentPutUri=new URI("/"+id);
		response=given().body(student).put(studentPutUri);
	}
	
	public void requsetPatchStudent(int id,Student student) throws URISyntaxException {
		URI studentPatchUri=new URI("/"+id);
		response=given().body(student).patch(studentPatchUri);
	}
	
	public void assertLastStatusCode(int statusCode) {
		response.then().statusCode(statusCode);
	}
	
	public SucessResponse getLastResponseAsSucessResponse() {
		return response.as(SucessResponse.class);
	}
}
