package Test.pack;


import java.io.FileNotFoundException;



import Api.pack.Book_API;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyCreateSteps {
	@Given("Calling Create Method")
	public void calling_create_method() throws FileNotFoundException {
	   Book_API obj0 = new Book_API();
	   obj0.create_Method();
	   
	}

	@Then("Create executed Successfully")
	public void create_executed_successfully() {
	    System.out.println("Create executed sussessfully");
	}
}
