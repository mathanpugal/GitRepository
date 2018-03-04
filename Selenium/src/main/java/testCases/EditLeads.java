package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class EditLeads extends ProjectMethods{
	/*String firstNameVariable = "Abcd";
	String companynameVariable = "XXX";*/
	//@Test(dependsOnMethods="testCases.CreateLeadsOOPS.createLead")
	//@Test(groups = "smoke")
	@Test(dataProvider="editLead")
	public void editLeads(String firstNameVariable,String companynameVariable) throws InterruptedException
	{

		WebElement lead = locateElement("link", "Leads");
		click(lead);

		WebElement createLead = locateElement("link", "Find Leads");
		click(createLead);

		WebElement firstNameEle = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(firstNameEle, firstNameVariable);

		WebElement findLeadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadsButton);
		Thread.sleep(5000);

		WebElement firstNameClick = locateElement("link", firstNameVariable);
		click(firstNameClick);

		verifyTitle("View Lead");

		WebElement editButton = locateElement("link", "Edit");
		click(editButton);

		WebElement companyName = locateElement("updateLeadForm_companyName");
		type(companyName, companynameVariable);

		WebElement updateButton = locateElement("name","submitButton");
		click(updateButton);

		WebElement nameChange = locateElement("viewLead_companyName_sp");
		verifyPartialText(nameChange,companynameVariable);
	}	
}