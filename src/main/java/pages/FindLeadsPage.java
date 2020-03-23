package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.SeleniumBase;

public class FindLeadsPage extends SeleniumBase{
	public FindLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public FindLeadsPage enterFirstName(String fName)
	{
		WebElement ele = driver.findElementByXPath("(//input[@name='firstName'])[3]");
		enterValue(ele, fName);
		return this;
	}
	public FindLeadsPage clickFindLeadsButton()
	{
		WebElement ele = driver.findElementByXPath("//button[text()='Find Leads']");
		click(ele);
		return this;
	}
	public ViewLeadsPage clickLeadIdFromGrid() throws InterruptedException
	{
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElementsByXPath("//a[@class='linktext']");
		clickLinkFromGrid(ele, 3);
		return new ViewLeadsPage(driver);
	}

}
