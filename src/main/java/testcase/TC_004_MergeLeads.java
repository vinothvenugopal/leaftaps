package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonActions;
import pages.LoginPage;

public class TC_004_MergeLeads extends CommonActions{
	
	@BeforeTest
	public void setExcelDetails()
	{
		workBookName = "MergeLeads.xlsx";
		workSheetName = "Merge";
	}

	@Test(dataProvider = "getData")
	public void mergeLeadsMethod(String fName, String nextName) throws InterruptedException
	{
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsTab()
		.clickMergeLeadsLink()
		.clickFromLeadImg()
		.enterFirstName(fName)
		.clickFindLeadsButton()
		.clickLeadsFromGrid()
		.clickToLeadImg()
		.enterFirstName(nextName)
		.clickFindLeadsButton()
		.clickLeadsFromGrid()
		.clickMergeButton()
		.handleAlert()
		.verifyPageTitle();
	}
}
