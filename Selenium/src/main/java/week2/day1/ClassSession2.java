package week2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassSession2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Contact Us").click();
		Set<String> winSet = driver.getWindowHandles();
		/*for(String nContain : winSet)
		{
			driver.switchTo().window(nContain);
		}*/
		List<String> winList = new ArrayList<String>();
		winList.addAll(winSet);
		driver.close();
		driver.switchTo().window(winList.get(1));
		System.out.println(driver.getTitle());
	}
}

//