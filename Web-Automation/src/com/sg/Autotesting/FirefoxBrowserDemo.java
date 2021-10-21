package com.sg.Autotesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class FireFoxBrowser
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "H:\\SeleniumAutomation\\Examples\\Web-Automation\\Library\\Driver\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class FirefoxBrowserDemo 
{

	public static void main(String[] args) 
	{
		FireFoxBrowser.launchBrowser();
		FireFoxBrowser.navigate();
		FireFoxBrowser.closeApplication();

	}

}
