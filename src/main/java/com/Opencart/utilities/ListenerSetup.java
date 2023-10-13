package com.Opencart.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Opencart.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Test Case Exucation Started :- " +result.getName());             //result.getName() = will give us a method name
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Test Case Exucation Completed :- " +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("Test Case Exucation Failed :- " +result.getName());
		 try {
			UtilClass.takescreenshot(driver,result.getName());               //static method call = classname.methodname
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		System.out.println("Test Case Exucation Skipped :- " +result.getName());
		
	}

//------------------------------------------------------------------------------	
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	

}
