package com.cv.testscripts;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.cv.utilities.Xls_Reader;
import com.cv.pagefactory.DriverHome;
import com.cv.pagefactory.Login;


/**
 * 
 * 
 * This is the base class for all the test suites,It executes before executing
 * the TestSuite Classes
 * 
 */

public class Base {
	public static final Logger LOG = Logger.getLogger(Base.class);
	public DriverHome driverhome;
	
	public Login login;
	
	public static String passMessage = null;
	public static String finalMessage = null;
	public static String skipMessage = null;
	public Xls_Reader xls;

	@BeforeTest
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		try {
			Reporter.log("=====Browser Session Started=====", true);
			driverhome = new DriverHome(browser, "test");
			
		} catch (WebDriverException e) {
			System.out.println(e);
			
		}
	}

	@AfterTest
	public void close() throws Exception {
		try {
			Thread.sleep(5000);
		   // driverhome.emailreport();
			//driverhome.quitDriver();
			Reporter.log("=====Browser Session End=========", true);
		} catch (WebDriverException e) {
			System.out.println(e); 

		}
	}
}
