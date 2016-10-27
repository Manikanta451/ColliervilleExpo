package com.cv.utilities;

import java.util.LinkedList;
import org.apache.log4j.Logger;
import com.cv.datainitialization.DataInt;

public class Util {



public static final Logger LOG = Logger.getLogger(Util.class);



public static LinkedList<Object[]> getLoginData(String sheetName1,Xls_Reader xls) {
		

	LinkedList<Object[]> logindata = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Login")) {

				dataInitialization.setEmail(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setPassword(xls.getCellData(sheetName1, 2, i));
	
				obj[0] = dataInitialization;
				logindata.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return logindata;

    }
public static LinkedList<Object[]> getexhibitdata(String sheetName1,Xls_Reader xls) {
	

	LinkedList<Object[]> exhibitdata = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Exhibit")) {

				dataInitialization.setName(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setDescription(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setVideoLink(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setSocialShareTitle(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setSocialShareDescription(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setBoothNumber(xls.getCellData(sheetName1, 6, i));
				
	
				obj[0] = dataInitialization;
				exhibitdata.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return exhibitdata;

    }
public static LinkedList<Object[]> getsensordata(String sheetName1,Xls_Reader xls) {
	

	LinkedList<Object[]> sensordata = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Sensor")) {

				dataInitialization.setName(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setDescription(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setUuid(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setMajorid(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setMinorid(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setManufactureName(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setModelVersion(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setFirmwareVersion(xls.getCellData(sheetName1, 8, i));
				dataInitialization.setLocation(xls.getCellData(sheetName1, 9, i));
	
				obj[0] = dataInitialization;
				sensordata.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return sensordata;

    }
public static LinkedList<Object[]> getcampaigndata(String sheetName1,Xls_Reader xls) {
	

	LinkedList<Object[]> campaigndata = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Campaign")) {

				dataInitialization.setCampaignName(xls.getCellData(sheetName1, 1, i));;
				dataInitialization.setDescription(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setNotificationText(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setUrl(xls.getCellData(sheetName1, 4, i));
				
				
	
				obj[0] = dataInitialization;
				campaigndata.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return campaigndata;

    }
}


