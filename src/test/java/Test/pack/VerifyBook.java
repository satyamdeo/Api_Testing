package Test.pack;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Api.pack.Book_API;

public class VerifyBook extends Book_API {
	@Test(priority=1)
	public void get_Method() {
		Book_API obj = new Book_API();
		obj.get_Method();
	}
	
	
	@Test(priority=2)
	public void post_Method() throws FileNotFoundException {
			
		Book_API obj2 = new Book_API();
		obj2.create_Method();
		
			
	}
	
	
	
	@Test(priority=3)
	public void put_Method() throws FileNotFoundException
	{
		Book_API obj3 = new Book_API();
		obj3.put_Method();
	}
	
	
	
	@Test(priority=4)
	public void delete_Method()
	{
		Book_API obj4 = new Book_API();
		obj4.delete_Method();
	}
}
