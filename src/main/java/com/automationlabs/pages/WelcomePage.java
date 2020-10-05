package com.automationlabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationlabs.base.BasePage;

/**
 * 
 * @author jey this pages class is responsible for all the page actions number
 *         of the methods and creating locator with the help By Locator
 *
 */

public class WelcomePage extends BasePage {

	private WebDriver driver;
	By closelement = By.xpath("(//div[@role='button'])[2]");

	By automationlabs = By.xpath("//div/a[contains(text(),'naveen automationlabs')]");
	By learnTechnology = By.xpath("//p[contains(text(),'Where we learn technology')]");

	
	//Constructor created
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getwelcomePageTitle() {
		String title = driver.getTitle();
		System.out.println("The welcome page title is +" + title);
		return title;
	}
	
	public void close_popUp() {
		driver.findElement(closelement).click();
	}

	public boolean naveenAutomationlabs_link() {
		return driver.findElement(automationlabs).isDisplayed();

	}
	
	public boolean learnTechnology_Text() {
		return driver.findElement(learnTechnology).isDisplayed();
	}

}
