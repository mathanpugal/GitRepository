package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class ServiceManagement extends SeMethods{
	@Test
	public void serviceIncident() throws Exception
	{
		startApp("chrome", "https://dev39177.service-now.com/");
		
		WebElement loginFrame = locateElement("xpath", "//iframe[@title='Main Content']");
		switchToFrame(loginFrame);
		
		WebElement uName = locateElement("user_name");
		type(uName, "admin");
		
		WebElement uPassword = locateElement("user_password");
		type(uPassword, "Rp3ccwwKLECC");
		
		WebElement loginButton = locateElement("sysverb_login");
		click(loginButton);
		
		switchToDefaultFrame();
		
		WebElement filter = locateElement("filter");
		type(filter, "incident");
		
		Thread.sleep(3000);
		
		WebElement newIncident = locateElement("xpath","//div[text()='Create New']");
		click(newIncident);
		
		Thread.sleep(5000);
		
		WebElement newIncidentFrame = locateElement("xpath","//iframe[@id='gsft_main']");
		switchToFrame(newIncidentFrame);
		
		Thread.sleep(3000);
		
		WebElement incidentNumber = locateElement("xpath","//input[@id='incident.number']");
		String incNum = getAttributeValue(incidentNumber,"value");
		
		WebElement callerLookup = locateElement("xpath","(//span[@class='icon icon-search'])[1]");
		clickWithoutSnap(callerLookup);
		
		switchToWindow(1);
		
		WebElement searchName = locateElement("xpath","(//a[@class='glide_ref_item_link'])[1]");
		clickWithoutSnap(searchName);
		
		switchToWindow(0);
		
		Thread.sleep(3000);
		
		WebElement newIncidentFrame1 = locateElement("xpath","//iframe[@id='gsft_main']");
		switchToFrame(newIncidentFrame1);
		
		WebElement shortDecsc = locateElement("incident.short_description");
		type(shortDecsc, "This Is Automated Test");
		
		WebElement submitButton = locateElement("xpath","(//button[text()='Submit'])[2]");
		click(submitButton);
		
		Thread.sleep(5000);
		
		//WebElement searchIncident = locateElement("xpath","//iframe[@title='Incidents | ServiceNow']");
		//switchToFrame(searchIncident);
		
		WebElement searchId = locateElement("xpath","(//input[@class='form-control'])[1]");
		typeAndEnter(searchId, incNum);
		
		Thread.sleep(3000);
		
		WebElement incidentNumberCaptured = locateElement("xpath","//a[@class='linked formlink']");
		String capturedInc = getText(incidentNumberCaptured);
		if(incNum.equalsIgnoreCase(capturedInc))
		{
			System.out.println("Incidents Matched");
		}
		else
		{
			System.out.println("Incidents Did Not Match");
		}
		
		
	}
}
