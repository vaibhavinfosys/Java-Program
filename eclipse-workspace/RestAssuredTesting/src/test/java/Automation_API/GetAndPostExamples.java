package Automation_API;

import org.apache.commons.collections4.map.HashedMap;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

public class GetAndPostExamples {
	@Test
	public void testGet() {
		
		baseURI="https://reqres.in/api";
		
		given().get("/users?page=2").then().statusCode(200).body("data[4].first_name", equalTo("George"));
		
	}
	@Test
	public void testPost() {
		
		Map<String, Object> map=new HashedMap<String, Object>();
		
		map.put("name", "Roshnali");
		map.put("gender", "female");
		map.put("email", "roshanali.katkar@15ce.com");
		map.put("status", "active");
		
	
		
		JSONObject request=new JSONObject(map);
		
		System.out.println(request.toJSONString());
		
		baseURI="https://gorest.co.in";
		
		given().header("Content-Type","application/json").headers("Accept","application/json").headers("Authorization","Bearer 888d980653665292c117beca6c14d092262f00d5310e1775a9ae3640491753bf").body(request.toJSONString()).when().post("/public/v2/users").then().statusCode(201).log().all();
		
	}

}
