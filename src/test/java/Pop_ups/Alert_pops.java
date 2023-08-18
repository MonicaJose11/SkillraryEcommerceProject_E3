package Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_pops {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement we=driver.findElement(By.id("course"));
		Actions a= new Actions(driver);
		a.moveToElement(we).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
