package Api.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Coverphoto_API {
	public void get_Method()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").when().log().all().
		get("/CoverPhotos").then().log().all().assertThat().statusCode(200);
	}
	public void post_Method() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
        .body(getFileContent("D:\\ECLIPSE Files\\API1\\src\\test\\resources\\CoverPhoto_post.txt")).
		header("Content-Type","application/json").when().log().all().post("/CoverPhotos").then().log().all();
	}
	public void put_Method() throws FileNotFoundException {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
		.body(getFileContent("D:\\ECLIPSE Files\\API1\\src\\test\\resources\\CoverPhoto_post.txt"))
		.header("Content-Type","application/json").when().log().all().put("/CoverPhotos/0").then().log().all();
	}
	
	public void delete_Method()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/CoverPhotos/4").
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
