package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Investec.InvestecHomePage;
import com.qa.Investec.SearchPage;
import com.qa.base.TestBase;

public class SearchPageTest extends TestBase{
	
	 InvestecHomePage  InvestecHomePage;
	 SearchPage Searchpage;
	 
	
	public SearchPageTest() {
		
		super();
		
	}
	@BeforeMethod
	
	public void setup() {
		
		initialization();
		 InvestecHomePage=new InvestecHomePage();
		 Searchpage= InvestecHomePage.search();
		
	}
	
	@Test
	
	public void enteringtextTest() {
		Searchpage.enteringtext();
		
		}
	
	@AfterMethod

	public void teardown() {
		
		driver.quit();

	}
	}
	
	


