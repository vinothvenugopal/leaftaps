package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.SeleniumBase;

public class DuplicateLeadsPage extends SeleniumBase{

	public DuplicateLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadsPage clickCreateLeadButton()
	{
		WebElement ele = driver.findElementByXPath("//input[@class='smallSubmit']");
		click(ele);
		return new ViewLeadsPage(driver);
	}
}
