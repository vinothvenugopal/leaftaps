package common;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import base.SeleniumBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.ReadExcelData;

public class CommonActions extends SeleniumBase {
	public RemoteWebDriver driver;
	public String workBookName;
	public String workSheetName;

	@Parameters({"url"})
	@BeforeMethod
	//@Before
	public RemoteWebDriver initiateBrowser(String url)
	{
		driver = openBrowser("chrome", url);
		return driver;
	}
	
	@AfterMethod
	//@After
	public void browserClose()
	{
		close();
	}
	
	@DataProvider(name = "getData")
		public Object[][] getCreateData() throws IOException
		{
			//String [][] data = ReadExcelData.readData("CreateLeads.xlsx","LeadData");
			//String [][] data = ReadExcelData.readData("EditLeads.xlsx", "Edit");
			//String[][] data = ReadExcelData.readData("MergeLeads.xlsx", "Merge");
			String[][] data = ReadExcelData.readData(workBookName,workSheetName);
			return new Object[][] {{data},};
			//return ;
		}
	
	/*@DataProvider(name = "editLeads")
	public String[][] getEditData() throws IOException{
		String[][] getData = ReadExcelData.readData("EditLead.xlsx","Edit");
		return getData;
	}*/
	

}
