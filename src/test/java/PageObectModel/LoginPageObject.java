package PageObectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
public WebDriver driver;
	
	private By email = By.xpath("//input[@name='email']");
	
	private By password = By.xpath("//input[@name='password']");
	
	private By Login = By.xpath("//input[@value='Login']");
	
	public LoginPageObject(WebDriver driver2)  {


	this.driver=driver2;
	
	
	}

	public WebElement enteremail() {
		   
		   return driver.findElement(email);
	}
	   
	   public WebElement enterpassword() {
		   
		   return driver.findElement(password);
	}
	   
	   public WebElement enterLogin() {
		   
		   return driver.findElement(Login);
	}

}
