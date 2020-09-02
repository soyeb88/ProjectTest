package com.restAssured.read;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

//http://jsonviewer.stack.hu/
//https://jsonpath.curiousconcept.com/


public class SimpleAPIReads {
	
	@Test(enabled=false)
	public void simpleGet() {
		
		Response resp = when().
				get("http://api.openweathermap.org/data/2.5/weather?q=Astoria&appid=a10f7b8cb44ce5e5bab0c8845214a25e");
		System.out.println(resp.asString());
	}
	
	
	@Test(enabled=false)
	public void simpleGetParam() {
		
		Response resp = given().		
						param("q","Astoria").
						param("appid", "a10f7b8cb44ce5e5bab0c8845214a25e").
						get("http://api.openweathermap.org/data/2.5/weather");
		int sCode = resp.getStatusCode();
		
		System.out.println("Status code is: " + sCode);
		Assert.assertEquals(sCode, 200);
		System.out.println(resp.asString());
		
	}
	
	@Test(enabled=false)
	public void simpleGetParamThen() {

		
		
		given().
			param("q","Astoria").
			param("appid", "a10f7b8cb44ce5e5bab0c8845214a25e").
		when().
			get("http://api.openweathermap.org/data/2.5/weather").
		then().
			assertThat().statusCode(200);
		
	}
	
	@Test(enabled=false)
	public void readDBJson() {
		
		Response resp = when().
				get("http://localhost:3000/posts");
		System.out.println(resp.asString());
	}
	
	
}
