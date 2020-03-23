package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.SeleniumBase;

public class MergeLeadsChildFromLeadsPage extends SeleniumBase{
	public MergeLeadsChildFromLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public MergeLeadsChildFromLeadsPage enterFirstName(String fName)
	{
		WebElement ele = driver.findElementByName("firstName");
		enterValue(ele, fName);
		return this;
	}
	public MergeLeadsChildFromLeadsPage clickFindLeadsButton()
	{
		WebElement ele = driver.findElementByXPath("//button[text()='Find Leads']");
		click(ele);
		return this;
	}
	public MergeLeadsPage clickLeadsFromGrid() throws InterruptedException
	{
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElementsByXPath("//a[@class='linktext']");
		clickLinkFromGrid(ele, 0);
		switchToWindow(0);
		return new MergeLeadsPage(driver);
	}

}
