package Rest_Assured_Testing;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Test_Methods {
	
	// To test the status code
	@Test(priority = 1)
	public void Test_Status_Code() {
		
		when()
		.get("https://gorest.co.in/public/v2/users/3000")
		
		.then()
		.statusCode(200);
	}
	
	// log response
	@Test(priority = 2)
	public void Logging() {
		
		when()
		.get("https://gorest.co.in/public/v2/users")
		
		.then()
		.log().all();   // log().all(); method will print response in console.
	}
	
// Verifying the single content in response body
	@Test(priority = 3)
	public void Test_SingleContent() {
		
		given()
		
		.when()
		.get("https://gorest.co.in/public/v2/users/2227")
		
		.then()
		.body("name", equalTo("Rajendra Verma"));
		
	}
	
	// Verifying the multiple content in response body
		@Test(priority = 4)
		public void Test_MultipleContent() {
			
			given()
			
			.when()
			.get("https://gorest.co.in/public/v2/users")
			
			.then()
	// hasItems methods are used to verify multiple content from response body
			.body("name", hasItems("Niranjan Talwar","Lakshmi Mehra","Atmaja Singh")); 
			
		}
	// Setting parameters and headers
		@Test(priority = 5)
		public void Test_ParameterAndHeaders() {
			
	  given()
			.param("MyName", "vaibhav") //this is for demo but Actually developer provides headers
			.header("MyHeader","Vaibhav") // like content-type,accept,authorization etc.
			
	  .when()
			.get("https://gorest.co.in/public/v2/users/3000")
			
	  .then()
			.statusCode(200);
		}
	

}
