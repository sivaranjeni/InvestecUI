package com.qa.Investec;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SearchPage extends TestBase{
	
	@FindBy(id="searchBarInput")
	WebElement searchbar;
	
	@FindBy(xpath="//button[@class='cta-primary search__button']")
	WebElement searchbutton;
	
	public SearchPage() {
		
		PageFactory.initElements(driver, this);
	}

public FocusPage enteringtext() {
	
	searchbar.sendKeys("cash investment rates");
    searchbutton.click();
    driver.navigate().to("https://www.investec.com/en_za/focus/money/understanding-interest-rates.html");
    
    return new FocusPage();
    
    
    }


	
}
    	
 
