package com.adama.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.adama.utilities.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass extends ConfigReader

{
	
	public static WebDriver driver ;
	
	
	@BeforeClass
	public void setup () throws InterruptedException, IOException   
	
	{
	
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get(getUrl());
	
	//driver.manage().window().fullscreen(); --- To Open in Full Screen
	
	driver.manage().window().maximize(); 
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
	
	}
	
	@AfterClass
	public void teardown ()
	
	{
		driver.close();
	}
	
}
	
