package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import com.qa.Util.TestUtil;


public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		 
		try{
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");

			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

}
	
public static void initialization() {
	
	String browsername=prop.getProperty("browser");
	
	if(browsername.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","/Users/veeraleah/Documents/chromedriver/chromedriver" );
		driver=new ChromeDriver();
		
	}else if(browsername.equals("firefox")) {
		
		System.setProperty("webdriver.chrome.driver","/Users/veeraleah/Downloads/geckodriver" );
		driver=new FirefoxDriver();
		
	}else if(browsername.equals("safari")) {
		
		System.setProperty("webdriver.chrome.driver","/Users/veeraleah/Downloads/safaridriver" );
		driver=new SafariDriver();
		
	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.impilcity_wait,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}

	
