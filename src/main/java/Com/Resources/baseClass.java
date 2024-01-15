package Com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class baseClass {
	
	public WebDriver driver;
	
	public void intializeDriver() throws IOException  {
		
		
	//to read the data from properties files
	FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Selenium_Framework\\src\\main\\java\\Com\\Resources\\data.Properties");
	
	//to access the property files
	     Properties prop = new Properties();
	     
	     prop.load(fis);
	     
	     
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
	}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		}    
	

		else if (browserName.equalsIgnoreCase("Edge")) {
		     driver = new EdgeDriver();
		}    
     }
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		
		intializeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	}
}