package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsInformationPage {
	WebDriver driver;
	
	@FindBy(id = "dtlview_Last Name")
	private WebElement actLastNameTbx;
	
	@FindBy(id = "dtlview_Company")
	private WebElement actOrgName;
	
	@FindBy(className = "dvHeaderText")
	private WebElement header;
	
	@FindBy(id = "dtlview_Industry")
	private WebElement actIndustry;
	
	@FindBy(id = "dtlview_Lead Source")
	private WebElement actLeadSource;
	
	public WebElement getActPhone() {
		return actPhone;
	}

	@FindBy(id = "dtlview_Phone")
	private WebElement actPhone;
	
	public LeadsInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getActLastNameTbx() {
		return actLastNameTbx;
	}

	public WebElement getActIndustry() {
		return actIndustry;
	}

	public WebElement getActLeadSource() {
		return actLeadSource;
	}

	public WebElement getActOrgName() {
		return actOrgName;
	}

	public WebElement getHeader() {
		return header;
	}
	
}
