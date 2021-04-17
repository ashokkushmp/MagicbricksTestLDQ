package com.mmb.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmb.qa.base.TestBase;

public class Profile extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Profile Details')]")
	WebElement profileDetialsone;
	
	@FindBy(xpath="//a[contains(text(),'Edit Company Details')]")
	WebElement editCompanyDetailstwo;
	
	@FindBy(xpath="//a[contains(text(),'Edit Office Details')]")
	WebElement editOfficeDetailsthree;
	
	@FindBy(xpath="//a[contains(text(),'Manage RERA Details')]")
	WebElement manageRERAdetailsfour;
	
	@FindBy(xpath="//a[contains(text(),'Edit Login Details')]")
	WebElement editLoginDetailsfive;
	
	@FindBy(xpath="//li[@class='bdr']//a[contains(text(),'Change Password')]")
	WebElement changePasswordsix;
	
	@FindBy(xpath="//a[contains(text(),'Manage Profile Photos')]")
	WebElement manageProfilePhotoseven;
	
	@FindBy(xpath="//a[contains(text(),'Saved Messages')]")
	WebElement savedMessagesEight;
	
	@FindBy(xpath="//div[@class='mpheading']")
	WebElement profilePageLable;
	
	
	
	//Initializing the page object
	public Profile() {				
		PageFactory.initElements(driver, this);
	}
	public boolean verifyProfileTabLable() {
		return profilePageLable.isDisplayed();		
	}
	
	public void profileTabClickAllLinkmmb() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		profileDetialsone.click();
		jse.executeScript("window.scrollBy(0,250)");
		editCompanyDetailstwo.click();
		jse.executeScript("window.scrollBy(0,250)");
		editOfficeDetailsthree.click();
		jse.executeScript("window.scrollBy(0,250)");
		manageRERAdetailsfour.click();		
		editLoginDetailsfive.click();
		changePasswordsix.click();
		manageProfilePhotoseven.click();
		savedMessagesEight.click();
					
	}
	
	
	

}
