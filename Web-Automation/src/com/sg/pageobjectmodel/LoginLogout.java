package com.sg.pageobjectmodel;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginLogoutDemo
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage ATP=null;
	static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","H:\\SeleniumAutomation\\Examples\\Web-Automation\\Library\\Driver\\chromedriver.exe\\");
			oBrowser=new ChromeDriver();
			ATP=new ActiTimePage(oBrowser);
					
		}
		catch(Exception e)
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
		}
		catch(Exception e)
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
	static void login()
	{
		try
		{
			ATP.getUserName().sendKeys("admin");
			ATP.getPassWord().sendKeys("manager");
			ATP.getLoginBtn().click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			ATP.getMininizeFlyoutWindow().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			ATP.getUserList().click();
			Thread.sleep(4000);
			ATP.getAddUser().click();
			Thread.sleep(4000);
			ATP.getFirstName().sendKeys("Ramya");
			Thread.sleep(4000);
			ATP.getLastName().sendKeys("shree");
			Thread.sleep(4000);
			ATP.getEmail().sendKeys("ramyashree.br@gmail.com");
			Thread.sleep(4000);
			ATP.getuserName().sendKeys("arun1");
			Thread.sleep(4000);
			ATP.getPassword().sendKeys("chinnu007");
			Thread.sleep(4000);
			ATP.getRetypePassword().sendKeys("chinnu007");
			Thread.sleep(4000);
			ATP.getCreateUser().click();
			Thread.sleep(4000);
			ATP.getAddUser().click();
			Thread.sleep(4000);
			ATP.getFirstName().sendKeys("bhavya");
			Thread.sleep(4000);
			ATP.getLastName().sendKeys("shree");
			Thread.sleep(4000);
			ATP.getEmail().sendKeys("ramyaarun83@gmail.com");
			Thread.sleep(4000);
			ATP.getuserName().sendKeys("arun12");
			Thread.sleep(4000);
			ATP.getPassword().sendKeys("chinnu08");
			Thread.sleep(4000);
			ATP.getRetypePassword().sendKeys("chinnu08");
			Thread.sleep(4000);
			ATP.getCreateUser().click();
			Thread.sleep(4000);
			ATP.getAddUser().click();
			Thread.sleep(4000);
			ATP.getFirstName().sendKeys("pruthvi");
			Thread.sleep(4000);
			ATP.getLastName().sendKeys("darshan");
			Thread.sleep(4000);
			ATP.getEmail().sendKeys("ramyaarun83@gmail.com");
			Thread.sleep(4000);
			ATP.getuserName().sendKeys("arun123");
			Thread.sleep(4000);
			ATP.getPassword().sendKeys("chinnu09");
			Thread.sleep(4000);
			ATP.getRetypePassword().sendKeys("chinnu09");
			Thread.sleep(4000);
			ATP.getCreateUser().click();
			Thread.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginByUserName()
	{
		try
		{
			ATP.getUserName().sendKeys("arun12");
			ATP.getPassWord().sendKeys("chinnu08");
			ATP.getLoginBtn().click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			ATP.getLogout().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class LoginLogout 
{

	public static void main(String[] args) 
	{
		LoginLogoutDemo.launch();
		LoginLogoutDemo.navigate();
		LoginLogoutDemo.login();
		LoginLogoutDemo.minimizeFlyOutWindow();
		LoginLogoutDemo.createUser();
		LoginLogoutDemo.logout();
		LoginLogoutDemo.loginByUserName();

	}

}
