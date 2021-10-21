package com.sg.Autotesting;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoAssignment9
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
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
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
	static void createUser()
	{
		try
		{
		   System.out.println("enter number of users to be created");
		   Scanner SC=new Scanner(System.in);
		   int n=SC.nextInt();
			int i=1;
			while(i<=n)
			{	
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				Thread.sleep(2000);
				/*System.out.println("enter Firstname of users ");
				Scanner Sc=new Scanner(System.in);
				String Fname=Sc.next();*/
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Fname"+i);
				Thread.sleep(2000);
				/*System.out.println("enter Lastname of users ");
				Scanner Sc1=new Scanner(System.in);
				String Lname=Sc1.next();*/
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Lname"+i);
				Thread.sleep(2000);
				/*System.out.println("enter email of users ");
				Scanner Sc2=new Scanner(System.in);
				String email=Sc2.next();*/
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("email@gmail.com");
				Thread.sleep(2000);
				/*System.out.println("enter Username of users ");
				Scanner Sc3=new Scanner(System.in);
				String Uname=Sc3.next();*/
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Uname"+i);
				Thread.sleep(2000);
				/*System.out.println("enter password of users ");
				Scanner Sc4=new Scanner(System.in);
				String Pwd=Sc4.next();*/
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("pwd"+i);
				Thread.sleep(2000);
			/*	System.out.println("retype password of users ");
				Scanner Sc5=new Scanner(System.in);
				String Pwd1=Sc5.next();*/
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("pwd"+i);
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(4000);
				i++;
			}
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
		   Thread.sleep(4000);
		   
	   }
	   catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginByUserName(int n)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Uname"+n);
			Thread.sleep(6000);
			oBrowser.findElement(By.name("pwd")).sendKeys("pwd"+n);
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div ")).click();
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(6000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginByModifiedPassword(int n)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Uname"+n);
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("userpwd"+n);
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div ")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(5000);
			//oBrowser.findElement(By.name("pwd")).equals(oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyPasswordByUserName(int n)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			if(n==1)
			{
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(4000);
			}
			else if(n==2)
			{
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(4000);
			}
			else if(n==3)
			{
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(4000);
			}
					oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
					Thread.sleep(5000);
					oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("userpwd"+n);
					Thread.sleep(5000);
					oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
					Thread.sleep(5000);
					oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("userpwd"+n);
					Thread.sleep(5000);
					oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
					Thread.sleep(5000);	
					oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
					Thread.sleep(5000);	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Assignment9 
{

	public static void main(String[] args) 
	{
		DemoAssignment9.launch();
		DemoAssignment9.navigate();
		DemoAssignment9.login();
		DemoAssignment9.minimizeFlyOutWindow();
		//DemoAssignment9.createUser();
		DemoAssignment9.logout();
		DemoAssignment9.loginByUserName(1);
		DemoAssignment9.logout();
		DemoAssignment9.loginByUserName(2);
		DemoAssignment9.logout();
		DemoAssignment9.loginByUserName(3);
		DemoAssignment9.logout();
		DemoAssignment9.login();
		DemoAssignment9.modifyPasswordByUserName(1);
		DemoAssignment9.modifyPasswordByUserName(2);
		DemoAssignment9.modifyPasswordByUserName(3);
		DemoAssignment9.logout();
		DemoAssignment9.loginByModifiedPassword(1);
		DemoAssignment9.logout();
		/*DemoAssignment9.loginByModifiedUserName(2);
		DemoAssignment9.logout();
		DemoAssignment9.loginByModifiedUserName(3);
		DemoAssignment9.logout();
		DemoAssignment9.login();*/			

	}

}
