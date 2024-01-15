package PageObectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driver;
	
	private By myAccount = By.xpath("//i[@class='fa fa-user']");
	
	private By register = By.xpath("//a[contains(text(),'Register')]");
	
	private By Login = By.xpath("//a[contains(text(),'Login')]");
	
	public HomePageObject(WebDriver driver2) {
	
	this.driver = driver2;
}
	
	public WebElement ClickOnMyAccount() {
		
		return driver.findElement(myAccount);
	}
	
	public WebElement ClickOnRegister() {
		return driver.findElement(register);
	}
	
	public WebElement ClickOnLogin() {
		return driver.findElement(Login);
	}
}