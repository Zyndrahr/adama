package com.adama.testcases;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.adama.utilities.ConfigReader;
import com.adama.utilities.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass extends ConfigReader

{
	
	public static WebDriver driver ;
	
	
	@BeforeClass
	public void setup () throws InterruptedException, IOException   
	
	{
	
	DOMConfigurator.configure("log4j.xml");
	
	Log.startTestCase("Baseclass");
	
	Log.info("Launch the Browser");
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	Log.info("Launch the URL");
	
	driver.get(getUrl());
	
	//driver.manage().window().fullscreen(); --- To Open in Full Screen
	
	driver.manage().window().maximize(); 
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
	
	
	}
	
	@AfterClass
	public void teardown ()
	
	{
		Log.info("Close the Browser");
		
		driver.close();
		
		Log.endTestCase("Baseclass");
	}
	
}
	
