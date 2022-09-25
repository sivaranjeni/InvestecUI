package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Investec.InvestecHomePage;
import com.qa.base.TestBase;

public class InvestecHomePageTest extends TestBase{
	
	InvestecHomePage InvestecHomePage;
	
	public InvestecHomePageTest() {
		
		super();
	}
	
	@BeforeMethod
	
	public void setup() {
		
		 initialization();
		 InvestecHomePage=new InvestecHomePage();
		 
	}
	
	@Test
	
	public void searchtest() {
		InvestecHomePage.search();
		
	}
	
	@AfterMethod
	
	public void teardown() {
		
		driver.quit();
	
	}
	
	
	

}
