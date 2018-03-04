package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	public RemoteWebDriver driver;
	int i=1;
	
	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
				driver = new ChromeDriver();	
			}else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");		
				driver = new FirefoxDriver();	
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" is launched");
		} catch(NullPointerException e) {
			System.err.println("Browser Not Found");
		}catch(WebDriverException e){
			System.err.println("Web Driver Not Initialized");
		}finally{
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator.toLowerCase()){
			case "id":
				return driver.findElementById(locValue);
			case "name":
				return driver.findElementByName(locValue);
			case "class":
				return driver.findElementByClassName(locValue);
			case "xpath":
				return driver.findElementByXPath(locValue);
			case "link":
				return driver.findElementByLinkText(locValue);
			default: return null;
			}
		}catch(NoSuchElementException e) {
			System.err.println("Element "+locValue+" Not present");
			return null;
		}
	}

	public WebElement locateElement(String locValue) {
			return locateElement("id", locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The text field is entered with data "+data);
		} catch (Exception e) {
			System.err.println("Field "+ele+" is not entered with data" +data);
		}
	}
	
	public void typeAndEnter(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data,Keys.ENTER);
			System.out.println("The text field is entered with data "+data);
		} catch (Exception e) {
			System.err.println("Field "+ele+" is not entered with data" +data);
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element '"+ele+"' is clicked");
		} catch (Exception e) {
			System.err.println("The Element '"+ele+"' is Not clicked");
		}finally {
			takeSnap();
		}
	}

	public void clickWithoutSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element '"+ele+"' is clicked");
		} catch (Exception e) {
			System.err.println("The Element '"+ele+"' is Not clicked");
		}
	}

	public String getText(WebElement ele) {
		try {
			String textString = ele.getText();
			System.out.println("The Element '"+ele+"' returned Text : "+textString);
			return textString;
		}catch(NullPointerException e)
		{
			System.err.println("No text value present for element : "+ele);
			return null;
		}finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select obj=new Select(ele);
			obj.selectByVisibleText(value);
			System.out.println("The dropdown field is selected with data "+value);
		} catch (NullPointerException e) {
			System.err.println("Expected Value '"+value+"' not present for "+ele+" dropdown");
		}finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select indexObj=new Select(ele);
			indexObj.selectByIndex(index);
			System.out.println("The dropdown field is entered with index "+index);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("The dropdown field is not entered with index "+index);
		}finally {
			takeSnap();
		}
	}

	public boolean verifyTitle(String expectedTitle) {
		try {
			String actualTitle= driver.getTitle();
			actualTitle.contains(expectedTitle);
			//if(actualTitle.equalsIgnoreCase(expectedTitle))
			if(actualTitle.contains(expectedTitle))
			{
				System.out.println("Expected title '"+expectedTitle+"' is Present. Actual : "+actualTitle);
				return true;
			}
			else
			{
				System.out.println("Expected title '"+expectedTitle+"' is Not Present. Actual : "+actualTitle);
				return false;
			}
		} catch (NullPointerException e) {
			System.err.println("Null Value Returned For Title "+expectedTitle);
			return false;
		}finally {
			takeSnap();
		}
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if(ele.getText().trim().equalsIgnoreCase(expectedText))
			{
				System.out.println("Verification Passed. Expected Text '"+expectedText+"' is Displayed");
			}
			{
				System.out.println("Verification Passed. Expected Text is Not Displayed. Displayed Text : "+ele.getText());
			}
		} catch (NullPointerException e) {
			System.err.println("Null Value Returned For Element '"+ele+"' Text : "+expectedText);
		}finally {
			takeSnap();
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			if(ele.getText().contains(expectedText)){
				System.out.println("Verification Passed. Expected Text '"+expectedText+"' is Displayed");
			}
			else
			{
				System.out.println("Verification Passed. Expected Text is Not Displayed. Displayed Text : "+ele.getText());
			}
		} catch (NullPointerException e) {
			System.err.println("Null Value Returned For Element '"+ele+"' Text : "+expectedText);
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			String attVal = ele.getAttribute(attribute);
			if(attVal.equalsIgnoreCase(value))
			{
				System.out.println("Element present with given attrubute : '"+attribute+"' Value : "+value);
			}
			else
			{
				System.out.println("Element not present with given attrubute : '"+attribute+"' Value : "+value);
			}
		} catch (NullPointerException e) {
			System.err.println("Element Not Present for Attribute: '"+attribute+"' Value :"+value);
		}finally {
			takeSnap();
		}
	}
	
	public String getAttributeValue(WebElement ele, String attribute) {
		try {
			String attVal = ele.getAttribute(attribute);
			System.out.println(attVal);
			return attVal;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			String attVal = ele.getAttribute(attribute);
			if(attVal.contains(value))
			{
				System.out.println("Element present with given attrubute : '"+attribute+"' Value : "+value);
			}
			else
			{
				System.out.println("Element not present with given attrubute : '"+attribute+"' Value : "+value);
			}
		} catch (NullPointerException e) {
			System.err.println("Element Not Present for Attribute: '"+attribute+"' Value :"+value);
			e.printStackTrace();
		}finally {
			takeSnap();
		}
	}

	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected())
			{
				System.out.println("Expected Object '"+ele.getText()+"' Is Displayed");
			}
			else
			{
				System.out.println("Expected Object '"+ele.getText()+"' Is Not Displayed");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			takeSnap();
		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed())
			{
				System.out.println("Expected Object '"+ele.getText()+"' Is Displayed");
			}
			else
			{
				System.out.println("Expected Object '"+ele.getText()+"' Is Not Displayed");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			takeSnap();
		}
	}

	public void switchToWindow(int index) {
		try {
			Set<String> winSet = driver.getWindowHandles();
			List<String> winList = new ArrayList<String>();
			winList.addAll(winSet);
			driver.switchTo().window(winList.get(index));
			System.out.println("Switched To window : "+driver.getTitle());
		} catch (NoSuchWindowException e) {
			System.err.println("Window Not Present");
		}catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			System.out.println("Switched To Frame");
		} catch (NoSuchFrameException e) {
			System.err.println(e.getMessage());
		}finally {
			takeSnap();
		}
	}
	
	public void switchToDefaultFrame() {
		driver.switchTo().defaultContent();
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.err.println(e.getMessage());
		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			System.err.println(e.getMessage());
		}
	}

	public String getAlertText() {
		try {
			String alertString = driver.switchTo().alert().getText();
			return alertString;
		} catch (NoAlertPresentException e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	public void takeSnap() {
		try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File destPath = new File("./snaps/snap"+i+".jpeg");
			FileUtils.copyFile(src, destPath);
		} catch (IOException e) {
			System.err.println("Path Not Valid");
		}finally {
			i++;
		}
	}
	
	public void rightClickIncidentSelectContextIem(WebElement ele)
	{
		Actions builder = new Actions(driver);
		WebElement targetEle = locateElement("xpath","//div[text()='Assign to me']");
		builder.contextClick(ele).perform();
		targetEle.click();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void closeAllBrowsers() {
		driver.quit();
	}
}