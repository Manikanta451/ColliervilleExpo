package com.cv.pagefactory;


import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.cv.datainitialization.DataInt;
import com.cv.pageobjects.AllPageObjects;


public class Login extends AllPageObjects{
	
	public Login(WebDriver driver) {
		super(driver);
	}
	

	
	
	public void accountlogin(DataInt dataInt) throws Exception {
		try {
			waitForSeconds(5);
			email.sendKeys(dataInt.getEmail());
			waitForSeconds(1);
			password.sendKeys(dataInt.getPassword());
			waitForSeconds(2);
			signin.click();
			
			}catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
	
	
}
