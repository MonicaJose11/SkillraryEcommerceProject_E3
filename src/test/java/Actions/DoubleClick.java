package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
//https://demoapp.skillrary.com/ 
		
	///Step 1: Launch the Browser
	 WebDriverManager.firefoxdriver().setup();
	 FirefoxDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  // Step 2: Open the address
	 driver.get("https://demoapp.skillrary.com/");
	 // select the address of course."
	 WebElement course=driver.findElement(By.id("course"));
	 Actions a=new Actions(driver);
	 a.moveToElement(course).perform();
	 //select the addresss of selenium training
	 
	 driver.findElement(By.xpath("//a[text()='Selenium Training'][1]")).click();
	 
	 // add to cart
	 
	 WebElement plus=driver.findElement(By.id("add"));
	 
	 a.doubleClick(plus).perform();
	 
	 Thread.sleep(3000);
	 driver.close();
	 
	 
	 
	}

}
