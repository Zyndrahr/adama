package com.adama.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.adama.pageobjects.Login_pageobjects;
import com.adama.utilities.Log;

public class Login extends Login_pageobjects

{
	@Test (priority = -1)
	public void loginTest() throws IOException 
	{
	
		
    System.out.println ("driver =" + driver); 
	
    Login lp = PageFactory.initElements(driver, Login.class);
	
    Log.startTestCase("loginTest");
    
    Log.info("Enter the Email id");
	lp.Emailfield();
	
	Log.info("Enter the Password");
	lp.Passwordfield();
	
	Log.info("Click on login button");
	lp.Signup();
	
	Log.info("Assertion Check");
	
	String Actualtitle = driver.getTitle();
	String expectedtitle = "ADAMA | Admin/Dashboards";
	
	Assert.assertEquals(Actualtitle, expectedtitle);
	Log.info("Login Success");
	
	Log.endTestCase("loginTest");
	
	
	}
	
	
}
