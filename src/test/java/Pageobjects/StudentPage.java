package Pageobjects;

import org.omg.CORBA.Request;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;

import cucumber.api.java.en.Given;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StudentPage {
	
	RequestSpecification httpRequest;
	Response response;	
	int statusCode=0;
	String requestBody=" {\r\n" + 
			"        \"id\": 2,\r\n" + 
			"        \"firstName\": \"Manas\",\r\n" + 
			"        \"lastName\": \"Gaikwad\",\r\n" + 
			"        \"email\": \"managaikwad0908@gmail.com\",\r\n" + 
			"        \"programme\": \"Software Developer\",\r\n" + 
			"        \"courses\": [\r\n" + 
			"            \"Data Science\",\r\n" + 
			"            \"Data Analytics\"\r\n" + 
			"        ]\r\n" + 
			"    }";
	
	String data="{\r\n" + 
			"    \"id\": 6,\r\n" + 
			"    \"firstName\": \"Manali\",\r\n" + 
			"    \"lastName\": \"Gaikwad\",\r\n" + 
			"    \"email\": \"manaligaikwad13411@gmail.com\",\r\n" + 
			"    \"programme\": \"Test Automation Engineer\",\r\n" + 
			"    \"courses\": [\r\n" + 
			"        \"Java\",\r\n" + 
			"        \"Selenium\",\r\n" + 
			"        \"TestNG\",\r\n" + 
			"        \"Python\",\r\n" + 
			"        \"Rest Assured\"\r\n" + 
			"    ]\r\n" + 
			"}";
	
	String updateData="{\r\n" + 
			"\"firstName\": \"Manali\",\r\n" + 
			"\"email\":\"manali11.gsikwadd@gmail.com\"\r\n" + 
			"}";
	@BeforeClass
	public void setUPApi() {
		RestAssured.baseURI="http://localhost:8080/student";
	}

	public void getAllStudentData() {

		statusCode= RestAssured.get("/list").getStatusCode();		
		
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	
	public void postData() {
		statusCode=RestAssured.given().contentType(ContentType.JSON).body(requestBody).post().getStatusCode();
	}
	
	public void deleteData(int id) {
	response=RestAssured.given().delete("/8");
	statusCode=response.getStatusCode();
	}
	
	public void putData() {
		statusCode=RestAssured.given().basePath("/11").contentType(ContentType.JSON).body(data).put().getStatusCode();		
	}
	
	public void updateData() {
		statusCode=RestAssured.given().basePath("/5").contentType(ContentType.JSON).body(updateData).patch().getStatusCode();
	}
}
