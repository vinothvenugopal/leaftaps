package testcase;

import java.util.List;

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
	public void createLeadsMethod( String[][] data)
	{
		for (int i = 0; i < data.length; i++) {

		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsTab()
		.clickCreateLeadLink()
		.enterCompanyName(data[i][0].toString())
		.enterFirstName(data[i][1].toString())
		.enterLastName(data[i][2].toString())
		.selectSource(data[i][3].toString())
		.selectMKTGCampaign(data[i][4].toString())
		.enterLocalFirstName(data[i][5].toString())
		.enterLocalLastName(data[i][6].toString())
		.enterSalutation(data[i][7].toString())
		.enterBirthDate(data[i][8].toString())
		.enterTitle(data[i][9].toString())
		.enterDepartment(data[i][10].toString())
		.enterAnnualRevenue(data[i][11].toString())
		.selectPreferredCCY(data[i][12].toString())
		.selectIndustry(data[i][13].toString())
		.enterNoOfEmployees(data[i][14].toString())
		.selectOwnership(data[i][15].toString())
		.enterSICCode(data[i][16].toString())
		.enterTickersymbol(data[i][17].toString())
		.enterDescription(data[i][18].toString())
		.enterNotes(data[i][19].toString())
		.enterCountryCode(data[i][20].toString())
		.enterAreaCode(data[i][21].toString())
		.enterPhoneNumber(data[i][22].toString())
		.enterExtension(data[i][23].toString())
		.enterPersonToAsk(data[i][24].toString())
		.enterEmailID(data[i][25].toString())
		.enterWebUrl(data[i][26].toString())
		.enterToName(data[i][27].toString())
		.enterAttentionName(data[i][28].toString())
		.enterAddressLine1(data[i][29].toString())
		.enterAddressLine2(data[i][30].toString())
		.enterCity(data[i][31].toString())
		.selectCountry(data[i][32].toString())
		.selectState(data[i][33].toString())
		.enterZipCode(data[i][34].toString())
		.enterZipCodeExtn(data[i][35].toString())
		.clickCreateLeadButton()
		.verifyPageTitle();
		
		/*
		 * new LoginPage(driver) .enterUserName() .enterPassword() .clickLoginButton()
		 * .clickCRMSFALink() .clickLeadsTab() .clickCreateLeadLink()
		 * .enterCompanyName() .enterFirstName(datahelper.FirstName);
		 * .enterLastName(datahelper.LastName) .selectSource(datahelper.Source)
		 * .selectMKTGCampaign(datahelper.MarketingCampaign)
		 * .enterLocalFirstName(datahelper.LocalFirstName)
		 * .enterLocalLastName(datahelper.LocalLastName)
		 * .enterSalutation(datahelper.Salutation) .enterBirthDate(DateOfBirth)
		 * .enterTitle(Title) .enterDepartment(Department)
		 * .enterAnnualRevenue(AnnualRevenue) .selectPreferredCCY(PrefferredCCY)
		 * .selectIndustry(Industry) .enterNoOfEmployees(NoOfEmployees)
		 * .selectOwnership(Ownership) .enterSICCode(SICCode)
		 * .enterDescription(Description) .enterNotes(Note)
		 * .enterCountryCode(CountryCode) .enterAreaCode(AreaCode)
		 * .enterPhoneNumber(PhoneNumber) .enterExtension(ExtnNumber)
		 * .enterPersonToAsk(PersonToAsk) .enterEmailID(EmailAddress)
		 * .enterWebUrl(WebURL) .enterToName(ToName) .enterAttentionName(AttentionName)
		 * .enterAddressLine1(Address1) .enterAddressLine2(Address2) .enterCity(City)
		 * .selectCountry(Country) .selectState(State) .enterZipCode(ZipCode)
		 * .enterZipCodeExtn(ZipCodeExtn) .clickCreateLeadButton() .verifyPageTitle();
		 */
	}
	}
	
}
