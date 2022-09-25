# Investec Web UI Automation Steps:

1. Pull the InvestecUI Project to your eclipse IDE workspace
2. 
3. Change the below values according to your local PC Setup
4. /Investec/src/main/java/com/qa/base/TestBase.java - 
5. FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");
6. System.setProperty("webdriver.chrome.driver","/Users/veeraleah/Documents/chromedriver/chromedriver" );
7. 
8. Config Properties has got the website URL and other user information.
9. /Investec/src/main/java/com/qa/config/config.properties
10. 
11. Navigate to testng.xml inside the investec project
12. Right click on testnd.xml and select Run As -> TestNG Suite
13. 
14. Once this has been completed, kindly refresh the project and navigate to test-output folder
15. inside the test-output folder you can see the test results

KINDLY NOTE, I have excuted the script only for Google chrome, kindly make sure you have the latest chrome driver.



