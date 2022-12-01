package Rest_Assured_Testing;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class POST_Request {
	
	public static HashMap<String, Object> map=new HashMap<String,Object>();
	
	@BeforeClass
	public void POST_Data() {
		
		map.put("name","Goldberg");
		map.put("gender","Male");
		map.put("email","Goldberg.wwe@gmial.com");
		map.put("status","Active");
		
		RestAssured.baseURI="https://gorest.co.in";
		RestAssured.basePath="/public/v2/users";
		
	}
	@Test
	public void Test_POST() {
		
		given()
		.header("Content-Type","application/json")
		.header("Accept","application/json")
		.header("Authorization","Bearer 888d980653665292c117beca6c14d092262f00d5310e1775a9ae3640491753bf")
		.body(map)
		
		.when()
		.post()
		
		.then()
		.statusCode(201);
		
	}
	

}
