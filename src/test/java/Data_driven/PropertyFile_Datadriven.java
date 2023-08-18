package Data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile_Datadriven {

	public static void main(String[] args) throws Throwable {
		// Create a property
		Properties p = new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String url=p.getProperty("url");
		String User=p.getProperty("username");
		String password=p.getProperty("password");
		String brow=p.getProperty("browser");
		
		WebDriver driver=null;
		if(brow.equalsIgnoreCase("chrome"))
		 {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else
			if(brow.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				
			}
			else
			{
				
				System.out.println("Invalid browse");
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(User);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("(//div[@data-visualcompletion='ignore'])[9]")).click();
		
		driver.close();
		

	}

}
