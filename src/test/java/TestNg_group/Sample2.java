package TestNg_group;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void demo3()
	{
		System.out.println("demo3");
	}

	@Test (groups="smoke")
	public void demo4()
	{
		System.out.println("demo4");
	}


}
