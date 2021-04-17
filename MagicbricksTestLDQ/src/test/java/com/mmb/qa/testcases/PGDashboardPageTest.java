package com.mmb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmb.qa.base.TestBase;
import com.mmb.qa.pages.ContactsPage;
import com.mmb.qa.pages.HomePage;
import com.mmb.qa.pages.LoginPage;
import com.mmb.qa.pages.PGDashboardPage;

public class PGDashboardPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	PGDashboardPage pgdashboardPage;
	
	public PGDashboardPageTest() {
		super();
	}
	//test cases should be separated -independent each other.
	//before each  test case - launch the browser and login.
	//@Test - execute the test case
	//after each test case - close the browser 
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage =new LoginPage();
		 homePage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 pgdashboardPage = homePage.clickOnThePGDashboardTab();
	}
	
	@Test(priority=1)
	public void verifyPGDashboardLinkPage() {
		Assert.assertTrue(pgdashboardPage.verifyPGDashboardLable());
		}
	
	@Test(priority=2)
	public void verifyTitleOfThePGpage() {
		String pgPageTitle = pgdashboardPage.verifyPGPageTitle();
		System.out.println("title kkkkkkkkkkk " +pgPageTitle);
		Assert.assertEquals(pgPageTitle, "Paying Guest in Bangalore | Real Estate in Bangalore | MagicBricks");
	}
	@Test(priority=3)
	public void verifyPGDashboardTabLinkclick() {
		pgdashboardPage.verifyCTAonPGpage();
	}
	
	@Test(priority=4)
	public void verifyPostPgPageLable() {
		
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
