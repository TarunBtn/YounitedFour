package restapitest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class NoxSkillLookupCodes {
	
	@Test
	public void test() {
		
		String baseURL = "https://acc.nox.nowonline.com/api/v1/textkernel/skills_codes/lookup";
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoMElkIjpudWxsLCJ1c2VyIjoiNjZlMTYxNTg3OTY1NTZhOTY1MzBjYzdhIiwiaWF0IjoxNzI2MDQ2NTUyLCJleHAiOjQ4Nzk2NDY1NTIsImF1ZCI6IllvdW5pdGVkOlBBVCJ9.DN7HidIu2KsonQKZHcz-Fq30Yz_Z_pPbuE4jEf3NGDk");
		
		request.body("{\"code_ids\": [\"KS1282W6V4RX7LC1FDH9\", \"KS8OVJ2JW40EHFA26REM\", \"KS1264H6WHHZB1C4LPC4\", \"KS126256R04NWVG6Y5C0\", \"KS1261X6D4NXVPR41HR0\", \"KS120PF6FM7DV150JDC7\", \"KS120XH73NN0XJNF3QB4\", \"KS4C4D47JSF2KVEZB9KK\", \"KS1242D6XNLNKMBM0ZP2\", \"KS123YR5XXWF2B1L80CG\", \"KS1264H637YVR9N30ZCN\", \"KSHH63XW7KM1D14CB4NW\", \"KS127WJ76HLZX75MZZQW\", \"KS1253R6GWVJ38RTHGWF\", \"KS127JV5XZQ7398C1F20\"]}");
		
		Response response=request.post(baseURL);
		int statusCode=response.getStatusCode();
		System.out.println("Status code: "+statusCode);
		Assert.assertEquals(200, statusCode);
		
		String data=response.asPrettyString();
		System.out.println("Response data: "+data);
		
	}

}
