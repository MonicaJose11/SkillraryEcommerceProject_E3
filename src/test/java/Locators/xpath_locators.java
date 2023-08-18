package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashaajose11@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("VmoniJ!");
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		driver.close();
		

	}

}
