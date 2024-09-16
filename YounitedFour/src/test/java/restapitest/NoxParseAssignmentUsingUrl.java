package restapitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NoxParseAssignmentUsingUrl {
	
	@Test
	public void test() {
		
		String baseURL="https://acc.nox.nowonline.com/api/v1/textkernel/extractdo/assignment";
		//Parameter
		String publicURL="https://startpeople.nl/vacature/flexibele-verzorgende-ig-(v3037501)";
		
		RequestSpecification request=RestAssured.given();
		//request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoMElkIjpudWxsLCJ1c2VyIjoiNjZlMTYxNTg3OTY1NTZhOTY1MzBjYzdhIiwiaWF0IjoxNzI2MDQ2NTUyLCJleHAiOjQ4Nzk2NDY1NTIsImF1ZCI6IllvdW5pdGVkOlBBVCJ9.DN7HidIu2KsonQKZHcz-Fq30Yz_Z_pPbuE4jEf3NGDk");
		request.multiPart("publicUrl", publicURL);
		
		Response response=request.post(baseURL);
		int statusCode=response.getStatusCode();
		System.out.println("Status code is: "+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		String data=response.asPrettyString();
		System.out.println("Response data: "+data);
		
		
	}

}
