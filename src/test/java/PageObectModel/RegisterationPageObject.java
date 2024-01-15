package PageObectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPageObject {
	
	public WebDriver driver;
	
	private By firstname = By.xpath("//input[@name='firstname']");
	
	private By lastname = By.xpath("//input[@name='lastname']");
	
	private By email = By.xpath("//input[@name='email']");
	
	private By telephone = By.xpath("//input[@name='telephone']");
	
	private By password = By.xpath("//input[@name='password']");
	
	private By passwordConfirm = By.xpath("//input[@name='confirm']");
	
	private By subscribe = By.xpath("(//input[@name='newsletter'])[2]");
	
	private By privacyPolicy = By.xpath("//input[@name='agree']");
	
	private By ContinueButton = By.xpath("//input[@value='Continue']");
	
    private By firstNameErrorMsg = By.xpath("(//div[@class='text-danger'])[1]");
	
	private By lastNameErrorMsg = By.xpath("(//div[@class='text-danger'])[2]");

	// driver 2 took the scope of driver from register test cases class
   public RegisterationPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	   
	   this.driver=driver2;
	}

   public WebElement enterfirstname() {
	   
	   return driver.findElement(firstname);
}
   
   public WebElement enterlastname() {
	   
	   return driver.findElement(lastname);
}
   
   public WebElement enteremail() {
	   
	   return driver.findElement(email);
}
  public WebElement entertelephone() {
	   
	   return driver.findElement(telephone);
}
  public WebElement enterpassword() {
	   
	   return driver.findElement(password);
}
  public WebElement enterPasswordConfirm() {
	   
	   return driver.findElement(passwordConfirm);
}
  public WebElement ClickOnSubscribe() {
	   
	   return driver.findElement(subscribe);
}
  public WebElement AcceptprivacyPolicy() {
	   
	   return driver.findElement(privacyPolicy);
}
  public WebElement clickOnContinueButton() {
	   
	   return driver.findElement(ContinueButton);
}
  public WebElement CaptureFirstNameErrorMsg() {

		return driver.findElement(firstNameErrorMsg);
	}
	
	public WebElement CaptureLastNameErrorMsg() {

		return driver.findElement(lastNameErrorMsg);
	}

}