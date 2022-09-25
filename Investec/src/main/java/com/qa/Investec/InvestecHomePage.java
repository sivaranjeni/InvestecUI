package com.qa.Investec;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class InvestecHomePage extends TestBase{
	
	//object repository
	
	@FindBy(xpath="//div[@class='js-search-hitArea search-toggler__hitArea']")
	WebElement search;
	
	public InvestecHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public SearchPage search() {
		
		search.click();
		
		return new SearchPage();
		 
		
	}
	
	
	
	

}
