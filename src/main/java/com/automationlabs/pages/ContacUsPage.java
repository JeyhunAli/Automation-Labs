package com.automationlabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationlabs.base.BasePage;
import com.automationlabs.utility.ConstantsUtility;
import com.automationlabs.utility.WebElementUtil;

public class ContacUsPage extends BasePage {

	private WebDriver driver;
	WebElementUtil eleUtil = new WebElementUtil(driver);

	// By contact = By.xpath("(//a[.='Contact Us'])[1]");
	By header = By.cssSelector("h1.post-title.entry-title");
	By inCase = By.xpath("//span[contains(text(),'In case of any query on training and automation solution.')]");
	By link = By.linkText("https://www.facebook.com/groups/naveenqtpexpert");
	By searchKeyword = By.xpath("//div/h3[@class='widget-title' and contains(text(), 'Search with Keyword')]");
	By searchtext = By.xpath("(//div/input[@id='s'])[2]");
	By searchButton = By.xpath("(//input[@type='submit' and @id='searchsubmit' and @value= 'Search'])[2]");

	public ContacUsPage(WebDriver driver) {
		this.driver = driver;

	}

//	public void clickContactUsButton() {
//		if (driver.findElement(contact).isDisplayed()) {
//			driver.findElement(contact).click();
//
//		}
//	}

	public String getContactusPageTitle() {
		
		return driver.getTitle();
	}

	public String getContactusPageHeader() {
		//eleUtil.waitForElementPresent(header, 5);
		return driver.findElement(header).getText();

	}

	public String getIncasetext() {
		//eleUtil.waitForElementToBeVisible(inCase, 5);
		if (driver.findElement(inCase).isDisplayed()) {
		}
		return driver.findElement(inCase).getText();

	}

	public String getLink() {
		if (driver.findElement(link).isDisplayed()) {
		}
		return driver.findElement(link).getText();

	}

	public String getSearchKeyword() {
		return driver.findElement(searchKeyword).getText();
	}

	public void getsearchTextField(String value) {
		driver.findElement(searchtext).sendKeys(value);

	}

	public void clicksearchbutton() {
		eleUtil.isElementDisplayed_ThenClick(searchButton, 10);
		//eleUtil.getElement(searchButton).click();
	}

}
