package com.sg.Autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoModifyProject
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "H:\\SeleniumAutomation\\Examples\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		
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
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div ")).click();
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(3500);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(3700);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Example1");
			Thread.sleep(4200);
			/*oBrowser.findElement(By.id("ext-gen23")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'ext-gen130\']")).click();
			Thread.sleep(5500);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(6000);
			oBrowser.findElement(By.id("projectPopup_newCustomerNameField")).sendKeys("Prabhakar Sir");
			Thread.sleep(6500);*/
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(7000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	static void modifyproj()
	{
		
	}
}
public class ModifyProject 
{

	public static void main(String[] args) 
	{
		DemoModifyProject.launchBrowser();
		DemoModifyProject.navigate();
		DemoModifyProject.login();
		DemoModifyProject.minimizeFlyOutWindow();
		DemoModifyProject.createProject();	
		
	}

}
