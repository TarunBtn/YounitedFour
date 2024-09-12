package restapitest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class NoxSkillLookup {
	
	@Test
	public void test() {
		String baseURL="https://acc.nox.nowonline.com/api/v1/textkernel/skills/lookup/{code_id}";
		//Path parameter
		String code_id="1584";
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoMElkIjpudWxsLCJ1c2VyIjoiNjZlMTYxNTg3OTY1NTZhOTY1MzBjYzdhIiwiaWF0IjoxNzI2MDQ2NTUyLCJleHAiOjQ4Nzk2NDY1NTIsImF1ZCI6IllvdW5pdGVkOlBBVCJ9.DN7HidIu2KsonQKZHcz-Fq30Yz_Z_pPbuE4jEf3NGDk");
		request.pathParam("code_id", code_id);
		
		Response response=request.get(baseURL);
		int statusCode=response.getStatusCode();
		System.out.println("Status code: "+statusCode);
		Assert.assertEquals(200, statusCode);
		
		String data=response.asPrettyString();
		System.out.println("Response data: "+data);
		
		
	}

}
