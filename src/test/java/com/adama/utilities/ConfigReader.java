package com.adama.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 

{

	public static Properties getPropertyObject() throws IOException
	
	{
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\Configuration\\config.properties");
		Properties prop = new Properties();
		prop.load(ip);
		return prop;
		
	}
	
	public static String getUrl() throws IOException
	
	{
		return getPropertyObject().getProperty("URL");
	}

    public static String getEmail() throws IOException
	
	{
		return getPropertyObject().getProperty("Email");
	}

    public static String getPassword() throws IOException
	
	{
		return getPropertyObject().getProperty("Password");
	}
	
	
}
