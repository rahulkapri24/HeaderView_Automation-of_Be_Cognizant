package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class HeaderViewPage extends BaseClass {										//Page class for the Header View page of the web site
	
	
	@FindBy(xpath = "//*[@id=\"spTopPlaceholder\"]/div/div[2]/div/div/div/div/div/div/div[2]/button")
	WebElement companyHeader;

	@FindBy(xpath = "//*[@id='spTopPlaceholder']/div/div[2]/div/div/div/div/div/div/div[3]/button")
	WebElement serviceHeader;

	@FindBy(xpath = "//*[@id=\"spTopPlaceholder\"]/div/div[2]/div/div/div/div/div/div/div[4]/button")
	WebElement saleResourcesHeader;

	@FindBy(xpath = "//*[@id=\"spTopPlaceholder\"]/div/div[2]/div/div/div/div/div/div/div[5]/button")
	WebElement marketHeader;

	@FindBy(xpath = "//*[@id=\"spTopPlaceholder\"]/div/div[2]/div/div/div/div/div/div/div[6]/button")
	WebElement CorporateHeader;

	@FindBy(xpath = "//*[@id=\"spTopPlaceholder\"]/div/div[2]/div/div/div/div/div/div/div[7]/button")
	WebElement PeopleHeader;

	public HeaderViewPage() {
		PageFactory.initElements(driver, this);
	}

	public void header1() throws Exception {							//Method to fetch the Company Header details
		companyHeader.click();
		System.out.println("Header 1 : " + companyHeader.getText());
		printAll();

	}

	public void header2() {												//Method to fetch the Service Header details
		serviceHeader.click();
		System.out.println("Header 2 : " + serviceHeader.getText());
		printAll();

	}

	public void header3() {												//Method to fetch the Sale resource Header details
		saleResourcesHeader.click();
		System.out.println("Header 3 : " + saleResourcesHeader.getText());
		printAll();
	}

	public void header4() {												//Method to fetch the Market Header details
		marketHeader.click();
		System.out.println("Header 4 : " + marketHeader.getText());
		printAll();
	}

	public void header5() {													//Method to fetch the Corporate Header details
		CorporateHeader.click();
		System.out.println("Header 5 : " + CorporateHeader.getText());
		printAll();
	}

	public void header6() {													//Method to fetch the People Header details
		PeopleHeader.click();
		System.out.println("Header 6 : " + PeopleHeader.getText());
		printAll();
	}

	public void printAll() {												//Method to print all the details of Headers when clicked
		System.out.println(
				"_______________________________________________________________________________________________________");

		List<WebElement> list = driver.findElements(
				By.xpath("//*[contains(@class, 'ms-ContextualMenu-list is-open list')]/li/div/a/div/span"));

		for (int i = 0; i < list.size(); i++) {

			System.out.println((i + 1) + " " + list.get(i).getText());
		}
		System.out.println(
				"_______________________________________________________________________________________________________");

	}

}
