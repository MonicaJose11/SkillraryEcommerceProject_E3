package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_LoginPage {
	
	// declaration
	
	
	
	
	//address 
	
	@FindBy(name="email")
	private WebElement emailTf;
	
	@FindBy(id="pass")
	private WebElement passwordtf;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	//Initialization
	
	public fb_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//getter & setter methods

	public WebElement getEmailTf() {
		return emailTf;
	}

	

	public WebElement getPasswordtf() {
		return passwordtf;
	}

	

	public WebElement getLoginbtn() {
		return loginbtn;
	}


	
	
	
	//uitilizatiom
	
	public void emailtextfield(String username,String password)
	{
		emailTf.sendKeys(username);
		passwordtf.sendKeys(password);
		loginbtn.click();
	}
	
	
	
	
           
}
