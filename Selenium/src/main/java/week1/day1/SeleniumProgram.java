package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram {
	
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
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mathan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
		driver.findElementByClassName("smallSubmit").click();
		driver.close();
	}
}