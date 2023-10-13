package com.Opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Opencart.PageLayer.HomePage;
import com.Opencart.PageLayer.LoginPage;
import com.Opencart.PageLayer.ProductPage;
import com.Opencart.PageLayer.WishListPage;
import com.Opencart.testBase.TestBase;

public class WishlistTest extends TestBase {

	
	@Test
	public void validateAddingProductToWishlistPage() throws InterruptedException
	{
	
		//create object of HomePage (for calling HomePage class method's here):-
		
		HomePage homepage_obj = new HomePage(driver);
		LoginPage loginpage_obj = new LoginPage(driver);
		ProductPage productpage_obj = new ProductPage(driver);
		WishListPage wishlist_obj = new WishListPage(driver);
		
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.ClickOnLoginLink();
		loginpage_obj.EnterEmailID("Tyson@gmail.com");
		loginpage_obj.EnterPassword("Tyson@1234");
		loginpage_obj.ClickOnLoginButton();
		homepage_obj.ClickOnHomePageLogo();
		homepage_obj.clickOnIPhoneProductLink();
		productpage_obj.clickOnWishlistIcon();
		 homepage_obj.ClickOnWishlistLink();
		
		Assert.assertEquals(wishlist_obj.getProductName(), "iPhone");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
