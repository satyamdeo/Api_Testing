package Test.pack;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Api.pack.Coverphoto_API;

public class VerifyCoverPhoto extends Coverphoto_API {
	@Test(priority=1)
	public void get_Method() {
		Coverphoto_API obj = new Coverphoto_API();
		obj.get_Method();
	}
	
	
	@Test(priority=2)
	public void post_Method() throws FileNotFoundException {
			
		Coverphoto_API obj2 = new Coverphoto_API();
		obj2.post_Method();
		
			
	}
	
	
	
	@Test(priority=3)
	public void put_Method() throws FileNotFoundException
	{
		Coverphoto_API obj3 = new Coverphoto_API();
		obj3.put_Method();
	}
	
	
	
	@Test(priority=4)
	public void delete_Method()
	{
		Coverphoto_API obj4 = new Coverphoto_API();
		obj4.delete_Method();
	}
}
