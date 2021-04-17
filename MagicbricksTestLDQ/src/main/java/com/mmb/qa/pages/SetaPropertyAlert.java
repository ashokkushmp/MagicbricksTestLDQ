package com.mmb.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmb.qa.base.TestBase;

public class SetaPropertyAlert extends TestBase{
	
	int i;
	
	@FindBy(xpath="//input[@id='listTypeB']']")
	WebElement buyRadioButtonforPropType;
	
	@FindBy(xpath="//input[@id='listTypeR']")
	WebElement rentRadioButtonforPropType;
	
	@FindBy(xpath="//input[contains(@value,'Select Property Type')][contains(@id,'textPropertySell')]")
	WebElement clickOnPropertyTypeTab;
	
	@FindBy(xpath="//div[@id='divPro']")
	WebElement listofPropertyTypeTab;
	
		
	//Initializing the page object
			public SetaPropertyAlert() {
				
				PageFactory.initElements(driver, this);
			}
			
			public void fillSetAlertForm() {
/// click on the Radio button for select user type				
				rentRadioButtonforPropType.click();	
				//WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Select Property Type')][contains(@id,'textPropertySell')]"));
				//((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
				//element.click();
				
/// click on the Property Type 				
				JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("document.getElementById('textPropertySell').click()");
				
				js.executeScript("document.getElementById('propertyTypeSell_10001')");
				
//// select all the list of the dropdown of property type and select proeprty type				
				List<WebElement> list = driver.findElements(By.xpath("//div[@id='divPro']"));
				System.out.println("abdddddddddddddddd " + list);
				System.out.println("abckdkkkkkkkkkk " +list.size());
				for(i=0;i < list.size();i++) {
				System.out.println("abkkkkkkklllllllllll " + list.get(i).getText());
				if(list.get(i).getText().contains("Multistorey Apartment")) {
				list.get(i).click();
						break;					
                  }
                }
//// Select Budget for property type
				js.executeScript("document.getElementById('budgetBuyDDList').click()");
				//driver.findElement(By.xpath("//input[@id='budgetBuyDDList']")).click();
				List<WebElement> list1 = driver.findElements(By.xpath("//div[@id='budgetBuyDiv']//div[@class='dropDownlist']"));
				System.out.println("abdddddddddddddddd " + list1);
				System.out.println("abckdkkkkkkkkkk " +list1.size());
				for(i=0;i < list1.size();i++) {
				System.out.println("abkkkkkkklllllllllll " + list1.get(i).getText());
				if(list1.get(i).getText().contains("50 - 60 Lac")) {
				list1.get(i).click();
						break;					
                  }
				
			}
/// Select Bedroom			
				js.executeScript("document.getElementById('textBedRoom').click()");
				//driver.findElement(By.xpath("//input[@id='budgetBuyDDList']")).click();
				List<WebElement> list2 = driver.findElements(By.xpath("//div[@id='budgetBuyDiv']//div[@class='dropDownlist']"));
				System.out.println("abdddddddddddddddd " + list2);
				System.out.println("abckdkkkkkkkkkk " +list2.size());
				for(i=0;i < list2.size();i++) {
				System.out.println("abkkkkkkklllllllllll " + list2.get(i).getText());
				if(list2.get(i).getText().contains("2")) {
				list2.get(i).click();
						break;					
                  }
				
			}
/// Select floor preferance 		
				js.executeScript("document.getElementById('floorPref').click()");
				//driver.findElement(By.xpath("//input[@id='budgetBuyDDList']")).click();
				List<WebElement> list3 = driver.findElements(By.xpath("//div[@id='floorPreferences']//ul"));
				System.out.println("abdddddddddddddddd " + list3);
				System.out.println("abckdkkkkkkkkkk " +list3.size());
				for(i=0;i < list3.size();i++) {
				System.out.println("abkkkkkkklllllllllll " + list3.get(i).getText());
				if(list3.get(i).getText().contains("Below 10th Floor")) {
				list3.get(i).click();
						break;					
                  }
				
			}
/// Select Area unit 		
				js.executeScript("document.getElementById('covAreaUnit').click()");
				//driver.findElement(By.xpath("//input[@id='budgetBuyDDList']")).click();
				List<WebElement> list4 = driver.findElements(By.xpath("//div[@id='floorPreferences']//ul"));
				System.out.println("abdddddddddddddddd " + list4);
				System.out.println("abckdkkkkkkkkkk " + list4.size());
				for(i=0;i < list4.size();i++) {
				System.out.println("abkkkkkkklllllllllll " + list4.get(i).getText());
				if(list4.get(i).getText().contains("Below 10th Floor")) {
				list4.get(i).click();
						break;					
                  }				
			}	
/// Select Area  		
				js.executeScript("document.getElementById('coveredAreaDDList').click()");
				//driver.findElement(By.xpath("//input[@id='budgetBuyDDList']")).click();
				
				List<WebElement> list5 = driver.findElements(By.xpath("//div[@id='floorPreferences']//ul"));
				System.out.println("abdddddddddddddddd " + list5);
				System.out.println("abckdkkkkkkkkkk " + list5.size());
				for(i=0;i < list5.size();i++) {
				System.out.println("abkkkkkkklllllllllll " + list5.get(i).getText());
				if(list5.get(i).getText().contains("Below 10th Floor")) {
				list5.get(i).click();
						break;					
                  }
				
			}					
			}
}