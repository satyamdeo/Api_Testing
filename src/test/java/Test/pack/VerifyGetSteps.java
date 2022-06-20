package Test.pack;



import Api.pack.GetApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGetSteps extends GetApi {
	@Given("Calling Get Method")
	public void calling_get_method() {
		GetApi obj6 = new GetApi();
	    obj6.getMethod();
	}

	@Then("executed Successfully")
	public void executed_successfully() {
		System.out.println("g");
	}
}
