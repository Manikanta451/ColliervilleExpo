package com.cv.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cv.pagefactory.CommonBase;

public class AllPageObjects extends CommonBase{

	public AllPageObjects(WebDriver driver) {
		super(driver);
		
	}
	
//-- Login Objects--//	
	
	@FindBy(how = How.ID, using = "email_login")
	@CacheLookup
	public static WebElement email;

	@FindBy(how = How.ID, using = "password")
	@CacheLookup
	public static WebElement password;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form[1]/div[5]/button")
	@CacheLookup
	public static WebElement signin;
	

	
	
//-- Exihibit Objects--//
	
	@FindBy(how = How.ID, using = "addsensor")
	public static WebElement addexihibit;
	
	@FindBy(how = How.ID, using = "name")
	public static WebElement name;
	
	@FindBy(how = How.ID, using = "description")
	public static WebElement desc;
	
	@FindBy(how = How.ID, using = "video_link_0")
	public static WebElement videolink;
	
	@FindBy(how = How.ID, using = "social_share_title")
	public static WebElement socialsharetitle;
	
	@FindBy(how = How.ID, using = "social_share_description")
	public static WebElement socialsharedesc;
	
	@FindBy(how = How.ID, using = "social_share_image")
	public static WebElement socialshareimg;
	
	@FindBy(how = How.ID, using = "booth_num")
	public static WebElement boothnumer;
	
	@FindBy(how = How.XPATH, using = "//div[13]/div/button")
	public static WebElement add;

	
//-- Sensor Objects--//
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[3]/a/span")
	public static WebElement sensorregistry;
	
	@FindBy(how = How.ID, using = "sensor_name")
	public static WebElement sensorname;
	
	@FindBy(how = How.ID, using = "uuid")
	public static WebElement uuid;
	
	@FindBy(how = How.ID, using = "majorid")
	public static WebElement majorid;
	
	@FindBy(how = How.ID, using = "minorid")
	public static WebElement minorid;
	
	@FindBy(how = How.ID, using = "manufacturer_name")
	public static WebElement manufacturername;
	
	@FindBy(how = How.ID, using = "model_version")
	public static WebElement modelversion;
	
	@FindBy(how = How.ID, using = "firmware_version")
	public static WebElement firmwareversion;
	
	@FindBy(how = How.ID, using = "location_type")
	public static WebElement locationtype;
	
//-- Campaign Objects--//	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[4]/a/span")
	public static WebElement campaign;
	
	@FindBy(how = How.ID, using = "addcampaign")
	public static WebElement addcampaign;
	
	@FindBy(how = How.ID, using = "campaign_name")
	public static WebElement campaignname;
	
	@FindBy(how = How.ID, using = "schedule_starttime")
	public static WebElement schedulestarttime;
	
	@FindBy(how = How.ID, using = "schedule_endtime")
	public static WebElement scheduleendtime;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[5]/div[2]/dl/dd[2]/div/span")
	public static WebElement hour;    
	
	@FindBy(how = How.XPATH, using = "/html/body/div[5]/div[2]/dl/dd[3]/div/span")
	public static WebElement minute; 
	
	@FindBy(how = How.XPATH, using = "/html/body/div[5]/div[3]/button[2]")
	public static WebElement done;
	
	@FindBy(how = How.ID, using = "schedule_startdate")
	public static WebElement schedulestartdate;
	
	@FindBy(how = How.ID, using = "schedule_enddate")
	public static WebElement scheduleenddate;
	
	@FindBy(how = How.ID, using = "repeat_onoff_check")
	public static WebElement repeat;
	
	@FindBy(how = How.ID, using = "text_check")
	public static WebElement notification;
	
	@FindBy(how = How.ID, using = "coupon_code_description")
	public static WebElement textdescription;
	
	@FindBy(how = How.ID, using = "image_check")
	public static WebElement imgcheck;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/form/div/div/div/div[2]/div[1]/div[12]/div/div/div/div/i")
	public static WebElement imgupload;
	
	@FindBy(how = How.ID, using = "video_check")
	public static WebElement videocheck;
	
	@FindBy(how = How.ID, using = "link_description")
	public static WebElement url;
	
	@FindBy(how = How.ID, using = "campaign_trigger")
	public static WebElement trigger;
	
	@FindBy(how = How.ID, using = "visitor_gender")
	public static WebElement visitorgender;
	
	@FindBy(how = How.ID, using = "visitor_group")
	public static WebElement visitorgroup;
	
	@FindBy(how = How.ID, using = "visitor_type")
	public static WebElement visitortype;
	
	@FindBy(how = How.ID, using = "visitor_number")
	public static WebElement visitornumber;
	
	@FindBy(how = How.ID, using = "add_campaign")
	public static WebElement campaignadd;

}
