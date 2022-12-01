package Rest_Assured_Testing;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PUT_Request {
	// declare HashMap globally which the scope become throughout the class
	
	public static HashMap<String, Object> map=new HashMap<String, Object>();
	
	@BeforeClass
	public void PUT_Data() {
		map.put("id", "2595");
		map.put("name","Brock Lesner");
		map.put("gender","Male");
		map.put("email","Goldberg.wwe@gmial.com");
		map.put("status","Active");
		
		RestAssured.baseURI="https://gorest.co.in";
		RestAssured.basePath="/public/v2/users/2595";
		
	}
	@Test
	public void PUT_Test() {
		
		given()
		.header("Content-Type","application/json")
		.header("Accept","application/json")
		.header("Authorization","Bearer 888d980653665292c117beca6c14d092262f00d5310e1775a9ae3640491753bf")
		.body(map)
		
		.when()
		.put()
		
		.then()
		.statusCode(200);
		
	}
	

}
