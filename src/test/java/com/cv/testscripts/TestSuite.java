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
	
	

	@Test(description = "Login", dataProvider = "getLogin", priority = 0)
	public void Login(DataInt dataInt) throws Exception {
			login= driverhome.getLogin();
			login.accountlogin(dataInt);			
	}
	
	
	@Test(description = "AddExhibit", dataProvider = "getExhibit", priority = 1)
	public void AddExhibit(DataInt dataInt) throws Exception {
			exhibit= driverhome.getexhibit();
			exhibit.exhibitadding(dataInt);
	}
	
	@Test(description = "AddSensor", dataProvider = "getSensor", priority = 2)
	public void AddSensor(DataInt dataInt) throws Exception {
			sensor=driverhome.getsensor();
			sensor.addsensor(dataInt);
	}
	
	
	@Test(description = "AddCampaign", dataProvider = "getCampaign", priority = 3)
	public void AddCampaign(DataInt dataInt) throws Exception {
			campaign=driverhome.getcampaign();
			campaign.addcampiagn(dataInt);
		
	}
		@DataProvider
		public Iterator<Object[]> getLogin() {
			return Util.getLoginData("Login", xls).iterator();

		}
		
		@DataProvider
		public Iterator<Object[]> getExhibit() {
			return Util.getexhibitdata("Exhibit", xls).iterator();

		}	
		
		@DataProvider
		public Iterator<Object[]> getSensor() {
			return Util.getsensordata("Sensor", xls).iterator();

		}	
		
		@DataProvider
		public Iterator<Object[]> getCampaign() {
			return Util.getcampaigndata("Campaign", xls).iterator();

		}	
			
}


