package com.comcast.crm.vendors;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.CreateVendorsPage;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.VendorsInformationPage;
import com.comcast.crm.objectrepository.VendorsPage;

@Listeners(com.comcast.crm.listenerutility.ListenerImpClass.class)
public class CreateVendorTest extends BaseClass{
	
	@Test
	public void createVendorTest() throws IOException {
		String vendorName = eu.getDataFromExcel("Sheet1", 16, 2);
		
		//navigate to Vendor module
		HomePage hp = new HomePage(driver);
		hp.navigateToVendor(); // Navigating to vendors module
		
		VendorsPage vp = new VendorsPage(driver);
		vp.getCreateVendorBtn().click();
		
		CreateVendorsPage cvp = new CreateVendorsPage(driver);
		cvp.getVendorNameTbx().sendKeys(vendorName);
		cvp.getSaveBtn().click();		
		
		VendorsInformationPage vip = new VendorsInformationPage(driver);
		
		WebElement actVendor = vip.getActVendorName();
		
		Assert.assertTrue(actVendor.getText().equals(vendorName), "Vendor not  verified");
			}
}
