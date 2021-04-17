package com.mmb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmb.qa.base.TestBase;
import com.mmb.qa.pages.HomePage;
import com.mmb.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {		
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		 loginpage =new LoginPage();		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks");
	}
	
	@Test(priority=2)
	public void mmbLogoImageTest() {
		boolean flag = loginpage.validateMMBImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}


//What is log? : capturing info/activities at the time of program execution. 
	// types of logs:
		//1. info
		//2. warn
		//3. debug
		//4. fatal
		
	//how to generate the logs? : use Apache log4j API (log4j jar)
	//How it works? : it reads log 4j configuration from log4j.properties file
	//where to create: create inside resources folder