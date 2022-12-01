package Automation_API;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.json.simple.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.Test;
import io.restassured.RestAssured.*;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Put_PatchAndDelete {
	@Test
	public void testPut() {
		
      Map<String, Object> map=new HashedMap<String, Object>();
       
        map.put("name", "Roshna");
		map.put("job", "student");
	
		
		JSONObject request=new JSONObject(map);
		
		Reporter.log(request.toJSONString(),true);
		
        baseURI="https://reqres.in/api";
		
		given().header("Content-Type","application/json").body(request.toJSONString()).when().put("/users/2").then().statusCode(200).log().all();
		
		
		
	}
	@Test
	public void testPatch() {
		 Map<String, Object> map=new HashedMap<String, Object>();
	       
	        map.put("name", "Akshay");
			map.put("job", "Youtuber");
		
			
			JSONObject request=new JSONObject(map);
			
			Reporter.log(request.toJSONString(),true);
			
	        baseURI="https://reqres.in/api";
			
			given().header("Content-Type","application/json").body(request.toJSONString()).when().patch("/users/2").then().statusCode(200).log().all();
			
			
		
	}
	
	
			
			
		
	}



