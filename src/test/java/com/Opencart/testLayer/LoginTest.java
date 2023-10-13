package com.Opencart.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Opencart.PageLayer.HomePage;
import com.Opencart.PageLayer.LoginPage;
import com.Opencart.testBase.TestBase;
import com.Opencart.utilities.ExcelHandling;
import com.Opencart.utilities.UtilClass;

public class LoginTest extends TestBase {  //we inherit TestBase class for getting all properties of it here in this class

	@Test
	public void ValidateLoggingIntoApplicationUsingValidCredentials() throws IOException
	{
		
		String expected = "My Account";
		
		//create object of HomePage (for calling HomePage class method's here):-
		
		ExcelHandling excel_data = new ExcelHandling();
		
		HomePage homepage_obj = new HomePage(driver);
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.ClickOnLoginLink();
		
		
		//create object of LoginPage class (for calling HomePage class method's here):-
		LoginPage login_obj = new LoginPage(driver);
		login_obj.EnterEmailID(excel_data.readData(6, 1, 0));
		login_obj.EnterPassword(excel_data.readData(6, 1, 1));
		login_obj.ClickOnLoginButton();
		
		
		//create object of UtilClass :-
		UtilClass util_obj = new UtilClass(driver);
		                                               
		Assert.assertEquals(util_obj.getPageTitle(), expected);
		
		
		//here we comparing actual result and expected result
		//actual result we  will find it by  driver.getTitle method because we want title text 
		//and we will compare that driver.Title with String expected = ""My Account" which we declared
	}
	
	
	
		@Test
		public void ValidateLoggingIntoApplicationUsingInValidCredentials()
		{
			

			String expected = "Account Login";
			
			//create object of HomePage (for calling HomePage class method's here):-
			
			HomePage homepage_obj = new HomePage(driver);
			homepage_obj.clickOnMyAccountDropDown();
			homepage_obj.ClickOnLoginLink();
			
			
			//create object of LoginPage class (for calling HomePage class method's here):-
			LoginPage login_obj = new LoginPage(driver);
			login_obj.EnterEmailID("Tyson@gmail.com");
			login_obj.EnterPassword("Tyson@12345");
			login_obj.ClickOnLoginButton();
			
			
			//create object of UtilClass :-
			UtilClass util_obj = new UtilClass(driver);
			
			
			Assert.assertEquals(util_obj.getPageTitle(), expected);
			
			
			
			
			
			
			
			                                               
			
			
			//here we comparing actual result and expected result
			//actual result we  will find it by  driver.getTitle method because we want title text 
			//and we will compare that driver.Title with String expected = ""My Account" which we declared
			
			
		}
		
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

