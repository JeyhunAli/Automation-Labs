package com.automationlabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationlabs.base.BasePage;
import com.automationlabs.utility.ConstantsUtility;
import com.automationlabs.utility.JavaScriptUtil;
import com.automationlabs.utility.WebElementUtil;

/**
 * 
 * @author jey this pages class is responsible for all the page actions number
 *         of the methods and creating locator with the help By Locator
 *
 */

public class WelcomePage extends BasePage {

	private WebDriver driver;
	WebElementUtil eleUtil = new WebElementUtil(driver);
	JavaScriptUtil js = new JavaScriptUtil(driver);


	By closelement = By.xpath("(//div[@role='button'])[2]");
	By automationlabs = By.xpath("//div/a[contains(text(),'naveen automationlabs')]");

	By learnTechnology = By.xpath("//p[contains(text(),'Where we learn technology')]");
	By contact = By.xpath("(//a[contains(text(), 'Contact Us')])[1]");
	//By contact = By.linkText("Contact Us");

	
	// Constructor created
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void close_popUp() {
		driver.findElement(closelement).click();
	}


	public String getwelcomePageTitle() {
		
//		eleUtil.waitFor_Full_TitleToBePresent(ConstantsUtility.WELCOME_PAGE_TITLE, 6);
		String title = driver.getTitle();
		System.out.println("The welcome page title is +" + title);
		return title;
	}

	
	public boolean naveenAutomationlabs_link() {
		return driver.findElement(automationlabs).isDisplayed();

	}

	public boolean learnTechnology_Text() {
		return driver.findElement(learnTechnology).isDisplayed();
	}

	
	public ContacUsPage clickContactUsButton() {
	driver.findElement(contact).click();
		
		return new ContacUsPage(driver);

		
	}

	
//	
//	public ContacUsPage close_popUp1() {
//		driver.findElement(closelement).click();
//		return new ContacUsPage(driver);
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
