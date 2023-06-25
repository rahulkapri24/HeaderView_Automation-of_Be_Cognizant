package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

																		//Page class for the Login page of the website
public class LoginPage extends BaseClass {

																		// Web page elements of the current page used for running the test
																		// Authorization
	@FindBy(id = "idDiv_SAOTCS_Title")
	WebElement auth;

																		// Constructor to instantiate the Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

																		// Method to verify the page title
	public void verifyPage() {
		check = driver.getTitle();
		assertEquals(check, "Sign in to your account");
	}

	
}
