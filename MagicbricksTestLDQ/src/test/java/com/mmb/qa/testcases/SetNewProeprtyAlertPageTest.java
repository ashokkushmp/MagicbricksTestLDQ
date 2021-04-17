package com.mmb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmb.qa.base.TestBase;
import com.mmb.qa.pages.HomePage;
import com.mmb.qa.pages.LoginPage;
import com.mmb.qa.pages.PropertyAlert;
import com.mmb.qa.pages.SetaPropertyAlert;

public class SetNewProeprtyAlertPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	PropertyAlert propertyAlert;
	SetaPropertyAlert setaPropertyAlertPage;
	
	public SetNewProeprtyAlertPageTest() {		
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		 loginpage =new LoginPage();
		 homePage= loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
		 propertyAlert = homePage.clickOnPropertyAlertLink();
		 setaPropertyAlertPage = propertyAlert.verifySetNewAlertLink();	
		 
	}
	@Test(priority=1)
	public void verifySetAlertPropertyfillform() {
		setaPropertyAlertPage.fillSetAlertForm();
	}
	
	/*
	@Test(priority=1)
	public void verifySetAlertProperty() {
		setaPropertyAlertPage.setAlertTheProperty();
	}
	*/
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
