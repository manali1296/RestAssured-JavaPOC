package Stepdefination;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import services.StudentService;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.StudentApiDataProvider;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import models.Student;
import models.SucessResponse;

public class StudentStep {
	private StudentService studentService;
	private StudentApiDataProvider studentApiDataProvider;
	public StudentStep() {
		studentService=new StudentService();
		studentApiDataProvider= new StudentApiDataProvider();
	}

	@When("^I get all student data$")
	public void i_get_all_student_data() throws Throwable {
		studentService.requestStudentList();
	}

	@Then("^I verify status code (\\d+)$")
	public void i_verify_status_code(int statusCode) throws Throwable {
		studentService.assertLastStatusCode(statusCode);
	}
	
	@When("^I post student data$")
	public void i_post_student_data() throws Throwable {
		studentService.requestPostStudent(studentApiDataProvider.getStudentForPost());
	}
	
	@Then("^I delete id-(\\d+) from student data$")
	public void i_delete_id_from_student_data(int id) throws Throwable {
		studentService.requestDeleteStudent(id);
	}

	@Then("^I put some student data$")
	public void i_put_some_student_data() throws Throwable {
		studentService.requsetPutStudent(17,studentApiDataProvider.getStudentPutData());
	}
	
	@Then("^I update the data of student$")
	public void i_update_the_data_of_student() throws Throwable {
		studentService.requsetPatchStudent(13,studentApiDataProvider.getPatchStudentData());
	}
	
	@And("^We get Sucess response with message \"([^\"]*)\"$")
	public void we_get_Sucess_response_with_message(String msg) throws Throwable {
	    Assert.assertEquals(studentService.getLastResponseAsSucessResponse(), new SucessResponse(msg));
	}
}
