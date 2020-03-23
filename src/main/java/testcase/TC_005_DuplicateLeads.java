package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonActions;
import pages.LoginPage;

public class TC_005_DuplicateLeads extends CommonActions{
	
	@BeforeTest
	public void setExcelDetails()
	{
		workBookName = "DuplicateLeads.xlsx";
		workSheetName = "Duplicate";
	}
	@Test(dataProvider = "getData")
	public void duplicateLeadsMethod(String fName) throws InterruptedException
	{
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsTab()
		.clickFindLeadsLink()
		.enterFirstName(fName)
		.clickFindLeadsButton()
		.clickLeadIdFromGrid()
		.clickDuplicateButton()
		.clickCreateLeadButton()
		.verifyPageTitle();
	}
}
