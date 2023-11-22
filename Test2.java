package org.test;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassAPI.baseclass;
import io.restassured.response.Response;

public class Test2 extends baseclass{
	
	
	@Test
	
	public void test01() throws IOException, InterruptedException {
		
		String url = excelRead(0, 0);
		
		
		System.out.println("URL - "+url);
		
		
		Response response = getmethod(0, 2, url);
		
		
		System.out.println("Get Response "+response.asString());
		
		
		Map<String, String> mp = response.jsonPath().getMap("$");
		
		Assert.assertEquals(mp.get("last_name"), "July03");
		Assert.assertEquals(mp.get("first_name"), "June17");
		
		
		Assert.assertEquals(response.statusCode(), 200, "Status Code Failed");
		
		
		
	

	}
	

}
