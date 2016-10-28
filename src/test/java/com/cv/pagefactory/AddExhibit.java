package com.cv.pagefactory;

import org.openqa.selenium.WebDriver;

import com.cv.datainitialization.DataInt;
import com.cv.pageobjects.AllPageObjects;

public class AddExhibit extends AllPageObjects {

	public AddExhibit(WebDriver driver) {
		super(driver);
	}


	public void exhibitadding (DataInt dataInt) throws Exception{
		
		try {
			waitForSeconds(7);
			captureElementSpecificScreenShot(addexihibit);
			waitForSeconds(2);
			addexihibit.click();
			waitForSeconds(4);
			name.sendKeys(dataInt.getName());
			waitForSeconds(1);
			desc.sendKeys(dataInt.getDescription());
			waitForSeconds(1);
			videolink.sendKeys(dataInt.getVideoLink());
			waitForSeconds(1);
			socialsharetitle.sendKeys(dataInt.getSocialShareTitle());
			waitForSeconds(1);
			socialsharedesc.sendKeys(dataInt.getSocialShareDescription());
			waitForSeconds(2);
			socialshareimg.click();
			waitForSeconds(2);
			super.fileupload(imagepath + "\\images\\Exhibit.jpg");
			waitForSeconds(4);
			boothnumer.sendKeys(dataInt.getBoothNumber());
			waitForSeconds(3);
			//add.click();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
}
