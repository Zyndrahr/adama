package com.adama.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.adama.pageobjects.Login_pageobjects;

public class Login extends Login_pageobjects

{
	@Test
	public void loginTest() throws IOException 
	{
		
    System.out.println ("driver =" + driver); 
	
    Login lp = PageFactory.initElements(driver, Login.class);
	
	lp.Emailfield();
	lp.Passwordfield();
	lp.Signup();
	
	}
	
	
}
