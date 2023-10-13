package com.Opencart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	private WebDriver driver;
	
	public WishListPage(WebDriver d)
	{
		
		driver = d;
		PageFactory.initElements(driver,this);
		
	}
	
//--------------------------------Object Repository--------------------------------------------------------------------------
	
	@FindBy (xpath = "//div[@id = 'content']/div/table/tbody/tr[1]/td[2]")
	private WebElement product_name;
	
//------------------------------Action Methods-------------------------------------------------------------------
	
	public String getProductName()
	{
		
		String productname = product_name.getText();
		
		return productname;
		
	}
	

}
