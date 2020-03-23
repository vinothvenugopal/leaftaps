package base;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.CommonActions;

public class SeleniumBase {
	public RemoteWebDriver driver;
	WebDriverWait wait;
	
	//launches new browser, maximizes it and launches the url
	public RemoteWebDriver openBrowser(String browserName, String url)
	{
		try {
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} 
			else if(browserName.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/internetexplorerdriver.exe");
				driver = new InternetExplorerDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
		} catch (Exception e) {
			System.out.println("Could not launch browser");
		}
		return driver;
	}
	public void close()
	{
		driver.close();
	}
	public void switchToWindow(int windowIndex)
	{
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			List<String> allWindowHandlesList = new ArrayList<String>(allWindowHandles);
			driver.switchTo().window(allWindowHandlesList.get(windowIndex));
			System.out.println("Switched to child Window");
		} catch (NoSuchWindowException e) {
			System.out.println("Window not available to switch");
		}
	}
	public void click(WebElement ele)
	{
		try {
		//	wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			System.out.println("Element clicked successfully");
		} catch (NoSuchElementException e) {
			System.out.println("Element not available to be clicked");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void enterValue(WebElement ele,String value)
	{
		try {
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.sendKeys(value);
		} catch (NoSuchElementException e) {
			System.out.println("Element not present to enter the value "+value);
		}
	}
	public void clearText(WebElement ele)
	{
		try {
			ele.clear();
			System.out.println("Values in the field "+ele.getText()+" is cleared");
		} catch (ElementNotInteractableException e) {
			System.out.println("Element "+ele.getText()+" is not available for clearing");
		}
		catch(Exception e)
		{
			System.out.println("Unknown Exception");
		}
	}
	public void appendValue(WebElement ele, String value)
	{
		ele.sendKeys(value);
	}
	public void selectDropDownByVisibleText(WebElement ele, String value)
	{
		new Select(ele)
		.selectByVisibleText(value);
	}
	public void selectDropDownByIndex(WebElement ele, int index)
	{
		new Select(ele)
		.selectByIndex(index);
	}
	public void selectDropDownByValue(WebElement ele, String value)
	{
		new Select(ele)
		.selectByValue(value);
	}
	public String getTextBoxText(WebElement ele)
	{
		String textBoxText = ele.getAttribute("value");
		return textBoxText;
	}
	public String getDropDownText(WebElement ele)
	{
		String dropDownText = new Select(ele)
				.getFirstSelectedOption().getText();
		return dropDownText;
	}
	public String clickLinkFromGrid(List<WebElement> ele, int index) throws InterruptedException
	{
		Thread.sleep(5000);
		String leadName = ele.get(index).getText();
		ele.get(index).click();
		return leadName;
	}
	public String verifyPageTitle(String title)
	{
		if(driver.getTitle().equals(title))
		{
			System.out.println("View Leads Page Title Verified successfully");
		}
		else
		{
			System.out.println("Could not verify View Leads Page title");
		}
		return driver.getTitle();
	}
	public void handleAlert(boolean yesNo)
	{
		Alert alert = driver.switchTo().alert();
		if (yesNo==true)
		{
			alert.accept();

		}
		else
		{
			alert.dismiss();
		}
	}

}
