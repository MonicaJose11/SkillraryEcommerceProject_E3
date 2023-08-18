package Data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Test Data.xlsx");	
	//Step2 : create a workBook 
	Workbook wb=WorkbookFactory.create(fis);
	
	// Step3: Navigate to required sheet
	String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

    
    // open the browser
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(url);
     //Write data into excel sheet.
    String title=driver.getTitle();
    wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
    FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Test Data.xlsx");
    wb.write(fos);
    

	
	
	

	}

}
