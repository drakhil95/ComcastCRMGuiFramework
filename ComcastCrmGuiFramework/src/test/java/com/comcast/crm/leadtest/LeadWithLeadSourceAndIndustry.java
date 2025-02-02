package com.comcast.crm.leadtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepository.CreateLeadsPage;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.LeadsInformationPage;
import com.comcast.crm.objectrepository.LeadsPage;


@Listeners(com.comcast.crm.listenerutility.ListenerImpClass.class)
public class LeadWithLeadSourceAndIndustry extends BaseClass{
	
	
	@Test
	public void LeadWithSourceAndIndustryTest() throws IOException {
		ExtentTest test = UtilityClassObject.getTest();
		String lastName = eu.getDataFromExcel("Sheet1", 10, 2);
		String orgName = eu.getDataFromExcel("Sheet1", 1, 2) + ju.getRandomNumber();

		//navigate to Leads module
		HomePage hp = new HomePage(driver);
		hp.getLeadsLink().click();
		test.log(Status.INFO, "Logged into the homepage successfully");
		
		
		LeadsPage lp = new LeadsPage(driver);
		lp.getCreateLeadBtn().click();
		test.log(Status.INFO, "Navigated to Leads page successfully");
		
		
		CreateLeadsPage clp = new CreateLeadsPage(driver);
		clp.getLastNameTbx().sendKeys(lastName);
		clp.getCompanyTbx().sendKeys(orgName);
		clp.selectLeadSourceByIndex(2); // selecting existing customer
		clp.selectndustryByIndex(2); // selecting banking from the drop down
		clp.getSaveBtn().click();
		test.log(Status.PASS, "Leads created successfully with lead source and industry");
		
		LeadsInformationPage lip = new LeadsInformationPage(driver);		
		
		Assert.assertTrue(lip.getActIndustry().getText().equals("Banking"), "Industry not verified");
		test.log(Status.PASS, "Industry verified");

		Assert.assertTrue(lip.getActLeadSource().getText().equals("Existing Customer"), "lead source not verified");
		test.log(Status.PASS, "Lead source verified");

	}
}
