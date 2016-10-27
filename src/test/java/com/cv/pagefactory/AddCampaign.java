package com.cv.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cv.datainitialization.DataInt;
import com.cv.pageobjects.AllPageObjects;

public class AddCampaign extends AllPageObjects {

	public AddCampaign(WebDriver driver) {
		super(driver);
		
	}
	public void addcampiagn(DataInt dataInt) throws Exception {
		try {
			waitForSeconds(8);
			campaign.click();
			waitForSeconds(5);
			addcampaign.click();
			waitForSeconds(5);
			campaignname.sendKeys(dataInt.getCampaignName());
			/*waitForSeconds(1);
			desc.sendKeys(dataInt.getDescription());
			schedulestarttime.click();
			waitForSeconds(2);
			slider(hour, 60, 0);
			waitForSeconds(2);
			slider(minute, 40, 0);
			waitForSeconds(2);
			done.click();
			waitForSeconds(2);
			scheduleendtime.click();
			waitForSeconds(2);
			slider(hour, 30, 0);
			waitForSeconds(2);
			slider(minute, 20, 0);
			waitForSeconds(2);
			done.click();
			waitForSeconds(3);
			schedulestartdate.click();
			waitForSeconds(1);
			systemdateselect();
			waitForSeconds(1);
			scheduleenddate.click();
			waitForSeconds(1);
			futuredateselection();*/
			waitForSeconds(3);
			Campaigncontent(imgcheck);
			
			
		} catch (Exception e) {
			
		}
	
	}
	
	
	public void Campaigncontent(WebElement element)throws Exception {
		try {
			if (element.equals(notification)) {
				notification.click();
				waitForSeconds(1);
				textdescription.sendKeys("Test");
			}else if (element.equals(imgcheck)) {
				imgcheck.click();
				waitForSeconds(1);
				imgupload.click();
				waitForSeconds(2);
				super.fileupload(imagepath + "\\images\\Campaign.jpg");	
			}else if (element.equals(videocheck)) {
				videocheck.click();
				waitForSeconds(1);
				url.sendKeys("www.google.com");	
			}
		} catch (Exception e1) {
			System.out.println(e1);
			
		}
		
			
		
		
	}
	
	
}
