package com.crm.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.base.Testbase;
import com.crm.pages.registration;
import com.crm.util.takescreenshot;

public class LoginTest extends Testbase {
	
	//registration Registartion;
	  registration reg = new registration();  
       LoginTest logintest;
		
 @BeforeMethod
 public void setup() throws InterruptedException {
	 initialization();	 
	 //Registartion = new registration();
 }	
 
 
 
  @Test (priority = 2)
  public void createaccount() throws IOException {
 	  
	  registration reg = new registration(); 
	  takescreenshot.Getscreenshot(driver,"homepage");
	  reg.sigin();
	  reg.enteremail();
	  takescreenshot.Getscreenshot(driver,"emailpage");
	  reg.create();
	  reg.createanaccount();
	  takescreenshot.Getscreenshot(driver,"createaccount");

	  
  }
  @AfterMethod
  public void close() {  
	 // driver.quit();
  }
}
