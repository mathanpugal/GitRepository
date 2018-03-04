package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods{
	@Parameters({"URL","username","password"})
	@BeforeMethod(groups="common")
	public void loginLeafTabs(String url, String username, String password)
	{
		startApp("chrome", url);
		WebElement userName = locateElement("username");
		type(userName, username);

		WebElement passWord = locateElement("password");
		type(passWord, password);

		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);

		WebElement crmLink = locateElement("link", "CRM/SFA");
		click(crmLink);
	}
	@AfterMethod(groups="common")
	public void closeApp()
	{
		closeBrowser();
	}

	@DataProvider(name="createLead")
	public Object[][] createLeadData() throws IOException
	{
		/*Object[][] clData = new Object[1][3];
		clData[0][0]="Mathan";
		clData[0][1]="P";
		clData[0][2]="TestLeaf";*/
		HandleExcel excelhandle = new HandleExcel();
		return excelhandle.excelHandle();
	}
	
	@DataProvider(name="deleteLead")
	public Object[][] deleteLeadData()
	{
		Object[][] dlData = new Object[1][1];
		dlData[0][0]=123456789;
		return dlData;
	}
	
	@DataProvider(name="editLead")
	public Object[][] editLeadData()
	{
		Object[][] elData = new Object[1][2];
		elData[0][0]="Mathan";
		elData[0][1]="XXX";
		return elData;
	}
	
	@DataProvider(name="duplicateLead")
	public Object[][] dupLeadData()
	{
		Object[][] duData = new Object[1][1];
		duData[0][0]="";
		return duData;
	}
	
	@DataProvider(name="mergeLead")
	public Object[][] mergeLeadData()
	{
		Object[][] mergeData = new Object[1][2];
		mergeData[0][0]=12345;
		mergeData[0][0]=12346;
		return mergeData;
	}
	
	
	
}