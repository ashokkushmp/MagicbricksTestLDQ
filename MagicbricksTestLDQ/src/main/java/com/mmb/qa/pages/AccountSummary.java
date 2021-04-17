package com.mmb.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmb.qa.base.TestBase;

public class AccountSummary extends TestBase{
	
	@FindBy(xpath="//p[contains(text(),'Name: Testing')]")
	WebElement userNameLable;	
	
	@FindBy(xpath="//a[contains(text(),'Property Responses')]")
	WebElement propResponsesLink;
	
	@FindBy(xpath="//a[contains(text(),'Company Responses')]")
	WebElement companyResponsesLink;
	
	@FindBy(xpath="//a[contains(text(),'Download Responses Now')]")
	WebElement downloadResponsesLink;
	
	@FindBy(xpath="//a[contains(text(),'Complete Order History')]")
	WebElement completeOrderHistoryLink;
	
	@FindBy(xpath="//a[@class='amDetail']")
	WebElement accountManagerDetailsLink;
	
	@FindBy(xpath="//a[contains(text(),'Manage Subscriptions')]")
	WebElement manageSubscriptionsLink;
	
	@FindBy(xpath="//a[contains(text(),'Manage All Properties')]")
	WebElement manageAllPropertyLink;
	
	@FindBy(xpath="//a[contains(text(),'Edit Login')]")
	WebElement editLoginLink;
	
	@FindBy(xpath="//a[contains(text(),'Edit Company Details')]")
	WebElement editCompanyDetailsLink;
	
	@FindBy(xpath="//a[contains(text(),'Change Password')]")
	WebElement changePasswordLink;
	
	@FindBy(xpath="//a[contains(text(),'Manage Logo')]")
	WebElement manageLogoLink;
	
	@FindBy(xpath="//a[contains(text(),'Manage Alerts')]")
	WebElement manageAlertsLink;
	
	
	//Initializing the page object
			public AccountSummary() {
				
				PageFactory.initElements(driver, this);
			}
			
			public boolean verifyCorrectUserName() {
				return userNameLable.isDisplayed();
			}		
			
			
			public ContactsPage verifyResponsesLink() {
				propResponsesLink.click();
				driver.navigate().back();
				//companyResponsesLink.click();
				//driver.navigate().back();
				downloadResponsesLink.click();
				Set<String> handler = driver.getWindowHandles();
				Iterator<String> it = handler.iterator();
				String perantwindowId = it.next();
				System.out.println("Perant window ID " +perantwindowId);
				
				String childwindowId = it.next();
				System.out.println("Child window ID " +childwindowId);
				
				driver.switchTo().window(childwindowId);
				System.out.println("Chaild window popup title "+driver.getTitle());
				driver.close();
				driver.switchTo().window(perantwindowId);
				
				System.out.println("Perant window popup title "+driver.getTitle());
				return new ContactsPage();
				
			}
			
			public void verifySubscriptionLink() throws InterruptedException {
				completeOrderHistoryLink.click();
				driver.navigate().back();
				accountManagerDetailsLink.click();
				//Alert alert = driver.switchTo().alert();
				//System.out.println(alert.getText());
				//alert.dismiss();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@class='closeSubS']")).click();
				Thread.sleep(3000);
				manageAllPropertyLink.click();
				driver.navigate().back();
				editLoginLink.click();
				driver.navigate().back();
				editCompanyDetailsLink.click();
				driver.navigate().back();
				changePasswordLink.click();
				driver.navigate().back();
				manageLogoLink.click();
				driver.navigate().back();
				manageAlertsLink.click();
				driver.navigate().back();
			}
			
		
			
			

	
	

}
