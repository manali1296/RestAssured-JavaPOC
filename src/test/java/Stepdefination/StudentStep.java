package Stepdefination;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.StudentPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;
import io.restassured.RestAssured;

public class StudentStep {
	StudentPage studentPage;
	public StudentStep() {
		studentPage=new StudentPage();
	}
	
	@When("^I go to \"([^\"]*)\"$")
	public void i_go_to(String arg1) throws Throwable {
		studentPage.setUPApi();	
	}

	@Then("^I get all student data$")
	public void i_get_all_student_data() throws Throwable {
	    studentPage.getAllStudentData();
	}

	@Then("^I verify status code (\\d+)$")
	public void i_verify_status_code(int arg1) throws Throwable {
	   Assert.assertEquals(studentPage.getStatusCode(), arg1);
	}
	
	@Then("^I post student data$")
	public void i_post_student_data() throws Throwable {
	    studentPage.postData();
	}
	
	@Then("^I delete id-(\\d+) from student data$")
	public void i_delete_id_from_student_data(int id) throws Throwable {
		studentPage.deleteData(id);
	}

	@Then("^I put some student data$")
	public void i_put_some_student_data() throws Throwable {
	    studentPage.putData();
	}
	
	@Then("^I update the data of student$")
	public void i_update_the_data_of_student() throws Throwable {
	  studentPage.updateData();
	}
}
