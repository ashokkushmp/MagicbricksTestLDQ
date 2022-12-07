package com.mmb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmb.qa.base.TestBase;
import com.mmb.qa.pages.AccountSummary;
import com.mmb.qa.pages.ContactsPage;
import com.mmb.qa.pages.HomePage;
import com.mmb.qa.pages.LoginPage;

public class AccountSummaryTest extends TestBase{
	// this comment was created in branch 1
	LoginPage loginpage;
	HomePage homePage;
	ContactsPage contactsPage;
	AccountSummary accountSummarypage;
	
	public AccountSummaryTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		 contactsPage= new ContactsPage();
		 loginpage =new LoginPage();
		 homePage= loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
		 accountSummarypage=homePage.verifyAccountSummeryLink();
	}
	
	@Test(priority=1)
	public void verifyAccountSummaryTab() {
		homePage.verifyAccountSummeryLink();
	}
	@Test(priority=2)
	public void verifyAccountSummarypage() {
		homePage.verifyCorrectUserName();
	}
	
	@Test(priority=3)
	public void verifyResponseLableLink() {
		accountSummarypage.verifyResponsesLink();
	}
	
	@Test(priority=4)
	public void verifySubscriptionpartLink() throws InterruptedException {
		accountSummarypage.verifySubscriptionLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
