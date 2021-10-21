package com.sg.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage 
{
	ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getPassWord()
	{
		return pwd;
	}
	@FindBy(xpath="//*[@id=\'loginButton\']/div ")
	private WebElement loginbtn;
	public WebElement getLoginBtn()
	{
		return loginbtn;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getMininizeFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement Userlist;
	public WebElement getUserList()
	{
		return Userlist;
	}
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement adduser;
	public WebElement getAddUser()
	{
		return adduser;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement getFirstName()
	{
		return userDataLightBox_firstNameField ;
	}
	private WebElement userDataLightBox_lastNameField ;
	public WebElement getLastName()
	{
		return userDataLightBox_lastNameField  ;
	}
	private WebElement userDataLightBox_emailField ;
	public WebElement getEmail()
	{
		return userDataLightBox_emailField  ;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getuserName()
	{
		return userDataLightBox_usernameField  ;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getPassword()
	{
		return userDataLightBox_passwordField  ;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getRetypePassword()
	{
		return userDataLightBox_passwordCopyField ;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement createuser;
	public WebElement getCreateUser()
	{
		return createuser;
	}
	@FindBy(xpath="//*[@id=\'logoutLink\']")
	private WebElement logout;
	public WebElement getLogout()
	{
		return logout;
	}
}
