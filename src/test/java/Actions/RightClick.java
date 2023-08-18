package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		// Step 1: Launch the browser
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Step 2: type the URL
		 driver.get("https://www.amazon.in/");
		WebElement right= driver.findElement(By.id("twotabsearchtextbox"));
		Actions a= new Actions(driver);
		a.contextClick(right).perform();
		

	}

}
