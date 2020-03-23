package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.SeleniumBase;

public class MyHomePage extends SeleniumBase{
	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public MyLeadsPage clickLeadsTab()
	{
		WebElement ele = driver.findElementByXPath("//a[text()='Leads']");
		click(ele);
		return new MyLeadsPage(driver);
	}
	

}
