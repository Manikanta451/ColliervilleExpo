package com.cv.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cv.pagefactory.CommonBase;

public class AllPageObjects extends CommonBase{

	public AllPageObjects(WebDriver driver) {
		super(driver);
		
	}
	
//-- Login Objects--//	
	
	@FindBy(how = How.ID, using = "email_login")
	public static WebElement email;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form[1]/div[5]/button")
	public static WebElement signin;
}
