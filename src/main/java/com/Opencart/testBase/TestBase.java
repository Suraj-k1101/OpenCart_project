package com.Opencart.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Opencart.utilities.UtilClass;

public class TestBase {
     
	public static WebDriver driver;    //global variable
	public UtilClass util_obj;
	
	
	@BeforeMethod
	public void SetUp()
	{
		
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("Chrome"))           //BY USING equalsIgnoreCase METHOS WE CAN IGNORE CASE SENSITIVTY HERE
		{
			
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			
			driver = new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			
			driver = new EdgeDriver();
			
		}
		else
		{
			
			System.out.println("Please provide browser name from Chrome,Firefox,Edge");
			
		}
		
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    util_obj = new UtilClass(driver);
		
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		
		//driver.quit();
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
