package com.cv.testscripts;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cv.utilities.Util;
import com.cv.utilities.Xls_Reader;
import com.cv.datainitialization.DataInt;



public class TestSuite extends Base {
	
	public static final Logger LOG = Logger.getLogger(TestSuite.class);
	String testDataPath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\cv\\test\\data\\TestData.xlsx";
	public Xls_Reader xls = new Xls_Reader(testDataPath);
	
	

	@Test(description = "Login", dataProvider = "getLogin", priority = 1)
	public void Login(DataInt dataInt) throws Exception {
			login= driverhome.getLogin();
			login.accountlogin(dataInt);			
	}
	
	
 
	
	
	@DataProvider
		public Iterator<Object[]> getLogin() {
			return Util.getLoginData("Login", xls).iterator();

		}
			
			
}


