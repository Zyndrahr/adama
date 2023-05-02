package com.adama.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.adama.testcases.Baseclass;

public class Zonal_pageobjects extends Baseclass

{

	@FindBy (xpath = "//span[@class='pull-right-container']")
	@CacheLookup
	private WebElement Master;
	
	@FindBy (xpath = "//a[normalize-space()='Zonal Admin']")
	@CacheLookup
	private WebElement zonaladmin;
	
	@FindBy (xpath = "//a[normalize-space()='New Zonal admin']")
	@CacheLookup
	private WebElement NewZonalAdmin;
	
	@FindBy (xpath = "//span[@id='select2-employee-id-container']")
	@CacheLookup
	private WebElement Employeedropdown;
	
	
	
    public void Master () throws IOException, InterruptedException
	
	{
    	Thread.sleep(2000);
    	Master.click();
		
	}
	
    public void zonaladmin () throws InterruptedException 
	
	{
    	Thread.sleep(2000);
    	zonaladmin.click();
		
	}
    
    public void NewZonalAdmin () throws IOException
	
   	{
    	NewZonalAdmin.click();
   		
   	}
    
    
    public void Employeedropdown () throws IOException
	
   	{
    	
        // Initialize a Select object with the dropdown element
        Select select = new Select(Employeedropdown);
        
        // Select an option by its visible text
        select.selectByVisibleText("Option 1");
        
        // Alternatively, select an option by its value attribute
        select.selectByValue("value1");
   		
   	}
    
	
	
}
