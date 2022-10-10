package com.restAssuredEx;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APITesting {

	@Test
	public void getMethod() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		Response resp= RestAssured.when().get("posts/1");
		
		
		System.out.println("response body :"+resp.getBody().asString());
		
		System.out.println("Status code :"+resp.statusCode());
		
		Assert.assertEquals(resp.statusCode(), 200);
		
		System.out.println("Time :"+resp.getTime());
	}
	
	@Test
	public void postMethod() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		
		Response resp=RestAssured.given()
				.body("{\r\n"
				+ "    title: 'foo',\r\n"
				+ "    body: 'bar',\r\n"
				+ "    userId: 1,\r\n"
				+ "  }")
				.headers("Content-type","application/json; charset=UTF-8")
				.when()
				.post("posts");
		
		System.out.println("response body :"+resp.getBody().asString());
		
		System.out.println("Status code :"+resp.getStatusCode());
		
		Assert.assertEquals(resp.getStatusCode(), 500);
	}
	
	@Test
	public void putMethod() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		Response resp=RestAssured.given()
				.body("{\r\n"
						+ "    id: 1,\r\n"
						+ "    title: 'foo',\r\n"
						+ "    body: 'bar',\r\n"
						+ "    userId: 1,\r\n"
						+ "  }")
				.headers("Content-type","application/json; charset=UTF-8")
				.when()
				.put("posts/1");
		
		System.out.println("Response body :"+resp.getBody().asString());
		
//		JsonPath path=new JsonPath(resp.getBody().asString());
//		
//		String bodyAttr=path.get("body");
//		
//		Assert.assertEquals(bodyAttr, "bar");
		
		System.out.println("Status code :"+resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 500);
		
		
	}
}
	
//	given 
//	pre-requisite/request
//	
//	when 
//	calling of method
//	
//	then 
//	assertion


