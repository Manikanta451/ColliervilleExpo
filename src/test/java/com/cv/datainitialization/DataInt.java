package com.cv.datainitialization;

import java.io.Serializable;

public class DataInt implements Serializable {

	
	
	private static final long serialVersionUID = -5841500346110682370L;
	
// ---Login------//
	
					public String email = "";
					public String password = "";
					
					

					
					
//---Exhibit----//
					
					
					
					public String Name ="";
					public String Description ="";
					public String VideoLink = "";
					public String SocialShareTitle ="";
					public String SocialShareDescription ="";
					public String BoothNumber="";
					
// --Sensor ---//
					
					
					public String uuid="";
					public String majorid="";
					public String minorid="";
					public String ManufactureName ="";			
					public String ModelVersion ="";
					public String FirmwareVersion ="";
					public String Location ="";
					
//--Campaign--//
					
					public String CampaignName="";
					public String NotificationText="";
					public String Url="";

					

		
					
//--Login getter and setter methods--//
					
					
					
					public String getEmail() {
						return email;
					}
					public void setEmail(String email) {
						this.email = email;
					}
					public String getPassword() {
						return password;
					}
					public void setPassword(String password) {
						this.password = password;
					}
					
//--Exhibit Getter and setter methods--//
					
					
					public String getName() {
						return Name;
					}
					public void setName(String name) {
						Name = name;
					}
					public String getDescription() {
						return Description;
					}
					public void setDescription(String description) {
						Description = description;
					}
					public String getVideoLink() {
						return VideoLink;
					}
					public void setVideoLink(String videoLink) {
						VideoLink = videoLink;
					}
					public String getSocialShareTitle() {
						return SocialShareTitle;
					}
					public void setSocialShareTitle(String socialShareTitle) {
						SocialShareTitle = socialShareTitle;
					}
					public String getSocialShareDescription() {
						return SocialShareDescription;
					}
					public void setSocialShareDescription(String socialShareDescription) {
						SocialShareDescription = socialShareDescription;
					}
					public String getBoothNumber() {
						return BoothNumber;
					}
					public void setBoothNumber(String boothNumber) {
						BoothNumber = boothNumber;
					}
					
					
					
//---- Sensor getter and setter methods
					
					public String getUuid() {
						return uuid;
					}
					public void setUuid(String uuid) {
						this.uuid = uuid;
					}
					public String getMajorid() {
						return majorid;
					}
					public void setMajorid(String majorid) {
						this.majorid = majorid;
					}
					public String getMinorid() {
						return minorid;
					}
					public void setMinorid(String minorid) {
						this.minorid = minorid;
					}
					public String getManufactureName() {
						return ManufactureName;
					}
					public void setManufactureName(String manufactureName) {
						ManufactureName = manufactureName;
					}
					public String getModelVersion() {
						return ModelVersion;
					}
					public void setModelVersion(String modelVersion) {
						ModelVersion = modelVersion;
					}
					public String getFirmwareVersion() {
						return FirmwareVersion;
					}
					public void setFirmwareVersion(String firmwareVersion) {
						FirmwareVersion = firmwareVersion;
					}
					public String getLocation() {
						return Location;
					}
					public void setLocation(String location) {
						Location = location;
					}
					
//----- Campaign gettre and setter methods----//
					
					
					public String getCampaignName() {
						return CampaignName;
					}
					public void setCampaignName(String campaignName) {
						CampaignName = campaignName;
					}
					public String getNotificationText() {
						return NotificationText;
					}
					public void setNotificationText(String notificationText) {
						NotificationText = notificationText;
					}
					public String getUrl() {
						return Url;
					}
					public void setUrl(String url) {
						Url = url;
					}
}	