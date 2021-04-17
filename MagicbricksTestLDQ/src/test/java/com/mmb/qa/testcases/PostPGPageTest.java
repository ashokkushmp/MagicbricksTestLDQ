package com.mmb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mmb.qa.base.TestBase;
import com.mmb.qa.pages.HomePage;
import com.mmb.qa.pages.LoginPage;
import com.mmb.qa.pages.PGDashboardPage;
import com.mmb.qa.pages.PostPGPage;
import com.mmb.qa.util.TestUtil;

public class PostPGPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	PGDashboardPage pgdashboardPage;
	PostPGPage PostPGPageflow;
	
	String sheetName ="pgdetails";
	
	public PostPGPageTest() {
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
		 PostPGPageflow = homePage.clickOnPPpagectaonHomepage();
	}
	/*
	@Test(priority=1)
	public void verifyPGpostpageflow() {		
		Assert.assertTrue(PostPGPageflow.checkThePGPostPageFlowLable());
		}
	*/
	@DataProvider
	public Object[][] getMbTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2 , dataProvider ="getMbTestData")
	public void verifyfilleddetailsforPG(String pglocality,String pgaddress,String pgzipcode,String pglandmark,String pgyear,String pgfullname,String singleroomcount,String rentonebadsingle,String securityforsingle,String doubleroomcount,String rentonebaddouble,String securityfordouble,String tripleroomcount,String rentonebadtriple,String securityfortriple,String fourroomcount,String rentonebadfour,String securityforfour,String otherroomcount,String noofextrabadotherroom,String rentonebadother,String securityforother,String descriptiondetailsPg) throws InterruptedException {
		PostPGPageflow.fillPGDetailsinform(pglocality, pgaddress, pgzipcode, pglandmark, pgyear, pgfullname, singleroomcount, rentonebadsingle, securityforsingle, doubleroomcount, rentonebaddouble, securityfordouble, tripleroomcount, rentonebadtriple, securityfortriple, fourroomcount, rentonebadfour, securityforfour, otherroomcount, noofextrabadotherroom, rentonebadother, securityforother, descriptiondetailsPg);
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	


}
