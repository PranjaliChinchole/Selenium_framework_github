package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Resources.baseClass;
import PageObectModel.HomePageObject;
import PageObectModel.LoginPageObject;

public class LoginTestCases extends baseClass  {

	@Test
     public void invalidLoginTest() throws IOException, InterruptedException {
		
		Thread.sleep(2000);
		
		HomePageObject hpo = new HomePageObject(driver);
		hpo.ClickOnMyAccount().click();
		hpo.ClickOnLogin().click();
		
		
		
		
		 LoginPageObject lop = new LoginPageObject(driver);
		 
		   lop.enteremail().sendKeys("Test@gmail.com");
	       lop.enterpassword().sendKeys("Test@123");
	       lop.enterLogin().click();
		 

}


	
}
