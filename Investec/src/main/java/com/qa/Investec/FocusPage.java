package com.qa.Investec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class FocusPage extends TestBase{
	
	
	@FindBy(xpath="//p[contains(text(),'Receive Focus insights straight to your inbox')]")
	WebElement text;
	
	@FindBy(name="name")
	WebElement firstname;
	
	@FindBy(name="surname")
	WebElement surname;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(xpath="//div[contains(text(),'Myself')]")
	WebElement myselfbtn;
	
	@FindBy(xpath="//div[contains(text(),'Intermediaries')]")
	WebElement intermediatebtn;
	
	@FindBy(xpath="//div[contains(text(),'My business')]")
	WebElement Mybusinessbtn;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement Submitbtn;
	
	@FindBy(xpath="//h3[contains(text(),'Thank you')]")
	WebElement verificationtext;
	
	//WebElement signupbtn = driver.findElement(By.xpath("//button[contains(text(),' Sign up ')]"));
	
	@FindBy(xpath="//h3[contains(text(),'Thank you')]")
	WebElement successful;
	
	public FocusPage() {
		
		PageFactory.initElements(driver, this);
	
	}
	
	public Boolean verifytext() {
		return text.isDisplayed();
		
	}
	
	public void ScrollIntoView(){
		
	//using javascriptexecutor:
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	
	WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
	
	js.executeScript("arguments[0].click()", button);

	}
	
	
	public void signup(String fn,String sn,String id) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 firstname.clear();
		 firstname.sendKeys(fn);
		 surname.clear();
		 surname.sendKeys(sn);
		 email.clear();
		 email.sendKeys(id);
		 js.executeScript("arguments[0].click()",myselfbtn );
		 //myselfbtn.click();
		 js.executeScript("arguments[0].click()",Submitbtn );
		// Submitbtn.click();
		  
	}
	
	//WebElement successmessage = driver.findElement(By.xpath("//h3[contains(text(),'Thank you')]"));
	
	
}
