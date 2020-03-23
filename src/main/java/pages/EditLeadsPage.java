package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.SeleniumBase;

public class EditLeadsPage extends SeleniumBase {
	public EditLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadsPage changeCompanyName(String compName)
	{
		WebElement ele = driver.findElementById("updateLeadForm_companyName");
		clearText(ele);
		enterValue(ele, compName);
		return this;
	}
	
	public EditLeadsPage changeFirstName(String fName)
	{
		WebElement ele = driver.findElementById("updateLeadForm_firstName");
		clearText(ele);
		enterValue(ele, fName);
		return this;
	}
	public ViewLeadsPage clickSubmitButton()
	{
		WebElement ele = driver.findElementByName("submitButton");
		click(ele);
		return new ViewLeadsPage(driver);
	}
}
