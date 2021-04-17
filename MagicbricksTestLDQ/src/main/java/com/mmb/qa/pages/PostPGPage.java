package com.mmb.qa.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmb.qa.base.TestBase;

public class PostPGPage extends TestBase{
	
				
	@FindBy(xpath="//div[contains(text(),'Where is your PG Located?')]")
	WebElement pGpagelable;
	
	@FindBy(xpath="//input[@id='selectedLocality']")
	WebElement enterLocalityforPG;
	
	@FindBy(xpath="//div[@id='slide_pg-location']//li[3]")
	WebElement selectLocalityforPGDropdown;
	
	@FindBy(xpath="//input[@id='houseNo']")
	WebElement pgAddress;
	
	@FindBy(xpath="//input[@id='pgzipcode']")
	WebElement pgPinCode;
	
	@FindBy(xpath="//input[@id='pglandmark']")
	WebElement pglandmark;
	
	@FindBy(xpath="//input[@id='operatingSince']")
	WebElement PGoperationalSince;
	
	@FindBy(xpath="//select[@id='pgPresentIn']")
	WebElement PGisPresentIn;
	
	@FindBy(xpath="//a[@class='pg-footer__button']")
	WebElement saveAddressCTA;
	
	@FindBy(xpath="//input[@id='pgName']")
	WebElement nameOfPG;
	
	
	@FindBy(xpath="//div[contains(text(),'Owner')]")
	WebElement propertyAsOwner;
	
	@FindBy(xpath="//div[contains(text(),'Property Manager')]")
	WebElement propertyAsPropertyManager;
	
	@FindBy(xpath="//div[@class='mobile-form__checkbox__label'][contains(text(),'Agent')]")
	WebElement propertyAgent;
	
	@FindBy(xpath="//div[@id='mb-pg-user-popup']//a[@class='upload-pic__dialog__box--close']")
	WebElement crossThePopup;
	
	@FindBy(xpath="//a[@class='upload-pic__action__btn secondary-btn']")
	WebElement cancelCTAonPopup;
	
	@FindBy(xpath="//div[@class='upload-pic__action double text-right']//a[@class='upload-pic__action__btn'][contains(text(),'OK')]")
	WebElement oKCTAonPopup;
/////////////Single room details
	@FindBy(xpath="//div[@class='mobile-form__checkbox-thumb js-checkbox']//div[@class='mobile-form__checkbox-thumb__label'][contains(text(),'Single')]")
	WebElement singleRoomImage;
	
	@FindBy(xpath="//input[@id='noOfRoom_16011']")
	WebElement noOfSingleRoom;
	
	@FindBy(xpath="//input[@id='rentPerBed_16011']")
	WebElement rentPerBadSingleRoom;
	
	@FindBy(xpath="//input[@id='depositPerBed_16011']")
	WebElement depositSingleRoom;
	
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16011']/div[5]/div[1]/div[1]")
	WebElement GeysersSingleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16011']/div[5]/div[1]/div[2]")
	WebElement washroomSingleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16011']/div[5]/div[1]/div[3]")
	WebElement cupboardSingleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16011']/div[5]/div[1]/div[4]")
	WebElement tvSingleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16011']/div[5]/div[1]/div[5]")
	WebElement acSingleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16011']/div[5]/div[1]/div[6]")
	WebElement cotSingleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16011']/div[5]/div[1]/div[7]")
	WebElement mettressSingleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16011']/div[5]/div[1]/div[8]")
	WebElement sideTableSingleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16011']/div[5]/div[1]/div[9]")
	WebElement aircoolerSingleRoom;
	
	
	
	
/////////////Double room details
	@FindBy(xpath="//div[contains(text(),'Double')]")
	WebElement DoubleRoomImage;
	
	@FindBy(xpath="//input[@id='noOfRoom_16014']")
	WebElement noOfDoubleRoom;
	
	@FindBy(xpath="//input[@id='rentPerBed_16014']")
	WebElement rentPerBadDoubleRoom;
	
	@FindBy(xpath="//input[@id='depositPerBed_16014']")
	WebElement depositDoubleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16014']/div[5]/div[1]/div[1]")
	WebElement GeysersDoubleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16014']/div[5]/div[1]/div[2]")
	WebElement washroomDoubleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16014']/div[5]/div[1]/div[3]")
	WebElement cupboardDoubleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16014']/div[5]/div[1]/div[4]")
	WebElement tvDoubleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16014']/div[5]/div[1]/div[5]")
	WebElement acDoubleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16014']/div[5]/div[1]/div[6]")
	WebElement cotDoubleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16014']/div[5]/div[1]/div[7]")
	WebElement mettressDoubleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16014']/div[5]/div[1]/div[8]")
	WebElement sideTableDoubleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16014']/div[5]/div[1]/div[9]")
	WebElement aircoolerDoubleRoom;
	
	
	
	
	
	
	
	
	
/////////////triple room details
	@FindBy(xpath="//div[@class='mobile-form__checkbox-thumb js-checkbox']//div[@class='mobile-form__checkbox-thumb__label'][contains(text(),'Triple')]")
	WebElement tripleRoomImage;
	
	@FindBy(xpath="//input[@id='noOfRoom_16015']")
	WebElement noOfTripleRoom;
	
	@FindBy(xpath="//input[@id='rentPerBed_16015']")
	WebElement rentPerBadTripleRoom;
	
	@FindBy(xpath="//input[@id='depositPerBed_16015']")
	WebElement depositTripleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16015']/div[5]/div[1]/div[1]")
	WebElement GeysersTripleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16015']/div[5]/div[1]/div[2]")
	WebElement washroomTripleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16015']/div[5]/div[1]/div[3]")
	WebElement cupboardTripleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16015']/div[5]/div[1]/div[4]")
	WebElement tvTripleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16015']/div[5]/div[1]/div[5]")
	WebElement acTripleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16015']/div[5]/div[1]/div[6]")
	WebElement cotTripleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16015']/div[5]/div[1]/div[7]")
	WebElement mettressTripleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16015']/div[5]/div[1]/div[8]")
	WebElement sideTableTripleRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16015']/div[5]/div[1]/div[9]")
	WebElement aircoolerTripleRoom;
	
	
	
/////////////four room details
	@FindBy(xpath="//div[@class='mobile-form__checkbox-thumb js-checkbox']//div[@class='mobile-form__checkbox-thumb__label'][contains(text(),'Four')]")
	WebElement fourRoomImage;
	
	@FindBy(xpath="//input[@id='noOfRoom_16016']")
	WebElement noOfFourRoom;
	
	@FindBy(xpath="//input[@id='rentPerBed_16016']")
	WebElement rentPerBadFourRoom;
	
	@FindBy(xpath="//input[@id='depositPerBed_16016']")
	WebElement depositFourRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16016']/div[5]/div[1]/div[1]")
	WebElement GeysersFourRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16016']/div[5]/div[1]/div[2]")
	WebElement washroomFourRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16016']/div[5]/div[1]/div[3]")
	WebElement cupboardFourRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16016']/div[5]/div[1]/div[4]")
	WebElement tvFourRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16016']/div[5]/div[1]/div[5]")
	WebElement acFourRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16016']/div[5]/div[1]/div[6]")
	WebElement cotFourRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16016']/div[5]/div[1]/div[7]")
	WebElement mettressFourRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16016']/div[5]/div[1]/div[8]")
	WebElement sideTableFourRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16016']/div[5]/div[1]/div[9]")
	WebElement aircoolerFourRoom;
	
	
	
	
/////////////Other room details
	
	@FindBy(xpath="//div[@class='mobile-form__checkbox-thumb js-checkbox']//div[@class='mobile-form__checkbox-thumb__label'][contains(text(),'Other')]")
	WebElement otherRoomImage;
	
	@FindBy(xpath="//input[@id='noOfRoom_16018']")
	WebElement noOfOtherRoom;
	
	@FindBy(xpath="//input[@id='noOfBed_16018']")
	WebElement noOfOtherBad;
	
	@FindBy(xpath="//input[@id='rentPerBed_16018']")
	WebElement rentPerBadOtherRoom;
	
	@FindBy(xpath="//input[@id='depositPerBed_16018']")
	WebElement depositOtherRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16018']/div[5]/div[1]/div[1]")
	WebElement GeysersOtherRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16018']/div[5]/div[1]/div[2]")
	WebElement washroomOtherRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16018']/div[5]/div[1]/div[3]")
	WebElement cupboardOtherRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16018']/div[5]/div[1]/div[4]")
	WebElement tvOtherRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16018']/div[5]/div[1]/div[5]")
	WebElement acOtherRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16018']/div[5]/div[1]/div[6]")
	WebElement cotOtherRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16018']/div[5]/div[1]/div[7]")
	WebElement mettressOtherRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16018']/div[5]/div[1]/div[8]")
	WebElement sideTableOtherRoom;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-roomrent']/div[@class='mb-pg__screen__left']/div[@id='roomDetail-section-key']/div[@id='roomDetail_16018']/div[5]/div[1]/div[9]")
	WebElement aircoolerOtherRoom;
	
////Preferred Gender 
	
	@FindBy(xpath="//div[contains(text(),'Male')]")
	WebElement selectMalegender;
	
	@FindBy(xpath="//div[contains(text(),'Female')]")
	WebElement selectFemalegender;
	
	@FindBy(xpath="//div[@id='gender-section-key']//div[@class='mobile-form__checkbox__label'][contains(text(),'Both')]")
	WebElement selectBothgender;
	
///////Set Your Tenant Preferences 
	
	@FindBy(xpath="//div[contains(text(),'Professionals')]")
	WebElement selectprofessionals;
	
	@FindBy(xpath="//div[contains(text(),'Student')]")
	WebElement selectsturdent;
	
	@FindBy(xpath="//div[@id='tenant-section-key']//div[@class='mobile-form__checkbox__label'][contains(text(),'Both')]")
	WebElement selectBothtypetenant;
	
////////PG Rules
	@FindBy(xpath="//div[contains(text(),'Veg Only')]")
	WebElement pgruleforvag;
	
	@FindBy(xpath="//div[contains(text(),'No Smoking')]")
	WebElement pgruleforNosmoking;
	
	@FindBy(xpath="//div[contains(text(),'Drinking alcohol not allowed')]")
	WebElement pgruleforalcohal;
	
	@FindBy(xpath="//div[contains(text(),'Entry of opposite gender not allowed')]")
	WebElement pgruleforEntryOppositgender;
	
	@FindBy(xpath="//div[contains(text(),'Guardian not allowed')]")
	WebElement pgruleforGardiannotallow;
	
	@FindBy(xpath="//select[@id='noticePeriod']")
	WebElement pgrulefornoticPeriod;
	
	@FindBy(xpath="//div[@id='closing-section-key']//span[@class='slider-style']")
	WebElement tenantmustBebackin;
	
	@FindBy(xpath="//select[@id='closingTime']")
	WebElement gateCloseingtime;
	
///Services Available
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-services']/div[@class='mb-pg__screen__left']/div/div[@id='service-section-key']/div[1]")
	WebElement laundaryPG;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-services']/div[@class='mb-pg__screen__left']/div/div[@id='service-section-key']/div[2]")
	WebElement roomCleaning;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-services']/div[@class='mb-pg__screen__left']/div/div[@id='service-section-key']/div[3]")
	WebElement Warden;
	
////	Food Provided
	
	@FindBy(xpath="//div[@id='food-section-key']//div[@class='mobile-form__checkbox mobile-form__slider js-checkbox']")
	WebElement foodOption;
	
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-services']/div[@class='mb-pg__screen__left']/div/div[@id='food-section-key']/div[@class='js-slider-details']/div[1]")
	WebElement Breakfast;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-services']/div[@class='mb-pg__screen__left']/div/div[@id='food-section-key']/div[@class='js-slider-details']/div[2]")
	WebElement 	Lunch;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-services']/div[@class='mb-pg__screen__left']/div/div[@id='food-section-key']/div[@class='js-slider-details']/div[3]")
	WebElement Dinner;
	
//////Common Area Amenities
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[1]")
	WebElement kitchenforselfcooking;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[2]")
	WebElement roCommon;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[3]")
	WebElement fridgecommon;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[4]")
	WebElement	microwavecommon;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[5]")
	WebElement Liftcommon;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[6]")
	WebElement gymnasiumcommon;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[7]")
	WebElement commonPowerBackup;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[8]")
	WebElement	WiFicommon;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[9]")
	WebElement TVcommon;
	
	
	@FindBy(xpath="//div[@class='mobile-form__checkbox mobile-form__slider js-checkbox']")
	WebElement ParkingAvailability;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='parking-section-key']/div[@class='js-slider-details']/div[1]")
	WebElement	twowheeler;
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='parking-section-key']/div[@class='js-slider-details']/div[2]")
	WebElement fourwheeler;
	
	
	@FindBy(xpath="//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='parking-section-key']/div[@class='js-slider-details']/div[3]")
	WebElement bothwheeler;
	
//////PG Description (Min 100 char) *	
	
	@FindBy(xpath="//textarea[@id='pgdescription']")
	WebElement pgDescription;
	
	@FindBy(xpath="//div[@id='slide_pg-moredetails']//div[3]//div[3]//span[1]")
	WebElement editsavepgDescriptionone;
	
	@FindBy(xpath="//div[@id='slide_pg-moredetails']//div[4]//div[3]//span[1]")
	WebElement editsavepgDescriptiontwo;
	
//////PG Image
	@FindBy(xpath="//input[@id='overviewsection_37601']")
	WebElement buildingViewImg;
	
	@FindBy(xpath="//input[@id='overviewsection_37602']")
	WebElement singleroomViewImg;
	
	@FindBy(xpath="//input[@id='overviewsection_37603']")
	WebElement doubleroomViewImg;
	
	@FindBy(xpath="//input[@id='overviewsection_37604']")
	WebElement tripleroomViewImg;
	
	@FindBy(xpath="//input[@id='overviewsection_37605']")
	WebElement fourroomViewImg;
	
	@FindBy(xpath="//input[@id='overviewsection_37634']")
	WebElement otherroomViewImg;
	
	
	@FindBy(xpath="//input[@id='categorysection_37634']")
	WebElement otherroomDetailViewImg;
	
	
	
	@FindBy(xpath="//input[@id='overviewsection_37608']")
	WebElement commenareaViewImg;
	
	
	@FindBy(xpath="//input[@id='overviewsection_37607']")
	WebElement commenamenityViewImg;
	
	@FindBy(xpath="//input[@id='overviewsection_37609']")
	WebElement kischenViewImg;
	
	@FindBy(xpath="//input[@id='overviewsection_37610']")
	WebElement NeighebourViewImg;
	
	@FindBy(xpath="//input[@id='overviewsection_37611']")
	WebElement MapViewImg;
//////Image LABLE
	
	@FindBy(xpath="//div[@class='upload-pic__subcategory__photo__figcaption']")
	WebElement CommenImgLable;
	
	@FindBy(xpath="//div[@class='figcaption__popup open']//a[@class='figcaption__modal__box__list--item--anchor'][contains(text(),'Front View')]")
	WebElement selectBuildingViewImgLable;
	
	@FindBy(xpath="//div[@class='figcaption__popup open']//a[@class='figcaption__modal__box__list--item--anchor'][contains(text(),'Bed Image')]")
	WebElement selectSingleroomImgLable;
	
	
	@FindBy(xpath="//div[@class='mb-pg-cl__container']//div[2]//div[2]//div[1]//div[2]//a[1]")
	WebElement selectPackagetoPostpg;
	
	@FindBy(xpath="//a[@class='mb-pg-cl__propcta mb-pg-cl__propcta-reset']")
	WebElement confirmOrderPG;
	
	
	
	
	
	//Initializing the page object
			public PostPGPage() {
				
				PageFactory.initElements(driver, this);
			}
			
			public boolean checkThePGPostPageFlowLable() {
				return pGpagelable.isDisplayed();
				
			}
			public void fillPGDetailsinform(String pgLocName, String pgHomeAdd ,String pgAddpincode,String pgHomelandmark ,String pgStartYear ,String pgBrandName ,String singleRoomValue ,String MonthlyrentPerBadsingle ,String depositForSingle ,String doubleRoomValue ,String MonthlyrentPerBaddouble ,String depositFordouble, String tripleRoomValue ,String MonthlyrentPerBadtriple ,String depositFortriple ,String fourRoomValue ,String MonthlyrentPerBadfour,String depositForfour,String otherRoomValue,String noOfmoreBadOtherRoom,String MonthlyrentPerBadother,String depositForother ,String DescriptionForPg) throws InterruptedException {
				Thread.sleep(5000);				
				enterLocalityforPG.sendKeys(pgLocName);
				Thread.sleep(4000);
				selectLocalityforPGDropdown.click();
				pgAddress.sendKeys(pgHomeAdd);
				pgPinCode.sendKeys(pgAddpincode);
				pglandmark.sendKeys(pgHomelandmark);
				PGoperationalSince.sendKeys(pgStartYear);
				Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='pgPresentIn']")));
				dropdown.selectByVisibleText("Present in a society");
				saveAddressCTA.click();
				nameOfPG.sendKeys(pgBrandName);
				saveAddressCTA.click();
				propertyAsOwner.click();
				saveAddressCTA.click();
				crossThePopup.click();
				saveAddressCTA.click();
				cancelCTAonPopup.click();
				saveAddressCTA.click();
				oKCTAonPopup.click();
				singleRoomImage.click();
				DoubleRoomImage.click();
				tripleRoomImage.click();
				fourRoomImage.click();
//				otherRoomImage.click();
				saveAddressCTA.click();
// single room details
				noOfSingleRoom.sendKeys(singleRoomValue);
				rentPerBadSingleRoom.sendKeys(MonthlyrentPerBadsingle);
				depositSingleRoom.sendKeys(depositForSingle);
				WebElement element2 =driver.findElement(By.xpath("//div[@id='roomDetail_16011']//div[@class='mb-pg__slide__heading'][contains(text(),'Room Facilities')]"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element2);
				Thread.sleep(5000);
				
				GeysersSingleRoom.click();
				washroomSingleRoom.click();
				cupboardSingleRoom.click();
				tvSingleRoom.click();
				acSingleRoom.click();
				cotSingleRoom.click();
			    mettressSingleRoom.click();
				//sideTableSingleRoom.click();
				//aircoolerSingleRoom.click();
			    saveAddressCTA.click();
	/////////////Double room details
			    
			     noOfDoubleRoom.sendKeys(doubleRoomValue);				
		         rentPerBadDoubleRoom.sendKeys(MonthlyrentPerBaddouble);				
				 depositDoubleRoom.sendKeys(depositFordouble);
				 WebElement element3 =driver.findElement(By.xpath("//div[@id='roomDetail_16014']//div[@class='mb-pg__slide__heading'][contains(text(),'Room Facilities')]"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element3);
				Thread.sleep(5000);
				 GeysersDoubleRoom.click();				
				 washroomDoubleRoom.click();				
				 cupboardDoubleRoom.click();				
				 tvDoubleRoom.click();				
			     acDoubleRoom.click();				
				 cotDoubleRoom.click();				
			      mettressDoubleRoom.click();				
		//		 sideTableDoubleRoom.click();				
		//		 aircoolerDoubleRoom.click();
				 saveAddressCTA.click();
			    
	/////////////Triple room details
				 
				 noOfTripleRoom.sendKeys(tripleRoomValue);	
				 rentPerBadTripleRoom.sendKeys(MonthlyrentPerBadtriple);	
				 depositTripleRoom.sendKeys(depositFortriple);
				 WebElement element4 =driver.findElement(By.xpath("//div[@id='roomDetail_16015']//div[@class='mb-pg__slide__heading'][contains(text(),'Room Facilities')]"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element4);
				Thread.sleep(5000);
				 GeysersTripleRoom.click();	
				 washroomTripleRoom.click();	
				 cupboardTripleRoom.click();	
				 tvTripleRoom.click();	
				 acTripleRoom.click();
				 cotTripleRoom.click();
				 mettressTripleRoom.click();
			//	 sideTableTripleRoom.click();
			//	 aircoolerTripleRoom.click();
				 saveAddressCTA.click();	
			    
	/////////////Four room details
				 
				 noOfFourRoom.sendKeys(fourRoomValue);
				 rentPerBadFourRoom.sendKeys(MonthlyrentPerBadfour);
				 depositFourRoom.sendKeys(depositForfour);
				 WebElement element5 =driver.findElement(By.xpath("//div[@id='roomDetail_16016']//div[@class='mb-pg__slide__heading'][contains(text(),'Room Facilities')]"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element5);
				Thread.sleep(5000);
				 GeysersFourRoom.click();
				 washroomFourRoom.click();
				 cupboardFourRoom.click();
				 tvFourRoom.click();
				 acFourRoom.click();
				 cotFourRoom.click();
				 mettressFourRoom.click();
			//	 sideTableFourRoom.click();
			//	 aircoolerFourRoom.click();
				 saveAddressCTA.click();
/*				 
	/////////////Other room details
				 
				 noOfOtherRoom.sendKeys(otherRoomValue);
				 noOfOtherBad.sendKeys(noOfmoreBadOtherRoom);
				 rentPerBadOtherRoom.sendKeys(MonthlyrentPerBadother);
				 depositOtherRoom.sendKeys(depositForother);
				 WebElement element6 =driver.findElement(By.xpath("//div[@id='roomDetail_16018']//div[@class='mb-pg__slide__heading'][contains(text(),'Room Facilities')]"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element6);
				Thread.sleep(5000);
				 GeysersOtherRoom.click();
				 washroomOtherRoom.click();
				 cupboardOtherRoom.click();
				 tvOtherRoom.click();
				 acOtherRoom.click();
				 cotOtherRoom.click();
			//	 mettressOtherRoom.click();
			//	 sideTableOtherRoom.click();
			//	 aircoolerOtherRoom.click();
				 saveAddressCTA.click();
*/				 
////Preferred Gender 				 
				//selectMalegender.click();
				//selectFemalegender.click();
				 ((JavascriptExecutor) driver).executeScript("document.getElementById('16003').style.display='block';");
				selectBothgender.click();
//////////Set Your Tenant Preferences 				
				selectprofessionals.click();
				//selectsturdent.click();
				//selectBothtypetenant.click();
				 saveAddressCTA.click();
				 
////////PG Rules
				 Thread.sleep(4000);
				 pgruleforvag.click();
				 pgruleforNosmoking.click();
				 pgruleforalcohal.click();
				 pgruleforEntryOppositgender.click();
				 pgruleforGardiannotallow.click();
				 WebElement element7 =driver.findElement(By.xpath("//div[contains(text(),'Select Notice Period')]"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element7);
				Thread.sleep(5000);
				
				//driver.findElement(By.xpath("//select[@id='noticePeriod']")).click();
				Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='noticePeriod']")));
				 dropdown1.selectByVisibleText("2 Months");
				 tenantmustBebackin.click();				 
				 Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='closingTime']")));
				 dropdown2.selectByVisibleText("12:00 AM");
				// gateCloseingtime.click();
				 saveAddressCTA.click();
				 
//////////////Services Available
				 
				 laundaryPG.click();
				 roomCleaning.click();
				 Warden.click();

//////////// Food Provided
				 foodOption.click();
				 
				 WebElement element8 =driver.findElement(By.xpath("//div[@id='food-section-key']//div[@class='js-slider-details']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element8);
				Thread.sleep(5000);
				 Breakfast.click();
				 Lunch.click();
				 Dinner.click();
				 saveAddressCTA.click();
				 
///////////Common Area Amenities
				 
				 kitchenforselfcooking.click();
				 roCommon.click();
				 fridgecommon.click();
				 microwavecommon.click();
				 Liftcommon.click();
				 gymnasiumcommon.click();
				 Thread.sleep(4000);
				 WebElement element9 =driver.findElement(By.xpath("//body[@class='desktop']/div[@class='mb-pg__main']/div[@class='mb-pg__container']/div[@id='slide_pg-common']/div[@class='mb-pg__screen__left']/div/div[@id='common-section-key']/div[7]"));
				 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element9);
				 Thread.sleep(5000);
				 commonPowerBackup.click();
				 WiFicommon.click();
				 TVcommon.click();
				 ParkingAvailability.click();
				 WebElement element10 =driver.findElement(By.xpath("//div[@id='parking-section-key']//div[@class='js-slider-details']"));
				 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element10);
				 Thread.sleep(5000);
				 //twowheeler.click();
				  //fourwheeler.click();
				 bothwheeler.click();
				 saveAddressCTA.click();
				 
/////////////PG Description (Min 100 char) *
				 
				 pgDescription.sendKeys(DescriptionForPg);
				 saveAddressCTA.click();
				 Thread.sleep(8000);
				 
////////////PG Image
				 
				 buildingViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\27.jpg");
				 Thread.sleep(5000);
				 CommenImgLable.click();
				 selectBuildingViewImgLable.click();
				 saveAddressCTA.click();
				 singleroomViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\10.jpg");
				 Thread.sleep(5000);
				 CommenImgLable.click();
				 selectSingleroomImgLable.click();
				 saveAddressCTA.click();
				 doubleroomViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\11.jpg");
				 Thread.sleep(5000);
				 CommenImgLable.click();
				 selectSingleroomImgLable.click();
				 saveAddressCTA.click();
				 tripleroomViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\12.jpg");
				 Thread.sleep(5000);
				 CommenImgLable.click();
				 selectSingleroomImgLable.click();
				 saveAddressCTA.click();
				 fourroomViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\13.jpg");
				 Thread.sleep(5000);
				 CommenImgLable.click();
				 selectSingleroomImgLable.click();
				 saveAddressCTA.click();
/*				 otherroomViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\unnamed.jpg");
				 Thread.sleep(8000);
				 otherroomDetailViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\31.jpg");
				 CommenImgLable.click();
				 selectSingleroomImgLable.click();
				 saveAddressCTA.click();
*/				 commenareaViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\15.jpg");
				 Thread.sleep(5000);
				 saveAddressCTA.click();
				 commenamenityViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\18.jpg");
				 Thread.sleep(5000);
				 saveAddressCTA.click();
				 kischenViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\19.jpg");
				 Thread.sleep(5000);
				 saveAddressCTA.click();
				 NeighebourViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\20.jpg");
				 Thread.sleep(5000);
				 saveAddressCTA.click();
				 MapViewImg.sendKeys("C:\\Selenium\\Imagesforupload\\17.jpg");
				 Thread.sleep(5000);
				 saveAddressCTA.click();
				 Thread.sleep(8000);
				 selectPackagetoPostpg.click();
				 Thread.sleep(5000);
				 confirmOrderPG.click();
				 Thread.sleep(5000);
			}
	
	

}
