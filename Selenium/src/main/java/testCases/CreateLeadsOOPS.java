package testCases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class CreateLeadsOOPS extends ProjectMethods{
	//@Test(invocationCount = 2)
	//@Test(groups = "smoke", dataProvider="createLeadData")
	@Test(dataProvider="createLead")
	public void createLead(String fName,String lName, String compan) throws InterruptedException, IOException{
		
		WebElement lead = locateElement("link", "Leads");
		click(lead);

		WebElement createLead = locateElement("link", "Create Lead");
		click(createLead);

		WebElement companyName = locateElement("createLeadForm_companyName");
		type(companyName, compan);

		WebElement parentAccount = locateElement("createLeadForm_parentPartyId");
		type(parentAccount, "10102");

		WebElement firstName = locateElement("createLeadForm_firstName");
		type(firstName, fName);

		WebElement lastName = locateElement("createLeadForm_lastName");
		type(lastName, lName);

		WebElement source = locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(source,"Other");

		WebElement marketingCamp = locateElement("createLeadForm_marketingCampaignId");
		selectDropDownUsingText(marketingCamp,"Automobile");

		WebElement firstNameLocal = locateElement("createLeadForm_firstNameLocal");
		type(firstNameLocal, "Math");

		WebElement lastNameLocal = locateElement("createLeadForm_lastNameLocal");
		type(lastNameLocal, "Pug");

		WebElement salutation = locateElement("createLeadForm_personalTitle");
		type(salutation, "MyAccount");

		WebElement birthDate = locateElement("createLeadForm_birthDate");
		type(birthDate, "01/01/1990");

		WebElement profileTitle = locateElement("createLeadForm_generalProfTitle");
		type(profileTitle, "MyAccountTitle");

		WebElement department = locateElement("createLeadForm_departmentName");
		type(department, "IT");

		WebElement annualRevenue = locateElement("createLeadForm_annualRevenue");
		type(annualRevenue, "1234567");

		WebElement currency = locateElement("createLeadForm_currencyUomId");
		selectDropDownUsingText(currency,"USD - American Dollar");

		WebElement industry = locateElement("createLeadForm_industryEnumId");
		selectDropDownUsingText(industry,"Computer Software");

		WebElement noOfemployees = locateElement("createLeadForm_numberEmployees");
		type(noOfemployees, "100");

		WebElement ownership = locateElement("createLeadForm_ownershipEnumId");
		selectDropDownUsingText(ownership,"Sole Proprietorship");

		WebElement sicCode = locateElement("createLeadForm_sicCode");
		type(sicCode, "111");

		WebElement ticketSymbol = locateElement("createLeadForm_tickerSymbol");
		type(ticketSymbol, "symbol");

		WebElement description = locateElement("createLeadForm_description");
		type(description, "My Description");

		WebElement note = locateElement("createLeadForm_importantNote");
		type(note, "My Note");

		WebElement countryCode = locateElement("createLeadForm_primaryPhoneCountryCode");
		type(countryCode, "1");

		WebElement areaCode = locateElement("createLeadForm_primaryPhoneAreaCode");
		type(areaCode, "11");

		WebElement phoneNumber = locateElement("createLeadForm_primaryPhoneNumber");
		type(phoneNumber, "1111111111");

		WebElement phoneExtension = locateElement("createLeadForm_primaryPhoneExtension");
		type(phoneExtension, "044");

		WebElement phoneName = locateElement("createLeadForm_primaryPhoneAskForName");
		type(phoneName, "Mathan");

		WebElement primaryEmail = locateElement("createLeadForm_primaryEmail");
		type(primaryEmail, "xyz@gmail.com");

		WebElement primaryWebUrl = locateElement("createLeadForm_primaryWebUrl");
		type(primaryWebUrl, "www.xyz.com");

		WebElement toName = locateElement("createLeadForm_generalToName");
		type(toName, "Mathan");

		WebElement generalAttnName = locateElement("createLeadForm_generalAttnName");
		type(generalAttnName, "Mathan");

		WebElement generalAddress1 = locateElement("createLeadForm_generalAddress1");
		type(generalAddress1, "Door Number");

		WebElement generalAddress2 = locateElement("createLeadForm_generalAddress2");
		type(generalAddress2, "Street Name");

		WebElement generalCity = locateElement("createLeadForm_generalCity");
		type(generalCity, "Chennai");

		WebElement countryName = locateElement("createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(countryName,"India");

		WebElement stateName = locateElement("createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(stateName,"TAMILNADU");

		WebElement postalCode = locateElement("createLeadForm_generalPostalCode");
		type(postalCode, "600001");

		WebElement postalCodeExt = locateElement("createLeadForm_generalPostalCodeExt");
		type(postalCodeExt, "001");

		WebElement create = locateElement("class", "smallSubmit");
		click(create);

		Thread.sleep(10000);

		WebElement verifyText = locateElement("sectionHeaderTitle_leads");
		verifyExactText(verifyText,"View Lead");

	}
}