package Testng;

import org.testng.annotations.Test;

public class priority {
	
	@Test(priority=-1,invocationCount=3,enabled=false)
	public void demo()
	{
		System.out.println("Hi this is Monica Jose");
	}
	
	@Test(priority=-5,invocationCount=5,enabled=true)
	public void demo2()
	{
		System.out.println("This is Monica Jose");
	}
	

}
