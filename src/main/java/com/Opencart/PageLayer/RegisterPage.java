package com.Opencart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage  {

	private WebDriver driver;    //global variable
	
	public RegisterPage(WebDriver d)
	{
		
		driver = d;
		PageFactory.initElements(driver, this);
		
	}
	
//--------------------------------------------------------------------------------------------------------------
	
	//OBJECT REPOSITORY:-
	
	@FindBy (xpath = "//input[@id='input-firstname']")
	private WebElement firstname_textbox; 
	
	@FindBy (xpath = "//input[@id='input-lastname']")
	private WebElement lastname_textbox;
	
	@FindBy (xpath = "//input[@id='input-email']")
	private WebElement email_textbox;
	
	@FindBy (xpath = "//input[@id='input-telephone']")
	private WebElement telephone_textbox;
	
	@FindBy (xpath = "//input[@id='input-password']")
	private WebElement password_textbox;
	
	@FindBy (xpath = "//input[@id='input-confirm']")
	private WebElement password_confirm_textbox;
	
	@FindBy (xpath = "//input[@name = 'agree']")
	private WebElement privacy_policy_checkbox;
	
	@FindBy (xpath = "//input[@class = 'btn btn-primary']")
	private WebElement continue_button;
	
//-----------------------------------------------------------------------------------------------------------------------------	
	
	//user Actions methods :-
	
	public void EnterFirstName(String firstname)
	{
		
		firstname_textbox.sendKeys(firstname);
			
	}
	
	public void EnterLastName(String lastname)
	{
		
		lastname_textbox.sendKeys(lastname);
		
	}
	
	public void EnterEmailID(String email)
	{
		
		email_textbox.sendKeys(email);
		
	}
	
	public void EnterTelephoneNumber(String telephone)
	{
		
		telephone_textbox.sendKeys(telephone);
		
	}
	
	public void EnterPassword(String password)
	{
		
		password_textbox.sendKeys(password);
		
	}
	
	public void EnterConfirmPassword(String confirm_password)
	{
		
		password_confirm_textbox.sendKeys(confirm_password);
		
	}
	
	public void ClickOnPrivacyPolicy()
	{
		
		privacy_policy_checkbox.click();
		
	}
	
	public void ClickOnContinueButton()
	{
		
		continue_button.click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
