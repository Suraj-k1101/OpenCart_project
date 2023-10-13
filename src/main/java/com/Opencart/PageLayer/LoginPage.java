package com.Opencart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver d)
	{
		
		driver = d;
		PageFactory.initElements(driver, this);
		
	}
	
//-------------------------------------------------------------------------------------------------------------------------
	
	//Object Repository :-
	
	@FindBy (xpath = "//input[@id='input-email']")
	private WebElement emailid_textbox;
	
	@FindBy (xpath = "//input[@id='input-password']")
	private WebElement password_textbox;
	
	@FindBy (xpath = "//input[@class = 'btn btn-primary']")
	private WebElement login_button;
	
//------------------------------------------------------------------------------------------------------------------------
	
	//user Actions methods:-
	
	public void EnterEmailID(String email)
	{
		
		emailid_textbox.sendKeys(email);
		
	}
	
	public void EnterPassword(String password)
	{
		
		password_textbox.sendKeys(password);
		
	}
	
	public void ClickOnLoginButton()
	{
		
		login_button.click();
		
	}
	
}
