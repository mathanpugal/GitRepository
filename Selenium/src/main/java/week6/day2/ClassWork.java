package week6.day2;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class ClassWork extends SeMethods{
	@Test(enabled = false)
	public void jQuery()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		Point location4 = item4.getLocation();
		int iten4Y  = location4.getY();
		Actions nAction = new Actions(driver);
		nAction.dragAndDropBy(item1, 0, iten4Y).release().perform();
		driver.close();
	}
	@Test
	public void serviceNow() throws Exception
	{
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev39177.service-now.com/");*/
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
		
		WebElement newIncident = locateElement("xpath","//div[text()='Open']");
		click(newIncident);
		
		Thread.sleep(5000);
		
		//WebElement newIncidentFrame = locateElement(xpath","//iframe[@id='gsft_main']");
		WebElement newIncidentFrame = locateElement("gsft_main");
		switchToFrame(newIncidentFrame);
		
		Thread.sleep(5000);
		
		WebElement firstIncidentNumber = locateElement("xpath","(//a[@class='linked formlink'])[1]");
		System.out.println(firstIncidentNumber.getText());
		Actions builder = new Actions(driver);
		builder.contextClick(firstIncidentNumber).perform();
		//WebElement targetEle = locateElement("xpath","//div[text()='Assign to me']");
		rightClickIncidentSelectContextIem(firstIncidentNumber);
		//targetEle.click();
	}
}
