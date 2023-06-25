package pages;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import baseClass.BaseClass;

public class EthicsDetailsPage extends BaseClass {											//Page class for the Ethic & Compliance View page of the web site
	@FindBy(xpath = "//*[@id=\"spTopPlaceholder\"]/div/div[2]/div/div/div/div/div/div/div[6]/button")
	WebElement CorporateHeader;

	@FindBy(xpath = "//span[contains(text(), 'Legal & Corporate Affairs')]")
	WebElement legal;

	@FindBy(xpath = "//span[contains(text(), 'Ethics and Compliance')]")
	WebElement ethics;

	@FindBy(xpath = "//div[contains(@class,'hg_ag_9f38462c hg_al_9f38462c lr_al_9f38462c')]/div")
	WebElement EthicPageTitle;

	@FindBy(xpath = "//*[contains(@class, 'ControlZone ControlZone--clean a_b_50a7110f')]/div/div/div/p")
	WebElement details;

	@FindBy(xpath = "//*[contains(@class,'ms-List-surface')]")
	WebElement ResourceLinks;

	@FindBy(xpath = "//div[contains(@class , 'b_a_b8d6211c c_a_b8d6211c')]/figure/figcaption/span")
	WebElement ethicsOfficer;

	@FindBy(xpath = "//*[@id=\"08d714a1-6b17-4fe4-8cc4-f8f2af965026\"]/div/div/div/div/figure/figcaption/span[2]")
	WebElement detailsOfficerDesignation;

	
	public EthicsDetailsPage() {									// Constructor to instantiate the Page Object
		PageFactory.initElements(driver, this);
	}

	public void corporateHeader() {									//Method to click on the Corporate	header
		CorporateHeader.click();
		
	}

	public void legal() {											//Method to hover over the legal sub header
		Actions action = new Actions(driver);
		action.moveToElement(legal).perform();
	}

	public void Ethics() {											//Method to click on the Ethics sub header
		ethics.click();

	}

																	// Scroll Down the Page by executing JavaScript Executor
	public void scrollDown() {
		for (int i = 0; i < 30; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"document.getElementsByClassName(\"a_a_beed2cf1 c_a_beed2cf1 e_a_beed2cf1\")[0].scrollBy(0, 10)");
		}

	}

	public void ethicsOfficer() {										//Method to display the details of Ethic officer

		System.out.println(ethicsOfficer.getText());
		System.out.println(detailsOfficerDesignation.getText());

	}

	public void details() {												//Method to display the Ethic Title

		System.out.println("Ethics Title : " + details.getText());

	}

	public void resourceLinks() {										//Method to display the resourceLinks on console

		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@class,'ms-List-surface')]"));

		System.out.println("Resource Links : ");
		for (int i = 0; i < list.size(); i++) {

			System.out.println((i + 1) + " " + list.get(i).getText());
		}

	}

	public void verifyPage() {											//Method to verify the ethic Page
		eWait.until(ExpectedConditions.visibilityOf(EthicPageTitle));
		assertEquals(EthicPageTitle.getText(), "Ethics & Compliance");
	}

}
