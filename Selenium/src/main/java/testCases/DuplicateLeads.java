package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DuplicateLeads extends ProjectMethods{
	//@Test(enabled= false)
	//@Test(groups = "sanity",dependsOnGroups="smoke")
	@Test(dataProvider="duplicateLead")
	public void duplicateLead(String email) throws InterruptedException{

		WebElement lead = locateElement("link", "Leads");
		click(lead);

		WebElement createLead = locateElement("link", "Find Leads");
		click(createLead);

		WebElement emailTab = locateElement("xpath", "//span[text()='Email']");
		click(emailTab);

		WebElement emailText = locateElement("name", "emailAddress");
		type(emailText, email);

		WebElement findLeadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadsButton);
		Thread.sleep(5000);

		WebElement firstName = locateElement("xpath", "//div[@class='x-grid3']/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[3]/div/a");
		String fName = getText(firstName);
		System.out.println(fName);

		WebElement leadIdLik = locateElement("xpath","//div[@class='x-grid3']/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a");
		click(leadIdLik);

		WebElement dupicateLeads = locateElement("link","Duplicate Lead");
		click(dupicateLeads);
		Thread.sleep(5000);

		//WebElement dupicateLeadsTitle = locateElement("id","sectionHeaderTitle_leads");
		verifyTitle("Duplicate Lead");

		WebElement CreateLeadButton = locateElement("name", "submitButton");
		click(CreateLeadButton);

		WebElement viewLeadFirstName = locateElement("viewLead_firstName_sp");
		String vLeadFirstName= getText(viewLeadFirstName);
		System.out.println(vLeadFirstName);

		if(fName==vLeadFirstName)
		{
			System.out.println("Duplicated lead name "+fName+" is same as captured name "+vLeadFirstName);
		}
		else
		{
			System.out.println("Duplicated lead name "+fName+" is not same as captured name "+vLeadFirstName);
		}
	}
}
