package org.test;

import org.testng.annotations.Test;

import excel.BaseAPIExcel;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;


public class FirstAPI {

	@Test
	public void test01() throws IOException, InterruptedException {
		
	
	given()
	
	.when()
	.queryParam("id", "28")
	.get(BaseAPIExcel.excelRead(0, 0))
	
	
	
	
	.then()
	.statusCode(200)
	.log().all();
	
		
		

	}
	
	public void postmethod() throws IOException, InterruptedException {
		given()
		.contentType("application/json")
		.body(BaseAPIExcel.excelRead(0, 1))
		.post(BaseAPIExcel.excelRead(0, 0))
		
		
		
	.then()
	.log().all();
		

	}

}
