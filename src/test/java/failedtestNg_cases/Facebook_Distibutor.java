package failedtestNg_cases;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Distibutor {
	
	@Test
	
	public void facebook() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ashaajose11@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("20VmoniJ!");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
