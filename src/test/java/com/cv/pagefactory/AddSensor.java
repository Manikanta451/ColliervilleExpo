package com.cv.pagefactory;

import org.openqa.selenium.WebDriver;

import com.cv.datainitialization.DataInt;
import com.cv.pageobjects.AllPageObjects;

public class AddSensor extends AllPageObjects{

	public AddSensor(WebDriver driver) {
		super(driver);
	}
	
	public void addsensor(DataInt dataInt) throws Exception {
			
			try {
				waitForSeconds(8);
				sensorregistry.click();
				waitForSeconds(5);
				addexihibit.click();
				waitForSeconds(5);
				sensorname.sendKeys(dataInt.getName());
				waitForSeconds(1);
				desc.sendKeys(dataInt.getDescription());
				waitForSeconds(1);
				uuid.sendKeys(dataInt.getUuid());
				waitForSeconds(1);
				majorid.sendKeys(dataInt.getMajorid());
				waitForSeconds(1);
				minorid.sendKeys(dataInt.getMinorid());
				waitForSeconds(1);
				manufacturername.sendKeys(dataInt.getManufactureName());
				waitForSeconds(1);
				modelversion.sendKeys(dataInt.getModelVersion());
				waitForSeconds(1);
				firmwareversion.sendKeys(dataInt.getFirmwareVersion());
				waitForSeconds(1);
				locationtype.sendKeys(dataInt.getLocation());
				waitForSeconds(4);
				//add.click();
				
				
				
			} catch (Exception e) {
			
			}

	}
}