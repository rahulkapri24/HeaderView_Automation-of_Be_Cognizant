package baseClass;

import java.io.InputStream;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.DriverSetup;
import utilities.PropertiesFileReader;

														
public class BaseClass extends AbstractTestNGCucumberTests	{							//BaseClass to read the info from properties file,
																						//to start the driver and open base url
																						//and to close the driver
	public static WebDriver driver;
	public static InputStream configFile;
	public static PropertiesFileReader reader;
	public static String browser;
	public static String baseUrl;
	public static Actions action;
	public static WebDriverWait eWait;
	public static String check;
	public static FluentWait<WebDriver> fWait;
	
	
	
	@BeforeSuite
	public void configuration() throws Exception
	{
																				//Reading input from a properties file 
		configFile = this.getClass().getResourceAsStream("/config.properties");
		reader = new PropertiesFileReader(configFile);
		
																				//Set up the driver based on the specified browser
		browser = reader.getValue("browser");
		baseUrl = reader.getValue("baseUrl");
		
																				//Starting the browser
		driver = DriverSetup.setupDriver(browser);
		
																				//Instantiating Action class object
		action = new Actions(driver);
		
		
																				//Specifying the different waits to be used in the test automation
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		eWait = new WebDriverWait(driver, Duration.ofSeconds(50));
		fWait = new FluentWait<>(driver);
		
	}
	
	
	@BeforeSuite																//Opens the Base URL before test suite starts
	public void openUrl()
	{
		driver.get(baseUrl);
	}
	
	
	@AfterSuite																	//Closes the driver after test suite ends
	public void closeDriver()
	{
																					//closing all the browsers instances at once
		driver.quit();
	}
	
}
