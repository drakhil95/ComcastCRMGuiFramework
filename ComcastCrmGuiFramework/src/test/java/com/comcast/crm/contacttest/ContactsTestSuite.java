package com.comcast.crm.contacttest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.ContactsInformationPage;
import com.comcast.crm.objectrepository.ContactsPage;
import com.comcast.crm.objectrepository.CreateContactPage;
import com.comcast.crm.objectrepository.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.OrganizationNameLookUpPage;
import com.comcast.crm.objectrepository.OrganizationPage;

public class ContactsTestSuite extends BaseClass{
	
	@Test(groups = "Smoke")
	public void ContactwithOrg() throws Exception {
		
		int randomInt = ju.getRandomNumber();// To get a random integer

		//Get Test Script data from the Excel
		String orgName = eu.getDataFromExcel("sheet1", 1, 2) + randomInt; // Concatenating the org name with random no.
		String lastName = eu.getDataFromExcel("sheet1", 10, 2);
		String firstName = eu.getDataFromExcel("sheet1", 10, 4);

		//navigate to organization module
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsLink().click();

		//Click on create organization button
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateOrgBtn().click();

		//Enter all details and create a new ORganization
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.getOrganizationNameTbx().sendKeys(orgName);
		cnop.getSaveBtn().click();
		//*****************************************************************************************************
		// CREATING THE CONTACT WITH THE ABOVE CREATED ORGANIZATION

		//navigate to Contacts module
		// wu.waitForElementPresent(driver, hp.getContactsLink());
		driver.navigate().refresh();
		hp.getContactsLink().click();

		//Click on create contact button
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateContactBtn().click();

		//Enter all details and create a new COntact
		CreateContactPage ccp = new CreateContactPage(driver);
		ccp.getFirstNameTbx().sendKeys(firstName);
		ccp.getLastNameTbx().sendKeys(lastName);
		ccp.getSelectOrgBtn().click();
		
		wu.switchTabOnUrl(driver, "module=Accounts&action"); // switching to the child window
		OrganizationNameLookUpPage onlp = new OrganizationNameLookUpPage(driver);
		onlp.selectOrganizationNameInDropDown();
		onlp.getOrgSearchTbx().sendKeys(orgName+ Keys.ENTER);
		Thread.sleep(1000);
		onlp.getFirstSearchResult().click();
		
		wu.switchTabOnUrl(driver, "module=Contacts&action");  // switching the control back to the parent window
		ccp.getSaveBtn().click();

		//Verify the Organization name in the contact
		
		ContactsInformationPage cip = new ContactsInformationPage(driver);
		
		Assert.assertTrue(cip.getActOrgName().getText().contains(orgName));
		
	}
	
	
	@Test(groups = "Regression")
	public void contactWithValidationTest() throws Exception {
		//Get Test Script data from the Excel
		String lastName = eu.getDataFromExcel("sheet1", 10, 2);
		String firstName = eu.getDataFromExcel("sheet1", 10, 4);

		//navigate to Contacts module
		HomePage hp = new HomePage(driver);
		hp.getContactsLink().click();

		//Click on create contact button
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateContactBtn().click();

		//Enter all details and create a new Contact with the start and end date
		CreateContactPage ccp = new CreateContactPage(driver);
		
		String startDate = ju.getSystemDateYYYYMMDD();  // Getting the current system date	
		String endDate = ju.getRequiredDate(30);  // Getting the required end date....i.e. date after 30 days from current system date
		
		ccp.getFirstNameTbx().sendKeys(firstName);
		ccp.getLastNameTbx().sendKeys(lastName);
		
		ccp.getSupportStartDateTbx().clear();
		ccp.getSupportStartDateTbx().sendKeys(startDate);
		
		ccp.getSupportEndDatetbx().clear();
		ccp.getSupportEndDatetbx().sendKeys(endDate);
		
		ccp.getSaveBtn().click();
		
		ContactsInformationPage cip = new ContactsInformationPage(driver);
		
		//Verify the support start and end date
		WebElement actStartDate = cip.getActStartDate();
		System.out.println(actStartDate.getText());
		System.out.println(startDate);
		Assert.assertTrue(actStartDate.getText().equals(startDate), startDate + " not verified. ===> Failed");
		
		WebElement actEndDate = cip.getActEndDate();
		System.out.println(actEndDate.getText());
		System.out.println(endDate);
		Assert.assertTrue(actEndDate.getText().equals(endDate), endDate + " not verified. ===> Failed");
	}
	
	@Test(groups = "Regression")
	public void createContactTest() throws Exception {
		//Get Test Script data from the Excel
		String lastName = eu.getDataFromExcel("sheet1", 10, 2);
		String firstName = eu.getDataFromExcel("sheet1", 10, 4);
		
		//navigate to COntacts module
		HomePage hp = new HomePage(driver);
		hp.getContactsLink().click();

		//Click on create contact button
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateContactBtn().click();

		//Enter all details and create a new Contact
		CreateContactPage ccp = new CreateContactPage(driver);
		ccp.getFirstNameTbx().sendKeys(firstName);
		ccp.getLastNameTbx().sendKeys(lastName);
		ccp.getSaveBtn().click();
		

		//Verify the last and first name
		ContactsInformationPage cip = new ContactsInformationPage(driver);
		
		WebElement actLastName = cip.getActLastName();
		Assert.assertTrue(actLastName.getText().equals(lastName), lastName + " not verified. ===> Failed");
		
		WebElement actFirstName = cip.getActFirstName();
		Assert.assertTrue(actFirstName.getText().equals(firstName), firstName + " not verified. ===> Failed");
	}
}
