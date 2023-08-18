package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Amazon_Dropdown {
	public static void main(String[] args) throws Throwable {	
		// Step 1: Launch the
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 2: get the URL
		driver.get("https://www.amazon.in/");
		// Step 3: select Dropdown
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
	// step 4: handling drop down
		
		Select s=new Select(dropdown);	
	s.selectByIndex(5); 		
		Thread.sleep(3000);
		s.selectByValue("search-alias=furniture");
		Thread.sleep(3000);
		s.selectByVisibleText("Garden & Outdoors");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		
		List<WebElement> values=s.getOptions();
		
		for(WebElement b:values) {
			System.out.println(b.getText());
		}
			
		}
		
		

	}

