package com.qa.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Investec.InvestecHomePage;
import com.qa.Investec.SearchPage;
import com.qa.base.TestBase;

public class FocusPageTest extends TestBase {
	
	 InvestecHomePage  InvestecHomePage;
	 SearchPage Searchpage;
	 com.qa.Investec.FocusPage FocusPage;
	
	
	
	public FocusPageTest() {
		 
		super();
		
	}
	
@BeforeMethod
	
	public void setup() {
		
		initialization();
		 InvestecHomePage=new InvestecHomePage();
		 Searchpage= InvestecHomePage.search();
		 FocusPage=Searchpage.enteringtext();
		
	}
//@Test

public void verifytextTest() {
	
	Boolean text=FocusPage.verifytext();
	Assert.assertTrue(text);
	
	
}
//@Test
public void signup(){
	
	FocusPage.ScrollIntoView();

	
	
}

@Test
public void signupTest(){
	
	FocusPage.ScrollIntoView();	
    FocusPage.signup(prop.getProperty("firstname"),prop.getProperty("surname"),prop.getProperty("email"));
    
    String message= null;
    WebElement verificationtext=driver.findElement(By.xpath("//h3[contains(text(),'Thank you')]"));
	
	message=verificationtext.getText();
	
	if(message.equals("")) {
		
		message=verificationtext.getAttribute("innerText");
		
		if(message.equals("")) {
			
			message=verificationtext.getAttribute("textcontent");
		}
		
	}
	
	String successmessage = verificationtext.getAttribute("innerText");
	
    
    System.out.println(successmessage);
    
    Assert.assertEquals(successmessage, "Thank you");
	
	
}
@AfterMethod

public void teardown() {
	
	driver.quit();

}
}


