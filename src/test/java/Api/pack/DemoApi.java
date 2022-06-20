package Api.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class DemoApi {
	public static void main(String[] args) throws FileNotFoundException {
		//RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().get("/booking/657").then().log().all().assertThat().statusCode(200);
		//RestAssured.given().baseUri("https://restful-booker.herokuapp.com").headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/booking/567").then().log().all().assertThat().statusCode(201);
		//RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").when().log().all().get("/Activities/8").then().log().all().assertThat().statusCode(200);
		//RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/Activities/2").then().log().all().assertThat().statusCode(200);
		//RestAssured.given().baseUri("https://reqres.in/api/users").when().log().all().get("?page=2").then().log().all().assertThat().statusCode(200);
		//RestAssured.given().baseUri("https://reqres.in/api").headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/users/2").then().log().all().assertThat().statusCode(204);
		
		//RestAssured.given().baseUri("https://reqres.in").body(getFileContent("D:\\ECLIPSE Files\\API1\\src\\test\\resources\\CreateBooking.txt")).header("Accept","application/json").header("Content-Type","application/json").when().log().all().post("/api/users").then().log().all();
		//RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").body(getFileContent("D:\\ECLIPSE Files\\API1\\src\\test\\resources\\CreateBooking1.txt")).header("Content-Type","application/json").when().log().all().post("/Activities").then().log().all();
		//RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").body(getFileContent("D:\\ECLIPSE Files\\API1\\src\\test\\resources\\CreateBooking1.txt")).header("Content-Type","application/json").when().log().all().put("/Activities/0").then().log().all();
		RestAssured.given().baseUri("https://reqres.in/api").body(getFileContent("D:\\ECLIPSE Files\\API1\\src\\test\\resources\\CreateBooking2.txt")).header("Content-Type","application/json").when().log().all().patch("/users/2").then().log().all();
		
		
	}	
	
		
		
		
		public static String getFileContent(String filePath) throws FileNotFoundException 
        {
            File file = new File(filePath);
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\Z");
            return sc.next();
 
}
 
    
	}

