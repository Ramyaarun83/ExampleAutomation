package com.sg.Autotesting;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoAssignment1
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
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
		static void createUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Ramya");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Arun");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("ramyaarun@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Ramyaarun");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("sginstitute");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("sginstitute");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
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
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(2000);
			   
		   }
		   catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
public class Assignment1 
{

	public static void main(String[] args) 
	{
		DemoAssignment1.launchBrowser();
		DemoAssignment1.navigate();
		DemoAssignment1.login();
		DemoAssignment1.minimizeFlyOutWindow();
		DemoAssignment1.createUser();
		DemoAssignment1.logout();
		DemoAssignment1.closeApplication();


	}

}
