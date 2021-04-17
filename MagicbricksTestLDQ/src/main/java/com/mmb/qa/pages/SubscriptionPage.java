package com.mmb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmb.qa.base.TestBase;

public class SubscriptionPage extends TestBase{
	
	@FindBy(xpath="//a[@class='active'][contains(text(),'Subscribed Services')]")
	WebElement subscribedServiceTabone;
	
	@FindBy(xpath="//a[contains(text(),'Subscribed Services ')]")
	WebElement subscribedServicepage;
	
	@FindBy(xpath="//a[contains(text(),'Order History ')]")
	WebElement orderHistoryPage;
	
	@FindBy(xpath="//li[@class='bdr']//a[contains(text(),'Order History')]")
	WebElement orderHistoryTabtwo;
	
	@FindBy(xpath="//div[@class='mpheading']")
	WebElement subscriptionPageLable;
	
	
		
	//Initializing the page object
		public SubscriptionPage() {				
			PageFactory.initElements(driver, this);
		}
		
		public boolean SubscriptionPageLable() {
			return subscriptionPageLable.isDisplayed();
		}
		
		public void subscriptionTabsAllLink() {
			subscribedServiceTabone.click();
			subscribedServicepage.click();
			orderHistoryTabtwo.click();
			orderHistoryPage.click();
		}

}
