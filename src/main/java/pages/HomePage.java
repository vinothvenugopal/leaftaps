package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.SeleniumBase;
import common.CommonActions;
import cucumber.api.java.en.Then;

public class HomePage extends SeleniumBase {

	/*
	 * public HomePage(CommonActions commonActions) { this.driver =
	 * commonActions.driver; }
	 */

	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	@Then("Home Page should be displayed")
	public HomePage verifyHomePageTitle()
	{
		if(driver.getTitle().equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("Home Page Title verified");
		}
		else
		{
			System.out.println("Could not verify Home Page Title");
		}
		return this;
	}
	public MyHomePage clickCRMSFALink()
	{
		WebElement ele = driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]");
		click(ele);
		return new MyHomePage(driver);
	}
}
