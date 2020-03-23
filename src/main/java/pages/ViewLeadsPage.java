package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.SeleniumBase;

public class ViewLeadsPage extends SeleniumBase{
	public ViewLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadsPage clickEditButton()
	{
		WebElement ele = driver.findElementByXPath("//a[text()='Edit']");
		click(ele);
		return new EditLeadsPage(driver);
	}
	public DuplicateLeadsPage clickDuplicateButton()
	{
		WebElement ele = driver.findElementByXPath("//a[text()='Duplicate Lead']");
		click(ele);
		return new DuplicateLeadsPage(driver);
	}
	
	public ViewLeadsPage verifyPageTitle() {
		String viewLeadsTitle = driver.getTitle();
		if(viewLeadsTitle.equals("View Lead | opentaps CRM"))
				{
				System.out.println("View Lead page title verified successfully");
				}
		return this;
	}

}
