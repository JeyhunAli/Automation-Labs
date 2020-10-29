package com.automationlabs.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationlabs.base.BaseTest;
import com.automationlabs.pages.ContacUsPage;
import com.automationlabs.pages.MeetingPage;
import com.automationlabs.pages.NaveenPage;
import com.automationlabs.utility.ConstantsUtility;
import com.automationlabs.utility.ExcelUtility;

public class MeetingPageTest extends BaseTest {

	ContacUsPage contactsPage;
	NaveenPage naveenPage;
	MeetingPage meetingPage;

	@BeforeClass
	public void MeetingPageSetUP() {

		// welcomepage.close_popUp();
		contactsPage = welcomepage.goClickContactUsButton();
		naveenPage = contactsPage.getsearchTextField(prop.getProperty("value"));
		meetingPage = naveenPage.click_and_GO_Meeting();
		// naveenPage = contactsPage.goToNaveenPage();
	}
	
	@DataProvider
	public Object[][] getTestDataTest() {
		Object[][] data = ExcelUtility.getTestData(ConstantsUtility.ExcelSheet_Data);
		return data;
		
	}

	@Test(priority = 1, dataProvider = "getTestDataTest")
	public void fillTheMeetingFormTest(String comment, String name, String email, String website) {
		meetingPage.fillTheMeetingForm(comment, name, email, website);

	}

}
