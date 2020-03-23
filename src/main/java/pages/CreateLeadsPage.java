package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import base.SeleniumBase;
import common.CommonActions;

public class CreateLeadsPage extends SeleniumBase {
	public String countryValue;
	public String compName;
	public CreateLeadsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadsPage enterCompanyName(String companyName)
	{
		WebElement ele = driver.findElementById("createLeadForm_companyName");
		enterValue(ele, companyName);
		compName = getTextBoxText(ele);
		return this;
	}
	public CreateLeadsPage enterFirstName(String firstName)
	{
		WebElement ele = driver.findElementById("createLeadForm_firstName");
		enterValue(ele, firstName);
		return this;
	}
	public CreateLeadsPage enterLastName(String lastName)
	{
		WebElement ele = driver.findElementById("createLeadForm_lastName");
		enterValue(ele, lastName);
		return this;
	}
	public CreateLeadsPage selectSource(String source)
	{
		WebElement ele = driver.findElementById("createLeadForm_dataSourceId");
		selectDropDownByVisibleText(ele, source);
		return this;
	}
	public CreateLeadsPage selectMKTGCampaign(String mktgCampaign)
	{
		WebElement ele = driver.findElementById("createLeadForm_marketingCampaignId");
		selectDropDownByVisibleText(ele, mktgCampaign);
		return this;
	}
	public CreateLeadsPage enterLocalFirstName(String lFirstName)
	{
		WebElement ele = driver.findElementById("createLeadForm_firstNameLocal");
		enterValue(ele, lFirstName);
		return this;
	}
	public CreateLeadsPage enterLocalLastName(String lLastName)
	{
		WebElement ele = driver.findElementById("createLeadForm_lastNameLocal");
		enterValue(ele, lLastName);
		return this;
	}
	public CreateLeadsPage enterSalutation(String salutation)
	{
		WebElement ele = driver.findElementById("createLeadForm_personalTitle");
		enterValue(ele, salutation);
		return this;
	}
	public CreateLeadsPage enterTitle(String title)
	{
		WebElement ele = driver.findElementById("createLeadForm_generalProfTitle");
		enterValue(ele, title);
		return this;
	}
	public CreateLeadsPage enterAnnualRevenue(String aRevenue)
	{
		WebElement ele = driver.findElementById("createLeadForm_annualRevenue");
		enterValue(ele, aRevenue);
		return this;
	}
	public CreateLeadsPage selectPreferredCCY(String pCCY)
	{
		WebElement ele = driver.findElementById("createLeadForm_currencyUomId");
		selectDropDownByValue(ele, pCCY);
		return this;
	}
	public CreateLeadsPage enterBirthDate(String dob)
	{
		WebElement ele = driver.findElementById("createLeadForm_birthDate");
		enterValue(ele, dob);
		return this;
	}
	public CreateLeadsPage enterDepartment(String dept)
	{
		WebElement ele = driver.findElementById("createLeadForm_departmentName");
		enterValue(ele, dept);
		return this;
	}
	public CreateLeadsPage selectIndustry(String industry)
	{
		WebElement ele = driver.findElementById("createLeadForm_industryEnumId");
		selectDropDownByVisibleText(ele, industry);
		return this;
	}
	public CreateLeadsPage selectOwnership(String ownership)
	{
		WebElement ele = driver.findElementById("createLeadForm_ownershipEnumId");
		selectDropDownByVisibleText(ele, ownership);
		return this;
	}
	public CreateLeadsPage enterNoOfEmployees(String noOfEmp)
	{
		WebElement ele = driver.findElementById("createLeadForm_numberEmployees");
		enterValue(ele, noOfEmp);
		return this;
	}
	public CreateLeadsPage enterSICCode(String sicCode)
	{
		WebElement ele = driver.findElementById("createLeadForm_sicCode");
		enterValue(ele, sicCode);
		return this;
	}
	public CreateLeadsPage enterTickersymbol(String tickerSymbol)
	{
		WebElement ele = driver.findElementById("createLeadForm_tickerSymbol");
		enterValue(ele, tickerSymbol);
		return this;
	}
	public CreateLeadsPage enterDescription(String description)
	{
		WebElement ele = driver.findElementById("createLeadForm_description");
		enterValue(ele, description);
		return this;
	}
	public CreateLeadsPage enterNotes(String note)
	{
		WebElement ele = driver.findElementById("createLeadForm_importantNote");
		enterValue(ele, note);
		return this;
	}
	public CreateLeadsPage enterCountryCode(String countryCode)
	{
		WebElement ele = driver.findElementById("createLeadForm_primaryPhoneCountryCode");
		enterValue(ele, countryCode);
		return this;
	}
	public CreateLeadsPage enterAreaCode(String areaCode)
	{
		WebElement ele = driver.findElementById("createLeadForm_primaryPhoneAreaCode");
		enterValue(ele, areaCode);
		return this;
	}
	public CreateLeadsPage enterPhoneNumber(String phNo)
	{
		WebElement ele = driver.findElementById("createLeadForm_primaryPhoneNumber");
		enterValue(ele, phNo);
		return this;
	}
	public CreateLeadsPage enterExtension(String extn)
	{
		WebElement ele = driver.findElementById("createLeadForm_primaryPhoneExtension");
		enterValue(ele, extn);
		return this;
	}
	public CreateLeadsPage enterPersonToAsk(String personToAsk)
	{
		WebElement ele = driver.findElementById("createLeadForm_primaryPhoneAskForName");
		enterValue(ele, personToAsk);
		return this;
	}
	public CreateLeadsPage enterEmailID(String email)
	{
		WebElement ele = driver.findElementById("createLeadForm_primaryEmail");
		enterValue(ele, email);
		return this;
	}
	public CreateLeadsPage enterWebUrl(String webURL)
	{
		WebElement ele = driver.findElementById("createLeadForm_primaryWebUrl");
		enterValue(ele, webURL);
		return this;
	}
	public CreateLeadsPage enterToName(String toName)
	{
		WebElement ele = driver.findElementById("createLeadForm_generalToName");
		enterValue(ele, toName);
		return this;
	}
	public CreateLeadsPage enterAttentionName(String attention)
	{
		WebElement ele = driver.findElementById("createLeadForm_generalAttnName");
		enterValue(ele, attention);
		return this;
	}
	public CreateLeadsPage enterAddressLine1(String address1)
	{
		WebElement ele = driver.findElementById("createLeadForm_generalAddress1");
		enterValue(ele, address1);
		return this;
	}
	public CreateLeadsPage enterAddressLine2(String address2)
	{
		WebElement ele = driver.findElementById("createLeadForm_generalAddress2");
		enterValue(ele, address2);
		return this;
	}
	public CreateLeadsPage enterCity(String city)
	{
		WebElement ele = driver.findElementById("createLeadForm_generalCity");
		enterValue(ele, city);
		return this;
	}
	public CreateLeadsPage selectCountry(String country)
	{
		WebElement ele = driver.findElementById("createLeadForm_generalCountryGeoId");
		selectDropDownByValue(ele, country);
		countryValue = getDropDownText(ele);
		return this;
	}
	public CreateLeadsPage selectState(String state)
	{
		if(countryValue.equals("United States") || countryValue.equals("India"))
		{
			WebElement ele = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			selectDropDownByVisibleText(ele, state);
		}
		else
		{
			System.out.println("Selected Country is not India or United States. States belonging to other countries"
					+ "are not available");
		}
		return this;
	}
	public CreateLeadsPage enterZipCode(String zipCode)
	{
		WebElement ele = driver.findElementById("createLeadForm_generalPostalCode");
		enterValue(ele, zipCode);
		return this;
	}
	public CreateLeadsPage enterZipCodeExtn(String zipCodeExtn)
	{
		WebElement ele = driver.findElementById("createLeadForm_generalPostalCodeExt");
		enterValue(ele, zipCodeExtn);
		return this;
	}
	public ViewLeadsPage clickCreateLeadButton()
	{
		WebElement ele = driver.findElementByClassName("smallSubmit");
		click(ele);
		return new ViewLeadsPage(driver);
	}
}
