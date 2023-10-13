package com.Opencart.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class UtilClass {    //Selenium  related repetitive common code methods we will write here in UtilClass

	private WebDriver driver;   //global variable
	
	public  UtilClass(WebDriver d)        //constructor of UtilClass
	{
		
		driver = d;
		PageFactory.initElements(driver, this);
		
	}
	
//---------------------------------------------------------------	
	
	public String getPageTitle()
	{
		
		String title = driver.getTitle();
		
		return title;
		
	}
	
//-----------------------------------------------------------------------------------------------
	
	
	//create special method for Screenshot 
	
	public static void takescreenshot(WebDriver d,String filename ) throws IOException               //d = driver
	{
		TakesScreenshot ts = (TakesScreenshot)d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ks\\eclipse-workspace\\05MarchOpencart\\Screenshots" + filename + ".png");
		FileHandler.copy(source, dest);
		
		
		
		
	}
	
		
		
	
	
	
	
}
