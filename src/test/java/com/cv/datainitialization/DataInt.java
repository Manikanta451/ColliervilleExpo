package com.cv.datainitialization;

import java.io.Serializable;

public class DataInt implements Serializable {

	
	
	private static final long serialVersionUID = -5841500346110682370L;
	
// ---Login------//
	
					public String email = "";
					public String password = "";
		
					
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
	
		
}	