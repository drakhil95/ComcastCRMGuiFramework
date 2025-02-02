package com.comcast.crm.vendors;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.CreateVendorsPage;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.VendorsInformationPage;
import com.comcast.crm.objectrepository.VendorsPage;

public class VendorTestSuite extends BaseClass{

	
	@Test(dependsOnGroups = "Smoke")
	public void createProductWIthVendor() throws IOException {
		String vendorName = eu.getDataFromExcel("Sheet1", 16, 2);
		//String productName = eu.getDataFromExcel("Sheet1", 16, 3);

		//navigate to organization module
		HomePage hp = new HomePage(driver);
		hp.navigateToVendor(); // Navigating to vendors module
		
		VendorsPage vp = new VendorsPage(driver);
		vp.getCreateVendorBtn().click();
		
		CreateVendorsPage cvp = new CreateVendorsPage(driver);
		cvp.getVendorNameTbx().sendKeys(vendorName);
		cvp.getSaveBtn().click();		
		
//************************************Creating vendor********************************************************
		wu.waitForElementPresent(driver, hp.getProductsLink());
		hp.getProductsLink().click();
		
//		ProductsPage pp = new ProductsPage(driver);
//		pp.getCreateProductBtn().click();
//		
//		driver.findElement(By.name("productname")).sendKeys(productName);
//
//		driver.findElement(By.xpath("//img[@title='Select']")).click();
//
//		wu.switchTabOnUrl(driver, "module=Vendors&action");
//		driver.findElement(By.id("search_txt")).sendKeys(vendorName + Keys.ENTER);
//		driver.findElement(By.id("1")).click();
//		wu.switchTabOnUrl(driver, "module=Products&action");
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//
//		WebElement actVendor = driver.findElement(By.id("dtlview_Vendor Name"));
//
//		if (actVendor.getText().equals(vendorName)) {
//			System.out.println("Vendor verified");
//		}
	}
	
	@Test(dependsOnGroups = "Regression")
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
