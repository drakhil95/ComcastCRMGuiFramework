package com.comcast.crm.leadtest;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepository.CreateLeadsPage;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.LeadsInformationPage;
import com.comcast.crm.objectrepository.LeadsPage;

public class LeadWithPhone extends BaseClass{
	
	@Test
	public void leadWithPhoneTest() throws IOException {
		ExtentTest test = UtilityClassObject.getTest();
		
		String lastName = eu.getDataFromExcel("Sheet1", 10, 2);
		String orgName = eu.getDataFromExcel("Sheet1", 1, 2) + ju.getRandomNumber();
		String phone = eu.getDataFromExcel("Sheet1", 7, 3);

		//navigate to organization module
		HomePage hp = new HomePage(driver);
		test.log(Status.INFO, "Logged into the homepage successfully");

		hp.getLeadsLink().click();
		test.log(Status.INFO, "Navigated to Leads page successfully");

		
		// Clicking on the create leads button
		LeadsPage lp = new LeadsPage(driver);
		lp.getCreateLeadBtn().click();
		
		// Entering all the mandatory details into the leads text fields including Phone
		CreateLeadsPage clp = new CreateLeadsPage(driver);
		clp.getLastNameTbx().sendKeys(lastName);
		clp.getCompanyTbx().sendKeys(orgName);
		clp.getPhoneTbx().sendKeys(phone);
		clp.getSaveBtn().click();	
		
		LeadsInformationPage lip = new LeadsInformationPage(driver);
		WebElement actPhone = lip.getActPhone();
		
		Assert.assertTrue(actPhone.getText().equals(phone), "Phone number not verified");
	}
}
