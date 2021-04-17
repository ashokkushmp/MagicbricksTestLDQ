package com.mmb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmb.qa.base.TestBase;
import com.mmb.qa.pages.ContactsPage;
import com.mmb.qa.pages.HomePage;
import com.mmb.qa.pages.LoginPage;
import com.mmb.qa.pages.Properties;

public class PropertiesPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	ContactsPage contactsPage;
	Properties propertypage;
	
	
	public PropertiesPageTest() {		
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		 contactsPage= new ContactsPage();
		 loginpage =new LoginPage();
		 homePage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 propertypage=homePage.clickOnPropertiesTabmmb();
	}
	
	@Test(priority=1)
	public void verifyThePropertyTabPage() {
		propertypage.verifyPropertiesTabLable();
	}
	
	@Test(priority=2)
	public void verifyAllLinkOnPropertyPage() {
		propertypage.propertiesTabClickAllLink();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
