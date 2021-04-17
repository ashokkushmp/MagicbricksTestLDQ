package com.mmb.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmb.qa.base.TestBase;
import com.mmb.qa.util.TestUtil;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Download Responses')]")
	WebElement contactResponseLable;
	

	@FindBy(xpath="//a[contains(text(),'Switch to Month-wise display')]")
	WebElement switchToMonthLable;
	
	@FindBy(xpath="//a[contains(text(),'Switch to Property-wise display')]")
	WebElement switchToPropertyLable;
	
	@FindBy(xpath="//a[contains(text(),'View Responses')]")
	WebElement viewResponseOne;
	
	@FindBy(xpath="//a[contains(text(),'My Bonus Leads')]")
	WebElement bonusLeadstwo;
	
	@FindBy(xpath="//a[contains(text(),'Turbo Leads')]")
	WebElement turboLeadstwoo;
	
	@FindBy(xpath="//a[contains(@class,'chat__tab')]")
	WebElement chatTabthree;
	
	@FindBy(xpath="//a[contains(text(),'iAdvantage')]")
	WebElement iadvantagefour;
	
	@FindBy(xpath="//a[contains(text(),'Most Active Buyers')]")
	WebElement mostActivebuyersfive;
	
	@FindBy(xpath="//a[contains(text(),'Property Contacts Made')]")
	WebElement propertyContactMadesix;
	
	@FindBy(xpath="//a[contains(text(),'Requirement Contacts Made')]")
	WebElement requirmentContactMadeseven;
	
	@FindBy(xpath="//a[contains(text(),'Company Contacts Made')]")
	WebElement companyContactsMadeEight;
	
	@FindBy(xpath="//a[contains(text(),'Luxury Property Response')]")
	WebElement luxurayPropertyResponsenine;
	
	@FindBy(xpath="//a[contains(text(),'Old Leads')]")
	WebElement oldLeadsTen;
	
	
	//Initializing the page object
			public ContactsPage() {				
				PageFactory.initElements(driver, this);
			}
			
			public boolean verifyContactResponseLable() {
				return contactResponseLable.isDisplayed();
				
			}
			/*
			public void switchContactWise() {
				if(switchToMonthLable.isDisplayed()) {
					switchToMonthLable.click();
				
				}else switchToPropertyLable.isDisplayed();{
					switchToPropertyLable.click(); 
					
				}
				return switchContactWise
				
			}
			*/
		  public void switchContactWiseByName(String name) throws Throwable {
			   JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,490)");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]")).click();
				
			}
			
			public void contactPageTabClick() throws Exception {				
				viewResponseOne.click();
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(2000);
				bonusLeadstwo.click();
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(2000);
				turboLeadstwoo.click();
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(2000);
				chatTabthree.click();
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(2000);
				iadvantagefour.click();
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(2000);
				mostActivebuyersfive.click();
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(2000);
				propertyContactMadesix.click();
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(2000);
				requirmentContactMadeseven.click();
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(2000);
				companyContactsMadeEight.click();
				luxurayPropertyResponsenine.click();
				oldLeadsTen.click();
			}
	
	

}
