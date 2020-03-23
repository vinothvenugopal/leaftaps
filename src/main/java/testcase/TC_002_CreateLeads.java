package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonActions;
import pages.LoginPage;

public class TC_002_CreateLeads extends CommonActions {

	@BeforeTest
	public void setExcelDetails()
	{
		workBookName = "CreateLeads.xlsx";
		workSheetName = "Create";
	}
	@Test(dataProvider = "getData")
	public void createLeadsMethod(String CompanyName,String FirstName,String LastName,String Source,String MarketingCampaign,
			String LocalFirstName,String LocalLastName,String Salutation,String DateOfBirth,String Title,String Department,	
			String AnnualRevenue,String PrefferredCCY,String Industry,String NoOfEmployees,String Ownership,String SICCode,	
			String TickerSymbol,String Description,	String Note,String CountryCode,	String AreaCode,String PhoneNumber,	
			String ExtnNumber,	String PersonToAsk,	String EmailAddress,String WebURL,String ToName,String AttentionName,	
			String Address1,String Address2,String City,String Country,	String State,String ZipCode,String ZipCodeExtn)
	{
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsTab()
		.clickCreateLeadLink()
		.enterCompanyName(CompanyName)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.selectSource(Source)
		.selectMKTGCampaign(MarketingCampaign)
		.enterLocalFirstName(LocalFirstName)
		.enterLocalLastName(LocalLastName)
		.enterSalutation(Salutation)
		.enterBirthDate(DateOfBirth)
		.enterTitle(Title)
		.enterDepartment(Department)
		.enterAnnualRevenue(AnnualRevenue)
		.selectPreferredCCY(PrefferredCCY)
		.selectIndustry(Industry)
		.enterNoOfEmployees(NoOfEmployees)
		.selectOwnership(Ownership)
		.enterSICCode(SICCode)
		.enterDescription(Description)
		.enterNotes(Note)
		.enterCountryCode(CountryCode)
		.enterAreaCode(AreaCode)
		.enterPhoneNumber(PhoneNumber)
		.enterExtension(ExtnNumber)
		.enterPersonToAsk(PersonToAsk)
		.enterEmailID(EmailAddress)
		.enterWebUrl(WebURL)
		.enterToName(ToName)
		.enterAttentionName(AttentionName)
		.enterAddressLine1(Address1)
		.enterAddressLine2(Address2)
		.enterCity(City)
		.selectCountry(Country)
		.selectState(State)
		.enterZipCode(ZipCode)
		.enterZipCodeExtn(ZipCodeExtn)
		.clickCreateLeadButton()
		.verifyPageTitle();
	}
}
