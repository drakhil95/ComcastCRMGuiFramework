package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebdriverUtility;

public class CreateProductsPage extends BaseClass{
	WebDriver driver;
	
	@FindBy(name = "productname")
	private WebElement productNameTbx;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement addVendorBtn;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	
	public CreateProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectVendor(String vendorName) {
		addVendorBtn.click();
		WebdriverUtility wu = new WebdriverUtility();
		wu.switchTabOnTitle(driver, "");
		
	}
}
