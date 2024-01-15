package testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.Resources.baseClass;
import PageObectModel.HomePageObject;
import PageObectModel.RegisterationPageObject;


public class RegisterTestCases extends baseClass {
	
	
	
	@Test
	public void verifyRegistrationWithBlankData() throws IOException, InterruptedException  {
		
		Thread.sleep(2000);
		
		HomePageObject hpo = new HomePageObject(driver);
		hpo.ClickOnMyAccount().click();
		hpo.ClickOnRegister().click();
		
		
		 RegisterationPageObject rop = new RegisterationPageObject (driver);
		 
	     rop.enterfirstname().clear();
		 
	       rop.enterfirstname().sendKeys("");
	       
	       rop.enterlastname().clear();
	     
	       rop.enterlastname().sendKeys("");
	       
	       rop.enteremail().clear();
	       rop.enteremail().sendKeys("");
	        rop.entertelephone().sendKeys("");
	        rop.enterpassword().sendKeys("");
			rop.enterPasswordConfirm().sendKeys("");
			rop.ClickOnSubscribe().click();
			rop.AcceptprivacyPolicy().click();
			rop.clickOnContinueButton().click();  
			
			
			SoftAssert sa = new SoftAssert();

			String firstNameErrorMsg = "First Name must be between 1 and 32 characters!";

			String lastNameErrorMsg = "Last Name must be between 1 and 32 characters!";
             
			sa.assertEquals(rop.CaptureFirstNameErrorMsg().getText(),firstNameErrorMsg);
			sa.assertEquals(rop.CaptureLastNameErrorMsg().getText(),lastNameErrorMsg);
			sa.assertAll();
		}
	
	public String generateRandomEmail() {
		return System.currentTimeMillis()+"@gmail.com";
		
		
	}
	
	
	
	
	@Test  
	 public void verifyRegistrationwithInValidData() throws InterruptedException {
		
		Thread.sleep(2000);
		
		RegisterationPageObject rop = new RegisterationPageObject(driver);
		rop.enterfirstname().sendKeys("Test");
		rop.enterlastname().sendKeys("Test");
		rop.enteremail().sendKeys(generateRandomEmail());
		rop.entertelephone().sendKeys("1234578");
		rop.enterpassword().sendKeys("Test123");
		rop.enterPasswordConfirm().sendKeys("Test123");
		rop.ClickOnSubscribe().click();
		rop.clickOnContinueButton().click();
		
		
		SoftAssert sa = new SoftAssert();
		
		String successURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/success";
		
		sa.assertEquals(driver.getCurrentUrl(), successURL);

		sa.assertAll();
		
	}		

}

	
	

	       


