package com.automationlabs.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationlabs.base.BasePage;
import com.automationlabs.pages.WelcomePage;
import com.automationlabs.utility.ConstantsUtility;

public class WelcomePageTest {

	WebDriver driver;
	BasePage basepage;
	WelcomePage welcomepage;

	@BeforeTest
	public void setUp() {
		basepage = new BasePage();
		driver = basepage.initialize_driver("chrome");
		welcomepage = new WelcomePage(driver);

	}

	@Test(priority = 3)
	public void closePopUpTest() {

		welcomepage.close_popUp();
	}

	@Test(priority = 1)
	public void verifywelcomepageTitle_Test() {
		String title = welcomepage.getwelcomePageTitle();
		System.out.println("welcome page title is " + title);
		Assert.assertEquals(title, ConstantsUtility.WELCOME_PAGE_TITLE, "title is not correct please check ....");
	}

	@Test(priority = 2)
	public void verify_naveenAutomationlabs_link_test() {
		Assert.assertTrue(welcomepage.naveenAutomationlabs_link(), "link is not displayed please check .....");
	}

	@Test
	public void verify_learnTechnology_TexTest() {
		Assert.assertTrue(welcomepage.learnTechnology_Text(), "text is not displayed please check .....");

	}

	@Test(enabled = false)
	public void clickContactUsButtonTest() {
		welcomepage.clickContactUsButton();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
