package com.mmb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmb.qa.base.TestBase;

public class PGDashboardPage extends TestBase{
	
	@FindBy(xpath="//ul[@class='mb-pg-da__tabul']")
	WebElement pgDashboardLable;
	
	@FindBy(xpath="//li[@class='mb-pg-da__tabli mb-pg-da__tabli__responses']")
	WebElement responseCTA;
	
	@FindBy(xpath="//li[@class='mb-pg-da__tabli mb-pg-da__tabli__requests']")
	WebElement requestCTA;	
	
	
	//Initializing the page object
			public PGDashboardPage() {
				
				PageFactory.initElements(driver, this);
			}
			
			public boolean verifyPGDashboardLable() {
				return pgDashboardLable.isDisplayed();
				
			}
			
			public String verifyPGPageTitle() {
				return driver.getTitle();
				
			}
			
			public PGDashboardPage verifyCTAonPGpage() {
				responseCTA.click();
				requestCTA.click();
				return new PGDashboardPage();
				
			}
			
			public void clickOnPgPostpropertyFlow() {
				
			}

}
