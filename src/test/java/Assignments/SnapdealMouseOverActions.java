package Assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealMouseOverActions {

	public static void main(String[] args) {
		//Step 1: Launch the Browser & maximize the window with delay in seconds
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	// Step 2: get into the Snapdeal Web address
		driver.get("https://snapdeal.com/");
	//step 3: click on Sign in and click on register

	}

}
