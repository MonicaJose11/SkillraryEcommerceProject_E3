package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop {

	public static void main(String[] args) throws Throwable {
		// Step :1 Launch the browser
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	// Step 2: Enter the URl
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement block4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
	Actions a=new Actions(driver);
	a.dragAndDrop(block1, block4).perform();
	Thread.sleep(3000);
	
	

	}

}
