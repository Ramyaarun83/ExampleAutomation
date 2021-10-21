package com.sg.Autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WithUsingWebElement
{
	public static WebDriver oBrowser=null;
	static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "H:\\SeleniumAutomation\\Examples\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void login()
	{
		WebElement oUserName =null;
		WebElement oPassword =null;
		try
		{
			 oUserName=oBrowser.findElement(By.id("username"));
			 oUserName.sendKeys("admin");
			 Thread.sleep(3000);
			 oPassword=oBrowser.findElement(By.name("pwd"));
			 oPassword.sendKeys("manager");
			 Thread.sleep(3000);
			 oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			 Thread.sleep(4000);
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
			 oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			 Thread.sleep(3000);
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
			 WebElement oUserList=null;
			 oUserList=oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]"));
			   oUserList.click();
			 Thread.sleep(3000);
			 WebElement oAddUser=null;
			 oAddUser=oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	
			 oAddUser.click();
			 Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class WithUsingWebElementDemo 
{

	public static void main(String[] args) 
	{
		WithUsingWebElement.launch();
		WithUsingWebElement.navigate();
		WithUsingWebElement.login();
		WithUsingWebElement.minimizeFlyOutWindow();
		WithUsingWebElement.createUser();

	}

}
