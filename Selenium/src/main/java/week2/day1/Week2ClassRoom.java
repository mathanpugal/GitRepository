package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Week2ClassRoom {
	
	public static void main(String[] args) {
		String inputString = "TestLeaf";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys(inputString);
		driver.switchTo().alert().accept();
		//String output = driver.findElementByXPath("//p[contains(text(),'TestLeaf')]").getText();
		/*if (output.contains(inputString))
		{
			System.out.println("Entered Text Is displayed");
		}
		else
		{
			System.out.println("Entered Text Is Not displayed");
		}*/
		if(driver.findElementByXPath("//p[contains(text(),"+inputString+")]").isDisplayed())
		{
			System.out.println("Entered Text Is displayed");
		}
		else
		{
			System.out.println("Entered Text Is Not displayed");
		}
		driver.switchTo().defaultContent();
		driver.quit();
		driver.close();
	}

}

