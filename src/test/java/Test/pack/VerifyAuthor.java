package Test.pack;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Api.pack.Author_API;


public class VerifyAuthor extends Author_API {
	@Test(priority=1)
	public void get_Method() {
		Author_API obj = new Author_API();
		obj.get_Method();
	}
	
	
	@Test(priority=2)
	public void post_Method() throws FileNotFoundException {
			
		Author_API obj2 = new Author_API();
		obj2.post_Method();
			
	}
	
	
	
	@Test(priority=3)
	public void put_Method() throws FileNotFoundException
	{
		Author_API obj3 = new Author_API();
		obj3.put_Method();
	}
	
	
	
	@Test(priority=4)
	public void delete_Method()
	{
		Author_API obj4 = new Author_API();
		obj4.delete_Method();
	}

}
