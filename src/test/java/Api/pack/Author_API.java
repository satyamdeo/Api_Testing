package Api.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Author_API {
	public void get_Method()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").when().log().all().
		get("/Authors").then().log().all().assertThat().statusCode(200);
	}
	public void post_Method() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
        .body(getFileContent("D:\\ECLIPSE Files\\API1\\src\\test\\resources\\Author_post.txt")).
		header("Content-Type","application/json").when().log().all().post("/Authors").then().log().all();
	}
	public void put_Method() throws FileNotFoundException {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
		.body(getFileContent("D:\\ECLIPSE Files\\API1\\src\\test\\resources\\Author_post.txt"))
		.header("Content-Type","application/json").when().log().all().put("/Authors/0").then().log().all();
	}
	
	public void delete_Method()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/Authors/6").
		then().log().all().assertThat().statusCode(200);
	}
	
	public static String getFileContent(String filePath) throws FileNotFoundException 
    {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();

}
	
}
