package com.wipro.ranford;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;

public class BaseClass {

static Properties p;
	
	public static void loadproperty()
	{
		try {
			File f = new File("src\\main\\java\\Configuration\\Config.properties");
			FileReader fr = new FileReader(f);
			p = new Properties();
			p.load(fr);
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}
	
	public static String config(String key)
	{
		loadproperty();
		String x = p.getProperty(key);
		return x;
	}
	
	public static void loadproperty2()
	{
		try {
			File f = new File("src\\main\\java\\Configuration\\OR.properties");
			FileReader fr = new FileReader(f);
			p = new Properties();
			p.load(fr);
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}
	
	public static String OR(String key)
	{
		loadproperty2();
		String x = p.getProperty(key);
		return x;
	}
	
	public static By getLocator(String key)
	{
		loadproperty2();
		
		By loc=null;
		String elename = p.getProperty(key);
		String locType = elename.split(":")[0];
		String locValue = elename.split(":")[1];
		
		switch(locType)
		{
		case "id":			
			loc = By.id(locValue);
			break;	
		case "name":
			loc = By.name(locValue);
			break;
		case "xpath":
			loc = By.xpath(locValue);	
			break;
		case "linkText":
			loc = By.linkText(locValue);	
			break;			
		}
		
		return loc;
	}


}
