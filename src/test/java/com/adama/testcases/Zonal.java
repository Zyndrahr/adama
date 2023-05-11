package com.adama.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.adama.pageobjects.Zonal_pageobjects;
import com.adama.utilities.Log;

public class Zonal extends Zonal_pageobjects

{

	@Test (priority = 0)
	public void ZonalTest() throws IOException, InterruptedException 
	{
		
		Log.startTestCase("Zonaladmin");
	
		try {
	Login l = new Login();
	l.loginTest();
	
	Log.info("Login Successful");
		} catch (Exception e) {
			
		}
	
    System.out.println ("driver =" + driver); 
	
    Zonal z = PageFactory.initElements(driver, Zonal.class);
    
    Log.info("Click on the Master");
	z.Master();
	
	Log.info("Click on the ZonalAdmin");
	z.zonaladmin();
	
	Log.info("Add New Zonal Admin");
	z.NewZonalAdmin();
	
	Log.info("Selected Employee from the List");
	//z.Employeedropdown();
	
	Log.endTestCase("Zonaladmin");
	
	
	}
}
