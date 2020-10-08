package com.automationlabs.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationlabs.base.BasePage;
import com.automationlabs.pages.ContacUsPage;
import com.automationlabs.pages.WelcomePage;
import com.automationlabs.utility.ConstantsUtility;

public class ContacUsPageTest {

	WebDriver driver;
	BasePage basepage;
	WelcomePage welcomepage;
	ContacUsPage contactsPage;

	@BeforeTest
	public void setUp() {
		basepage = new BasePage();
		driver = basepage.initialize_driver("chrome");
		welcomepage = new WelcomePage(driver);
		welcomepage.close_popUp();
	   contactsPage = welcomepage.clickContactUsButton();

	}

	@Test(priority = 1)
	public void ContactusPageTitleTest() {
		String titletext = contactsPage.getContactusPageTitle();
		System.out.println("ContactsUs Page title is: "+titletext);
		Assert.assertEquals(titletext, ConstantsUtility.CONTACTS_PAGE_TITLE, "not found");

	}
	
	@Test
	public void ContactusPageHeaderTest() {
		String headerText = contactsPage.getContactusPageHeader();
		System.out.println(headerText);
		Assert.assertEquals(headerText, ConstantsUtility.CONTACS_PAGE_HEADER, "not found");
	}
	
	@Test
	public void IncaseTextTest() {
		String InCaseText = contactsPage.getIncasetext();
		System.out.println(" in case text in contactsUs page is:  "+InCaseText);
	}
	
	
	@Test
	public void getLinkTest() {
		String linkText = contactsPage.getLink();
		System.out.println("linkText on ContactsUs page is: " + linkText);
	}
	
	@Test
	public void SearchKeywordTest () {
		String searchKeyword = contactsPage.getSearchKeyword();
		System.out.println("searchKeyword in contacts us page is " + searchKeyword);
	}
	
	@Test
	public void searchTextFieldTest() {
		contactsPage.getsearchTextField("jenkins");
		
	}
	
	@Test(enabled = true)
	public void clicksearchbuttonTest() {
		contactsPage.clicksearchbutton();
	}

	@AfterTest(enabled = false)
	public void tearDown() {
		driver.quit();
	}

}
