package Rest_Assured_Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GET_Request {
	@Test
	public void GET() {
		
		           // To get the response from server 
		Response response = RestAssured.get("https://gorest.co.in/public/v2/users/2373");
		                  System.out.println(response.getStatusCode());
		                  Reporter.log(response.getStatusLine(),true);
		                  Reporter.log(response.getContentType(),true);
		                  Reporter.log(response.getBody().asPrettyString(),true);
		                  System.out.println(response.getHeaders());
		                  System.out.println(response.getTime());
		                  
// BDD Approach
		                  
 // In given() we can set the precondition like set cookies,add Authentication,add Parameter,set headers...information etc                 
		   given()
		 
 // In when() we use get,post,put,patch,delete etc. request/HTTPS method.  
		  .when()
		  .get("https://gorest.co.in/public/v2/users/2373")
	
 // In then() we validate the status code,status line,headers,response,cookies,response body etc... 
		  .then()
		  .statusCode(200)
		  .statusLine("HTTP/1.1 200 OK")
		  .assertThat().body("name",equalTo("Anasooya Namboothiri"))
		  .header("Content-Type", "application/json; charset=utf-8"); 
		  
		
		
	}

}
