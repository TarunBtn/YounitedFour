package restapitest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Textkernel {
	
	@SuppressWarnings("unchecked")
	@Test(priority=1)
	public void completeNormalized() {
		
	RequestSpecification request=RestAssured.given();
	
	request.header("Content-Type", "application/json");
	request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTAtMjdUMDg6Mzk6MDEuNDk1WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNjk4Mzk1OTQzLCJleHAiOjE2OTg1Njg3NDMsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6IkFKZFdVck5oamwtSlBPUlB1TGZtaHcwN0dLQkx6THdTIiwibm9uY2UiOiJaVTVoZmtOVExtOXhNMGszZG1aeVpuaFNZMHhHZDJSbWJtUmZUMDFzTTJOelVsWlNUWDVYTWtKUmVBPT0ifQ.XHVR7-jZNmKrfVJUL_h63OoHLSvaaLreuTP9z2rF3YINesiqjRngzjWpLjfra30oUtdwUbY9kmobP_jlneEzHNarXzRv3HLWdkw7b1-XGAx0slHhGvIt6345R2O5PL3t89_nYRmTwes2pz4LleqBs37Ei9CU2MR76JHtaAuF8ptDm_I61dLyNxAb2um9UmM4Lta9m5t9V_MO6_VlZdlHbbaFRNy-e9K2pFxngaI5jEXHLxcH0yMk2EWvHweZf_M4VyCETFnDrlOvRzV-79eA6f16bpemOd68oGdkkztjEgpFKA8BMVYGJBplXEmr1MvnNX8mZ_voPgLnD94-fsK11g");
	
	JSONObject json=new JSONObject();
	json.put("categories", "all");
	json.put("prefix", "Postman");
	json.put("languages", "nl");
	json.put("output_language", "nl");
	
	request.body(json.toJSONString());
	
	Response response=request.post("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
	
	int code=response.getStatusCode();
	System.out.println("Textkernel- Status code is: "+code);
	
	//String data=response.getBody().asString();
	//System.out.println("Response data is: "+data);
	
	Assert.assertEquals(code, 200);
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Test(priority=2)
	public void professionsCompleteNormalized() {
		
		RequestSpecification request=RestAssured.given();
		
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTAtMjdUMDg6Mzk6MDEuNDk1WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNjk4Mzk1OTQzLCJleHAiOjE2OTg1Njg3NDMsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6IkFKZFdVck5oamwtSlBPUlB1TGZtaHcwN0dLQkx6THdTIiwibm9uY2UiOiJaVTVoZmtOVExtOXhNMGszZG1aeVpuaFNZMHhHZDJSbWJtUmZUMDFzTTJOelVsWlNUWDVYTWtKUmVBPT0ifQ.XHVR7-jZNmKrfVJUL_h63OoHLSvaaLreuTP9z2rF3YINesiqjRngzjWpLjfra30oUtdwUbY9kmobP_jlneEzHNarXzRv3HLWdkw7b1-XGAx0slHhGvIt6345R2O5PL3t89_nYRmTwes2pz4LleqBs37Ei9CU2MR76JHtaAuF8ptDm_I61dLyNxAb2um9UmM4Lta9m5t9V_MO6_VlZdlHbbaFRNy-e9K2pFxngaI5jEXHLxcH0yMk2EWvHweZf_M4VyCETFnDrlOvRzV-79eA6f16bpemOd68oGdkkztjEgpFKA8BMVYGJBplXEmr1MvnNX8mZ_voPgLnD94-fsK11g");
		
		JSONObject json=new JSONObject();
		json.put("categories", "all");
		json.put("prefix", "Front");
		json.put("languages", "nl");
		json.put("output_language", "nl");
		
		request.body(json.toJSONString());
		
		Response response=request.post("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
		
		int code=response.getStatusCode();
		System.out.println("TextKernel- Status code is: "+code);
		
		//String data=response.asString();
		//System.out.println("Response data is: "+data);
		
		Assert.assertEquals(code, 200);
			
		}

}
