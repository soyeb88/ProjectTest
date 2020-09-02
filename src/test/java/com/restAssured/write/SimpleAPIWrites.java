package com.restAssured.write;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class SimpleAPIWrites {
	
	
	//payload
	@Test(enabled=false)
	public void simpleWrite() {
		
		Response resp =  given().
				body("{\"id\":5, "
						+ "\"tittle\":\"SQL Basic\", "
						+ "\"author\":\"Maruf Rahman\"}").
				when().
				contentType(ContentType.JSON).
				post("http://localhost:3000/posts");
		
		int sCode = resp.getStatusCode();
		
		System.out.println(sCode);
		System.out.println(resp.asString());
		
		
	}
	
	@Test(enabled=true)
	public void patchTitle() {
		
		Response resp =  given().
				body("{\"tittle\": \"SQL Advance\"}").
				when().
				contentType(ContentType.JSON).
				patch("http://localhost:3000/posts/5");
		
		int sCode = resp.getStatusCode();
		
		System.out.println(sCode);
		System.out.println(resp.asString());
		
		
	}
	
	@Test(enabled=false)
	public void simpleDelete() {
		
		Response resp =  given().
				when().
				contentType(ContentType.JSON).
				delete("http://localhost:3000/posts/2");
		
		int sCode = resp.getStatusCode();
		
		System.out.println(sCode);
		System.out.println(resp.asString());
		
		
	}
	
}
