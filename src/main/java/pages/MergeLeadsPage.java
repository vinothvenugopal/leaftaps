package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.SeleniumBase;

public class MergeLeadsPage extends SeleniumBase{
	public MergeLeadsPage(RemoteWebDriver driver) {
			this.driver = driver;
		}
	public MergeLeadsChildFromLeadsPage clickFromLeadImg() {
		WebElement ele = driver.findElementByXPath("(//img[@alt='Lookup'])[1]");
		click(ele);
		switchToWindow(1);
		return new MergeLeadsChildFromLeadsPage(driver);
	}
	public MergeLeadsChildToLeadsPage clickToLeadImg()
	{
		WebElement ele = driver.findElementByXPath("(//img[@alt='Lookup'])[2]");
		click(ele);
		switchToWindow(1);
		return new MergeLeadsChildToLeadsPage(driver);
	}
	public MergeLeadsPage clickMergeButton() throws InterruptedException
	{
		WebElement ele = driver.findElementByXPath("//a[text()='Merge']");
		click(ele);
		Thread.sleep(2000);
		return this;
	}
	public ViewLeadsPage handleAlert()
	{
		handleAlert(true);
		return new ViewLeadsPage(driver);
	}
	

}
