package com.comcast.crm.leadtest;

import java.io.IOException;

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
public class CreateLead extends BaseClass{
	
	@Test
	public void createLeadTest() throws IOException {
		ExtentTest test = UtilityClassObject.getTest();
		String lastName = eu.getDataFromExcel("Sheet1", 10, 2);
		String orgName = eu.getDataFromExcel("Sheet1", 1, 2) + ju.getRandomNumber();

		//navigate to Leads module
		test.log(Status.INFO, "Logged into the homepage successfully");
		HomePage hp = new HomePage(driver);
		
		hp.getLeadsLink().click();
		test.log(Status.INFO, "Navigated to Leads page successfully");
		
		
		LeadsPage lp = new LeadsPage(driver);
		lp.getCreateLeadBtn().click();
		
		//Create the lead
		CreateLeadsPage clp = new CreateLeadsPage(driver);
		clp.getLastNameTbx().sendKeys(lastName);
		clp.getCompanyTbx().sendKeys(orgName);
		clp.getSaveBtn().click();
		
		test.log(Status.PASS, "Leads created successfully");
		LeadsInformationPage lip = new LeadsInformationPage(driver);
		WebElement actLastName = lip.getActLastNameTbx();
		WebElement actOrg = lip.getActOrgName();
		WebElement header = lip.getHeader();
		
		
		Assert.assertTrue(actLastName.getText().equals(lastName), lastName + " : Last name not verified");
		test.log(Status.PASS, "Last name verified");
		Assert.assertTrue(actOrg.getText().equals(orgName), orgName + " : Organization name not verified");
		test.log(Status.PASS, "Organization name verified");
		Assert.assertTrue(header.getText().contains(lastName), header + " : header message not verified");
		test.log(Status.PASS, "Header message verified");
	}
}
