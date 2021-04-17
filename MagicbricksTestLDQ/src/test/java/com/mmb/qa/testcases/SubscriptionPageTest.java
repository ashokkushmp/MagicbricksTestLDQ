package com.mmb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmb.qa.base.TestBase;
import com.mmb.qa.pages.AccountSummary;
import com.mmb.qa.pages.ContactsPage;
import com.mmb.qa.pages.HomePage;
import com.mmb.qa.pages.LoginPage;
import com.mmb.qa.pages.Profile;
import com.mmb.qa.pages.SubscriptionPage;

public class SubscriptionPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	ContactsPage contactsPage;
	AccountSummary accountSummarypage;
	SubscriptionPage subscriptionPage;
	
	public SubscriptionPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		 contactsPage= new ContactsPage();
		 loginpage =new LoginPage();
		 homePage= loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
		 subscriptionPage=homePage.subscriptionTabPagemmb();
	}
	
	@Test(priority=1)
	public void verifysubscriptionPageLable() {
		subscriptionPage.SubscriptionPageLable();
	}
		
	@Test(priority=2)
	public void verifySubscriptionTabAllLink() {
		subscriptionPage.subscriptionTabsAllLink();
		
	}	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}



}
