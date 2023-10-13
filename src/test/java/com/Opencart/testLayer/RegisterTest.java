package com.Opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Opencart.PageLayer.HomePage;
import com.Opencart.PageLayer.RegisterPage;
import com.Opencart.testBase.TestBase;
import com.Opencart.utilities.UtilClass;

public class RegisterTest extends TestBase {  //we inherit TestBase class for getting all properties of it here in this class
	
	
	@Test
	public void ValidateRegisteringAccountByProvidingOnlyMandatoryFields()
	{
		
		String expected = "Your Account Has Been Created!";
		
		//create object of HomePage (for calling HomePage class method's here):-
		
		HomePage homepage_obj = new HomePage(driver);
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.clickOnRegisterLink();
		

	
		//create object of RegisterPage class (for calling HomePage class method's here):-
		RegisterPage register_obj = new RegisterPage(driver);
		register_obj.EnterFirstName("Tyson");
		register_obj.EnterLastName("Ballou");
		register_obj.EnterEmailID("Tyson@gmail.com");
		register_obj.EnterTelephoneNumber("9876452312");
		register_obj.EnterPassword("Tyson@1234");
		register_obj.EnterConfirmPassword("Tyson@1234");
		register_obj.ClickOnPrivacyPolicy();
		register_obj.ClickOnContinueButton();
		
       //create object of UtilClass:-
		UtilClass util_obj = new UtilClass(driver);
		
		Assert.assertEquals(util_obj.getPageTitle(), expected);
		Assert.assertEquals(driver.getTitle(), expected);  //here we comparing actual result and expected result
		
		//actual result we  will find it by  driver.getTitle method because we want title text 
		//and we will compare that driver.Title with String expected = "Your Account Has Been Created!" which we declared
		
		
		
	}
	
	
	
	
	
	

}
