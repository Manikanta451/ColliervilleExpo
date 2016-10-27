package com.cv.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cv.utilities.PropertiesFileReader;



public class DriverHome extends CommonBase {
	
	public static final String prod_url = PropertiesFileReader.readvalueOfKey("app.url");
			

	public DriverHome(WebDriver driver) {
		super(driver);

	}

	public DriverHome(String browser, String text) {
		super(prod_url, browser);
	}

	public DriverHome(String url) {
		super(url, "test");

	}
	
	
	public Login getLogin(){
		return PageFactory.initElements(driver, Login.class);
	}
	
	public AddExhibit getexhibit(){
		return PageFactory.initElements(driver, AddExhibit.class);
	}
	
	
	public AddSensor getsensor(){
		return PageFactory.initElements(driver, AddSensor.class);
	}
	
	public AddCampaign getcampaign(){
		return PageFactory.initElements(driver, AddCampaign.class);
	}
}

