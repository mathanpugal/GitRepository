package week2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment 
{
	public static void main(String[] args) throws InterruptedException 
	{
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
		
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> winSet = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>();
		winList.addAll(winSet);
		driver.switchTo().window(winList.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByName("id").sendKeys("10977");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@class='x-grid3']/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().window(winList.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		
		Set<String> winSet1 = driver.getWindowHandles();
		List<String> winList1 = new ArrayList<String>();
		winList1.addAll(winSet1);
		driver.switchTo().window(winList1.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByName("id").sendKeys("10978");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@class='x-grid3']/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a").click();
		driver.switchTo().window(winList.get(0));
		driver.findElementByLinkText("Merge").click();;
		driver.switchTo().alert().accept();
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys("10979");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		if(driver.findElementByXPath("//div[text()='No records to display']").isDisplayed())
		{
			System.out.println("No records to display - Message Is Displayed");
		}
		else
		{
			System.out.println("No records to display - Message Is Not Displayed");
		}
		driver.close();
		driver.quit();
	}
}
