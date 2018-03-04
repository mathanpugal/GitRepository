package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DeleteLeads extends ProjectMethods{
	//@Test(dependsOnMethods="testCases.CreateLeadsOOPS.createLead")
	//@Test(groups = "regression",dependsOnGroups="sanity")
	@Test(dataProvider="deleteLead")
	public void deleteLead(int phone) throws InterruptedException
	{
		WebElement lead = locateElement("link", "Leads");
		click(lead);

		WebElement findLead = locateElement("link", "Find Leads");
		click(findLead);

		WebElement phoneTab = locateElement("xpath", "//span[text()='Phone']");
		click(phoneTab);

		WebElement phoneNum = locateElement("name", "phoneNumber");
		type(phoneNum, phone+"");

		WebElement findLeadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadsButton);

		WebElement leadId = locateElement("xpath", "((//div[@class='x-grid3-cell-inner x-grid3-col-formatedPrimaryPhone'])[1])/preceding::td[14]");
		String capturedLeadId = getText(leadId);
		System.out.println(capturedLeadId);

		Thread.sleep(3000);

		//WebElement leadId1 = locateElement("xpath", "((//div[@class='x-grid3-cell-inner x-grid3-col-formatedPrimaryPhone'])[1])/preceding::td[14]");
		WebElement leadId1 = locateElement("link",capturedLeadId);
		click(leadId1);

		WebElement deleteButton = locateElement("link", "Delete");
		click(deleteButton);

		WebElement findLead1 = locateElement("link", "Find Leads");
		click(findLead1);

		WebElement enterLeadId = locateElement("name", "id");
		type(enterLeadId, capturedLeadId);

		WebElement findLeadButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadButton);

		Thread.sleep(3000);

		WebElement errMsg = locateElement("xpath", "//div[@class='x-paging-info']");
		verifyPartialText(errMsg, "No records");

		closeBrowser();
	}

}
