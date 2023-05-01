package com.adama.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.adama.testcases.Baseclass;

public class Login_pageobjects extends Baseclass

{
	
	@FindBy (xpath = "//input[@placeholder='E-mail']")
	@CacheLookup
	private WebElement Emailfield;

	@FindBy (xpath = "//input[@placeholder='Password']")
	@CacheLookup
	private WebElement Passwordfield;
	
	@FindBy (xpath = "//button[normalize-space()='Sign In']")
	@CacheLookup
	private WebElement Signup;
	
	public void Emailfield () throws IOException
	
	{
		Emailfield.sendKeys(getEmail());
		
	}
	
    public void Passwordfield () throws IOException
	
	{
    	Passwordfield.sendKeys(getPassword());	
    	
	}
    
    public void Signup ()
	
	{
    	Signup.click();
	}
}
