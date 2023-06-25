package pages;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import baseClass.BaseClass;

																		//Page class for the Home page of the web site
public class HomePage extends BaseClass {

																		// Web page elements of the current page used for running the test
																		
																		
	@FindBy(id = "O365_HeaderRightRegion")
	WebElement userNameButton;											// User name Button

																		// Current Account User Name
	@FindBy(id = "mectrl_currentAccount_primary")
	WebElement userNameandTitle;
	
																		// Constructor to instantiate the Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	 

																		// Method to fetch the User name and Job title of the user
	public void getUserdetails() {
		userNameButton.click();

		eWait.until(ExpectedConditions.visibilityOf(userNameandTitle));
		userNameandTitle.click();
		System.out.println(
				"_______________________________________________________________________________________________________");
		System.out.println(userNameandTitle.getText());
		System.out.println(
				"_______________________________________________________________________________________________________");

	}

	public void details() {												//Method to verify Account details of the user
		check = userNameandTitle.getText();
		assertEquals(check, "Kapri, Rahul (Contractor)");

	}

																		// Method to verify the current page Title
	public void verifyPage() {
		eWait.until(ExpectedConditions.visibilityOf(userNameButton));
		check = driver.getTitle();
		assertEquals(check, "Be.Cognizant - Home");
	}
}
