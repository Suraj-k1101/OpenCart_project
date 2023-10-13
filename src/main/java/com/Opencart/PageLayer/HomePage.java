package com.Opencart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;    //global variable (compulsory step in POM class)
	
	public HomePage(WebDriver d)     // constructor of a HomePage class  (compulsory step in POM class) 
	{
		
		driver = d;
		PageFactory.initElements(driver, this);    //(compulsory step in POM class) if we use PageFactory concept
		
	}
	
//---------------------------------------------------------------------------------------------------------------
	
	//OBJECT REPOSITORY:-
	
	@FindBy (xpath ="//span[contains(text(),'My Account')]")
	private WebElement my_account_dropdowm;
	
	@FindBy (xpath = "//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	@FindBy (xpath = "//a[contains(text(),'Login')]")
	private WebElement login_link;
	
	@FindBy (xpath = "//a[contains(text(),'iPhone')]")
	private WebElement Iphone_product_link;
	
	@FindBy (xpath = "//div[@id='logo']")
	private WebElement homepage_logo;
	
	@FindBy (xpath = "//a[@id = 'wishlist-total']")
	private WebElement wishlist_link;
//-----------------------------------------------------------------------------------------------------------------
	
	//user Action Methods:-
	
	public void clickOnMyAccountDropDown()
	{
		
		my_account_dropdowm.click();
		
	}
	
	public void clickOnRegisterLink()
	{
		
		register_link.click();
		
	}
	
	public void ClickOnLoginLink()
	{
		
		login_link.click();
		
	}
	
    public void clickOnIPhoneProductLink()
    {
    	
    	Iphone_product_link.click();
    	
    }
    
    public void ClickOnHomePageLogo()
    {
    	
    	homepage_logo.click();
    	
    }
	
    public void ClickOnWishlistLink()
    {
    	
    	wishlist_link.click();
    	
    }
    
    
    
}
