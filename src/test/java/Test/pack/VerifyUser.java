package Test.pack;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Api.pack.User_API;



public class VerifyUser extends User_API {
	@Test(priority=1)
	public void get_Method() {
		User_API obj = new User_API();
		obj.get_Method();
	}
	
	
	@Test(priority=2)
	public void post_Method() throws FileNotFoundException {
			
		User_API obj2 = new User_API();
		obj2.post_Method();
		
			
	}
	
	
	
	@Test(priority=3)
	public void put_Method() throws FileNotFoundException
	{
		User_API obj3 = new User_API();
		obj3.put_Method();
	}
	
	
	
	@Test(priority=4)
	public void delete_Method()
	{
		User_API obj4 = new User_API();
		obj4.delete_Method();
	}
}
