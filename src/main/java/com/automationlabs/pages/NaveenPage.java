package com.automationlabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationlabs.base.BasePage;
import com.automationlabs.utility.ConstantsUtility;
import com.automationlabs.utility.WebElementUtil;

public class NaveenPage extends BasePage {

	private WebDriver driver;

	By NaveenAutomationLabs = By.xpath("//h2/a[text()='Welcome to Naveen AutomationLabs']");
	By lifeMotto = By.xpath("(//div[@class='post-content entry-content']/p)[2]");
	By meeting = By.xpath("//a[text()='Naveen AutomationLabs – Bangalore Meet Up (4th May)']");

	public NaveenPage(WebDriver driver) {

		this.driver = driver;
		eleUtil = new WebElementUtil(driver);

	}

	public String NaveenPageTitle() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return eleUtil.waitFor_Full_TitleToBePresent(ConstantsUtility.NaveenPageTitle, 10);
//		String title = driver.getTitle();
//		System.out.println("Naveen Page Title is: " + title);
//		return title;

		return eleUtil.doGetTitle();

	}

	public WebElement NaveenAutomationLabsLink() {
	WebElement ele = eleUtil.getElement(NaveenAutomationLabs);
		ele.isDisplayed();
	    return ele;

	}

	public String lifeMottoText() {
     return eleUtil.doGetText(lifeMotto);
}

	public void click_and_GO_Meeting() {
		eleUtil.DoActionClick(meeting);
	}

}
