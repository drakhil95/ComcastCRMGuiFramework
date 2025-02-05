package com.comcast.crm.orgtest;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepository.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.OrganizationInformationPage;
import com.comcast.crm.objectrepository.OrganizationPage;



@Listeners(com.comcast.crm.listenerutility.ListenerImpClass.class)
public class OrgTestSuite extends BaseClass{

	// Create an organization and verify the header message and the organization name
	@Test(groups = "Smoke")
	public void createOrgTest() throws Exception {
		int randomInt = ju.getRandomNumber();// To get the random integer
		//Get Test Script data from the Excel
		String cellValue = eu.getDataFromExcel("sheet1", 1, 2);
		String orgName = cellValue + randomInt; // Concatenating the Org name with random no.

		ExtentTest test = UtilityClassObject.getTest();


		//navigate to organization module
		test.log(Status.INFO, "Navingating to Organization Module");
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsLink().click();

		//Click on create organization button
		test.log(Status.INFO, "Clicking on the Create organizaton button");
		OrganizationPage orgPage = new OrganizationPage(driver);
		orgPage.getCreateOrgBtn().click();

		try {
			//Enter all details and create a new ORganization
			test.log(Status.INFO, "ENtering all the details and clicking on Save button");
			CreateNewOrganizationPage createOrgPage = new CreateNewOrganizationPage(driver);
			createOrgPage.getOrganizationNameTbx().sendKeys(orgName);
			createOrgPage.getSaveBtn().click();

			//Verify the header message and expected result
			OrganizationInformationPage orgInfoPage = new OrganizationInformationPage(driver);
			String header = orgInfoPage.getHeader().getText();

			Assert.assertTrue(header.contains(orgName), orgName + " not created=====> FAILED"); // comparing the organization in header
			test.log(Status.PASS, "Organization name verified in header");

			WebElement orgNameRes = orgInfoPage.getActOrgName();
			Assert.assertTrue(orgNameRes.getText().equals(orgName), orgName + " is not verified===>Failed"); // comparing the Org name in the field
			test.log(Status.PASS, "Organization name verified");
		} catch (Exception e) {
			System.out.println("Organisation name already present in the database");
			test.log(Status.FAIL, "Organization naem already present in the DataBase");
		}
	}

	@Test(groups = "Regression")
	public void OrgWithIndustryAndTypeTest() throws Exception {
		int randomInt = ju.getRandomNumber();// To get the random integer

		//Get Test Script data from the Excel
		String orgName = eu.getDataFromExcel("sheet1", 4, 2) + randomInt; // Concatenating the org name with random no.
		String industry = eu.getDataFromExcel("sheet1", 4, 3);
		String type = eu.getDataFromExcel("sheet1", 4, 4);	

		//navigate to organization module
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsLink().click();

		//Click on create organization button
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateOrgBtn().click();

		try {
			//Enter all details and create a new Organization
			CreateNewOrganizationPage createOrgPage = new CreateNewOrganizationPage(driver);
			createOrgPage.getOrganizationNameTbx().sendKeys(orgName);
			createOrgPage.industryDropdown(industry); // Selecting the industry
			createOrgPage.typeDropdown(type); // Selecting the type
			createOrgPage.getSaveBtn().click();

			//Verify the industry and type
			OrganizationInformationPage orgInfoPage = new OrganizationInformationPage(driver);

			WebElement actIndustry = orgInfoPage.getActIndustryName();
			Assert.assertTrue(actIndustry.getText().equals(industry), industry + " type not set. ===> Failed");  // Verifying Industry

			WebElement actType = orgInfoPage.getActType();
			Assert.assertTrue(actType.getText().equals(type), type + " type set. ===> Failed");
		} catch (Exception e) {
			System.out.println("Organisation name already present in the database");
		}
	}

	@Test(groups = "Regression")
	public void orgWithPhoneTest() throws IOException {

		int randomInt = ju.getRandomNumber(); // To get the random integer

		//Get Test Script data from the Excel
		String orgName = eu.getDataFromExcel("sheet1", 7, 2) + randomInt; // Concatenating the Org name with random no.
		String phone =eu.getDataFromExcel("sheet1", 7, 3);

		//navigate to organization module
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsLink().click();

		//Click on create organization button
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateOrgBtn().click();

		try {
			//Enter all details and create a new Organization
			CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
			cnop.getOrganizationNameTbx().sendKeys(orgName);
			cnop.getPhoneTbx().sendKeys(phone);
			cnop.getSaveBtn().click();

			//Verify the industry and type
			OrganizationInformationPage oip = new OrganizationInformationPage(driver);
			WebElement actPhone = oip.getActPhone();
			Assert.assertTrue(actPhone.getText().equals(phone), phone + " not verified. ===> Failed");
		} catch (Exception e) {
			System.out.println("Organisation name already present in the database");
		}
	}
	
	@Test(groups = "Regression")
	public void createDeleteOrgTest() throws IOException {
		
		ExtentTest test = UtilityClassObject.getTest();

		int randomInt = ju.getRandomNumber();// To get the random integer
		//Get Test Script data from the Excel
		String cellValue = eu.getDataFromExcel("sheet1", 1, 2);
		String orgName = cellValue + randomInt; // Concatenating the Org name with random no.

		//navigate to organization module
		test.log(Status.INFO, "Navigating to organization module");
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsLink().click();

		//Click on create organization button
		test.log(Status.INFO, "clicking on the 'Create Organization' button");
		OrganizationPage orgPage = new OrganizationPage(driver);
		orgPage.getCreateOrgBtn().click();
		
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.getOrganizationNameTbx().sendKeys(orgName);
		cnop.getSaveBtn().click(); // Organization created
		test.log(Status.PASS, "Organization Created");
		
		OrganizationInformationPage oip = new OrganizationInformationPage(driver);
		oip.getDeleteBtn().click(); // Deleting the created organization
		test.log(Status.PASS, "Organization Deleted");
		wu.switchAndAcceptAlert(driver);
		
		hp.getOrganizationsLink().click();  // verifying the org name if deleted or not
		orgPage.searchDropdown("Organization Name");
		orgPage.getOrgSearchFieldTbx().sendKeys(orgName+ Keys.ENTER);
		
		
		Assert.assertTrue(orgPage.getOrgNotFoundMsg().isDisplayed());
		test.log(Status.PASS, orgName+ " is deleted=======> Passed");
	}

}
