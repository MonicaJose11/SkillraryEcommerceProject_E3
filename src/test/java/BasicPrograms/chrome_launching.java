package BasicPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome_launching {

	public static void main(String[] args) {
		
		
		// 

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	}

}
