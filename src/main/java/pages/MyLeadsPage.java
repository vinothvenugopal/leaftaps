package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.SeleniumBase;

public class MyLeadsPage extends SeleniumBase{
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadsPage clickCreateLeadLink()
	{
		WebElement ele = driver.findElementByXPath("//a[text()='Create Lead']");
		click(ele);
		return new CreateLeadsPage(driver);
	}
	public FindLeadsPage clickFindLeadsLink()
	{
		WebElement ele = driver.findElementByXPath("//a[text()='Find Leads']");
		click(ele);
		return new FindLeadsPage(driver);
	}
	public MergeLeadsPage clickMergeLeadsLink()
	{
		WebElement ele = driver.findElementByXPath("//a[text()='Merge Leads']");
		click(ele);
		return new MergeLeadsPage(driver);
	}
}
