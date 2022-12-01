package Automation_API;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Delete {
	@Test
	public void testDelete() {
		
	        baseURI="https://reqres.in";
			
			when().delete("/api/users/2").then().statusCode(204).log().all();
}
}
