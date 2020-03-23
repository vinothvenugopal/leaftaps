package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonActions;
import pages.LoginPage;

public class TC_003_EditLeads extends CommonActions{
	
	@BeforeTest
	public void setExcelDetails()
	{
		workBookName = "EditLeads.xlsx";
		workSheetName = "Edit";
	}
	
	@Test(dataProvider = "getData")
	public void editLeadsMethos(String fName, String lName, String nameEdit, String companyEdit) throws InterruptedException
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
		.clickEditButton()
		.changeCompanyName(companyEdit)
		.changeFirstName(nameEdit)
		.clickSubmitButton()
		.verifyPageTitle();
		
	}
}
