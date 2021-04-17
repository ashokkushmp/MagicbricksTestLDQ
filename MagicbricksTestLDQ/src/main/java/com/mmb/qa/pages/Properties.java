package com.mmb.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmb.qa.base.TestBase;

public class Properties extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Manage Properties')]")
	WebElement managePropertyone;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Edit')]")
	WebElement bulkEdittwo;
	
	@FindBy(xpath="//a[contains(text(),'Get Verified for Free')]")
	WebElement getVerifiedForFreeThree;
	
	@FindBy(xpath="//a[contains(text(),'Manage Projects')]")
	WebElement manageProjectsFour;
	
	@FindBy(xpath="//a[contains(text(),'Post New Property')]")
	WebElement postNewPropertyfive;
	
	@FindBy(xpath="//a[contains(text(),'Locality Reviews')]")
	WebElement localityReviewssix;
	
	@FindBy(xpath="//div[@id='mpheading']")
	WebElement propertyTabLable;
	
	
	//Initializing the page object
	public Properties() {				
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyPropertiesTabLable() {
		return propertyTabLable.isDisplayed();
	}
	
	public void propertiesTabClickAllLink() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		managePropertyone.click();
		jse.executeScript("window.scrollBy(0,250)");
		bulkEdittwo.click();
		jse.executeScript("window.scrollBy(0,250)");
		getVerifiedForFreeThree.click();
		jse.executeScript("window.scrollBy(0,250)");
		manageProjectsFour.click();
		postNewPropertyfive.click();
		driver.navigate().back();
		localityReviewssix.click();				
	}
	

}
