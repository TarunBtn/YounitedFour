package restapitest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TextkernProfnCompleteNormlized {
	
	@SuppressWarnings("unchecked")
	@Test
	public void professionsCompleteNormalized() {
		
        RequestSpecification request=RestAssured.given();
		
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjQtMDEtMDhUMDc6MDg6MzguOTE5WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzA0Njk3NzI1LCJleHAiOjE3MDQ4NzA1MjUsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsImF1dGhfdGltZSI6MTcwNDY5NzcxOCwic2lkIjoiLWFHX19QYkVBbDdNUDAyNkdSM3d6MVRvd19SLU1MM3MifQ.t071rp8rZEMbfG0uDdQQXsqeCtqDSWJ2XlqCjqZ_fVaGVPpVH7_loDLfeNy5dF8Why2dqDRVspAYWa72oYjX1ih52ISiYyeONvYAdHRHq50pepyDb58d5IRLNIUxsYgkNGWmdMvpKpBsM4i2iQ6G0ALPiDBYtE3DvXgqDiezhEby_YieqlhGluDrtevdbCsQ62lp5JDYlW7DM7l0PSbbFAM8W5N8zit8TLctO8TtadLHho21RhO6nf4_YKYoEPVOKSSKaCV3xmZbqlhGzYfY7uWU4U2W4Z6nZDHCrC4chys2SmqM4cu5FJn0Q7kqDkvRhUouAdwsonIqH9gZr-hrUw");
		
		//JSONObject json=new JSONObject();
		//json.put("categories", "all");
		//json.put("prefix", "Front");
		//json.put("languages", "nl");
		//json.put("output_language", "nl");
		
		//request.body(json.toJSONString());
		
		request.body("{ \"categories\": [ \"all\" ], \"prefix\": \"Front\", \"languages\": [ \"nl\" ], \"output_language\": \"nl\" }");
		
		Response response=request.post("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
		
		int code=response.getStatusCode();
		System.out.println("TextKernel- Status code is: "+code);
		
		Assert.assertEquals(code, 200);
		
		//String data=response.asString();
		String data=response.asPrettyString();
		System.out.println("Response data is: "+data);
					
	}
	
	/*@Test
	public void deleteData() {
		RequestSpecification request=RestAssured.given();
		Response resp=request.delete("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
		int sCode=resp.getStatusCode();
		System.out.println("Status code: "+sCode);
		
	}*/

}
