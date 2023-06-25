package allTest;

import baseClass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EthicsDetailsPage;
import pages.HeaderViewPage;
import pages.HomePage;
import pages.LoginPage;

																		//Step definitions class of the TruTime feature
public class HeaderViewTest extends BaseClass {
																		// Defining the variables of all Page Object Class 
																		//required by the current test
	public static LoginPage loginPage = new LoginPage();
	public static HomePage homePage = new HomePage();
	public static HeaderViewPage HeaderView = new HeaderViewPage();
	public static EthicsDetailsPage ethic = new EthicsDetailsPage();

	
	@Given("User is on the Login page")
	public void validateLoginPage() {
		loginPage.verifyPage();
	}

	
	@And("User selects the required login options")
	public void slect() {
		System.out.println("hi");
	}
	
	
	@Then("User is redirected to Home page")
	@Given("User is on Home Page")
	public void verify() {
		homePage.verifyPage();

	}

	@When("User clicks on  Logo Profile")
	public void profileClick() {
		homePage.getUserdetails();

	}

	@Then("User information is fetched")
	public void detailsFetched() {
		homePage.details();
	}

	@Given("User Clicks on Company Header")
	public void header1() throws Exception {
		HeaderView.header1();
	}

	@When("User Clicks on Service Header")
	public void header2() {
		HeaderView.header2();
	}

	@And("User Clicks on Sales Resource Header")
	public void header3() {
		HeaderView.header3();
	}

	@And("User Clciks on Market and Countries Header")
	public void header4() {
		HeaderView.header4();
	}

	@And("User Clicks on Corporate Functions Header")
	public void header5() {
		HeaderView.header5();
	}

	@And("User Clicks on People Element Header")
	public void header6() {
		HeaderView.header6();
	}

	@Given("User Clicks to Corporate Functions Header")
	public void corporateHeader() {
		ethic.corporateHeader();
	}

	@Then("User hover on legal & Corporate Affairs")
	public void hoverOnLegal() {
		ethic.legal();
	}

	@And("User Clicks on Ethics and Compliance")
	public void EthicClick() {
		ethic.Ethics();
	}

	@Then("User is redirected to Ethics and Comliance")
	public void pageVerify() {
		ethic.verifyPage();
	}

	@And("User print the Ethic Officer Name and Designation")
	public void ethicOfficer() {
		ethic.ethicsOfficer();

	}

	@And("User scrolls down the Ethic Page")
	public void scrolldown() {
		ethic.scrollDown();
	}

	@And("User print ethics details")
	public void ethicDetails() {
		ethic.details();
	}

	@Then("User print resource links")
	public void printLinks() {
		ethic.resourceLinks();
	}

	 																					//Takes the Screenshot after every  step
	@AfterStep
	public void tearDown(Scenario scenario) {

		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		if (scenario.isFailed())
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "");
		scenario.attach(screenshot, "image/png", "Screenshot");

	}

}
