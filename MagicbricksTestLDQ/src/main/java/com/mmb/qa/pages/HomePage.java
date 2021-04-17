package com.mmb.qa.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmb.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//p[contains(text(),'Name: Testing')]")
	WebElement userNameLable;
	
	@FindBy(xpath="//b[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//b[contains(text(),'Properties')]")
	WebElement propertiesTab;
	
	@FindBy(xpath="//b[contains(text(),'Property Alerts')]")
	WebElement propertyAlertLink;
	
	@FindBy(xpath="//b[contains(text(),'Profile')]")
	WebElement profileTab;
	
	@FindBy(xpath="//b[contains(text(),'Account Summary')]")
	WebElement accountSummaryTab;
	
	@FindBy(xpath="//b[contains(text(),'Subscription')]")
	WebElement subscriptionTabmmb;
	
	@FindBy(xpath="//b[contains(text(),'PG Dashboard')]")
	WebElement pgDashboardTabmmb;
	
	@FindBy(xpath="//a[@class='font-type-4 fo_13px']")
	WebElement homepagePPcta;
	
	@FindBy(xpath="//input[@id='propertyForP']")
	WebElement selectPGpostPage;
	
	
	//Initializing the page object
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle() {
			return driver.getTitle();
			
		}
		
		public boolean verifyCorrectUserName() {
			return userNameLable.isDisplayed();
		}
		
		public ContactsPage clickOnContactLink() {
			contactsLink.click();
			return new ContactsPage();
		}
		
		public Properties clickOnPropertiesTabmmb() {
			propertiesTab.click();
			return new Properties();
		}
		
		public AccountSummary verifyAccountSummeryLink() {
			accountSummaryTab.click();
			return new AccountSummary();
		}
		
		
		public Profile profileTabmmb() {
			profileTab.click();
			return new Profile();
		}
		
		public SubscriptionPage subscriptionTabPagemmb() {
			subscriptionTabmmb.click();
			return new SubscriptionPage();
		}
		
		
		
		public PropertyAlert clickOnPropertyAlertLink() {
			System.out.println("testing for linkkkkkkkkkkkkkkkkkkk");
			try {
				Thread.sleep(5000);
				propertyAlertLink.click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return new PropertyAlert();
		}
		
		public PGDashboardPage clickOnThePGDashboardTab() {
			pgDashboardTabmmb.click();
			return  new PGDashboardPage();
		}
		
		public PostPGPage clickOnPPpagectaonHomepage() {
			homepagePPcta.click();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());			
			driver.switchTo().window(tabs.get(0));
			driver.close();
			driver.switchTo().window(tabs.get(1));
			try {
				Thread.sleep(5000);
				selectPGpostPage.click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new PostPGPage();
			
		}
		
		
	
	

}
