package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{
	//@Test(timeOut = 20000)
	//@Test(groups = "sanity",dependsOnGroups="smoke")
	@Test(dataProvider="mergeLead")
	public void mergeLead(int lId1, int lId2) throws InterruptedException
	{

		WebElement lead = locateElement("link", "Leads");
		click(lead);

		Thread.sleep(5000);
		WebElement mergeLead = locateElement("link", "Merge Leads");
		click(mergeLead);
		WebElement lokupImage = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[1]");
		click(lokupImage);
		switchToWindow(1);
		WebElement leadId = locateElement("name","id");
		type(leadId, lId1+"");
		WebElement findLeadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadsButton);
		Thread.sleep(5000);
		WebElement leadIdLik = locateElement("xpath","//div[@class='x-grid3']/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a");
		clickWithoutSnap(leadIdLik);
		//click(leadIdLik);
		Thread.sleep(5000);
		switchToWindow(0);
		WebElement lokupImage2 = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
		click(lokupImage2);
		switchToWindow(1);
		WebElement leadId1 = locateElement("name","id");
		type(leadId1, lId2+"");
		WebElement findLeadsButton1 = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadsButton1);
		Thread.sleep(10000);
		WebElement leadIdLik1 = locateElement("xpath","//div[@class='x-grid3']/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a");
		//click(leadIdLik1);
		clickWithoutSnap(leadIdLik1);
		switchToWindow(0);
		WebElement merge = locateElement("link", "Merge");
		click(merge);
		Thread.sleep(5000);
		acceptAlert();
		Thread.sleep(5000);
		WebElement findLead = locateElement("link", "Find Leads");
		click(findLead);
		WebElement findLeadId = locateElement("name","id");
		type(findLeadId, lId1+"");
		WebElement findLeadsButton2 = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadsButton2);
		WebElement expectedText = locateElement("xpath", "//div[text()='No records to display']");
		verifyDisplayed(expectedText);
	}
}
