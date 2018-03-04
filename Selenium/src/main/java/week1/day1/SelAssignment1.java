package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import wdMethods.SeMethods;

public class SelAssignment1{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(5000);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		driver.findElementByXPath("//input[(@name='phoneNumber')]").sendKeys("1");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//div[@class='x-grid3']/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a").click();	
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("XXX");
		driver.findElementByName("submitButton").click();
	}
}
//driver.findElementByXPath("(//a[contains(@href,'/crmsfa/control/viewLead?partyId') and (@class='linktext')])[1]").click();