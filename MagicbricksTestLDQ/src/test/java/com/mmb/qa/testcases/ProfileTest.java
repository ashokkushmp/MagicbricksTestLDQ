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

public class ProfileTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	ContactsPage contactsPage;
	AccountSummary accountSummarypage;
	Profile profiletab;
	
	public ProfileTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		 contactsPage= new ContactsPage();
		 loginpage =new LoginPage();
		 homePage= loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
		 profiletab=homePage.profileTabmmb();
	}
	
	@Test(priority=1)
	public void verifyProfileTab() {
		homePage.profileTabmmb();
	}
	@Test(priority=2)
	public void verifyProfileTabpage() {
		profiletab.verifyProfileTabLable();
	}
	
	@Test(priority=3)
	public void verifyProfileTabAllLink() {
		profiletab.profileTabClickAllLinkmmb();
		
	}	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
