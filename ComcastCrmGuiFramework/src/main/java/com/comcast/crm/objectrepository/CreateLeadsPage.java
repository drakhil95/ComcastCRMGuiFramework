package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebdriverUtility;

public class CreateLeadsPage {
	WebDriver driver;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTbx;
	
	@FindBy(name = "company")
	private WebElement companyTbx;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(name = "leadsource")
	private WebElement leadSourceDropdown;
	
	@FindBy(name = "industry")
	private WebElement industryDropdown;
	
	@FindBy(id = "phone")
	private WebElement phoneTbx;
	
	public CreateLeadsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPhoneTbx() {
		return phoneTbx;
	}

	public WebElement getLastNameTbx() {
		return lastNameTbx;
	}
	
	public void selectLeadSourceByIndex(int index) {
		WebdriverUtility wu = new WebdriverUtility();
		wu.selectDropdown(leadSourceDropdown, index);
	}
	
	public void selectndustryByIndex(int index) {
		WebdriverUtility wu = new WebdriverUtility();
		wu.selectDropdown(industryDropdown, index);
	}

	public WebElement getCompanyTbx() {
		return companyTbx;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	

}
