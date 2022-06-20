package Api.pack;

import io.restassured.RestAssured;

public class GetApi {
	public void getMethod()
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().
		get("/booking").then().log().all().assertThat().statusCode(200);
		
	}
	public void deleteMethod() {
		
		RestAssured.given().baseUri("https://reqres.in/api").headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").
		when().log().all().delete("/users/2").then().log().all().assertThat().statusCode(204);
	}

}
