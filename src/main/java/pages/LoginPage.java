package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

import base.SeleniumBase;
import common.CommonActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends SeleniumBase {
		
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	/*
	 * public LoginPage(CommonActions commonActions) { driver =
	 * commonActions.initiateBrowser("http://leaftaps.com/opentaps/control/main"); }
	 */
	@Given("enter the username as demosalesmanager")
	public LoginPage enterUserName()
	{
		//enterValue(ele, value);
		WebElement ele = driver.findElementById("username");
		enterValue(ele, "demosalesmanager");
		return this;
	}
	@And("enter the password as crmsfa")
	public LoginPage enterPassword()
	{
		WebElement ele = driver.findElementById("password");//.sendKeys("crmsfa");
		enterValue(ele, "crmsfa");
		return this;
	}
	@When("Click the login button")
	public HomePage clickLoginButton()
	{
		WebElement ele = driver.findElementByClassName("decorativeSubmit");//.click();
		click(ele);
		return new HomePage(driver);
	}

}
