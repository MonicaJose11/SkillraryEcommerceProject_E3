package TestNg_group;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test (groups="smoke")
	public void demo1()
	{
		System.out.println("demo1");
	}

	@Test
	public void demo2()
	{
		System.out.println("demo2");
	}

}
