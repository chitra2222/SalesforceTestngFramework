package TestCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utility.PropertiesUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Utility.MyTestNGListeners.class)
public class LoginModule extends BaseTestMethods{
	 

	@Test(priority=1, alwaysRun=true)
	public void TestCase1() throws InterruptedException, IOException{
		logger.info("Inside Test case1");
		extentReport.logTestinfo("Inside Test case1");
		String expected = "Please enter your password.";
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = "";
		
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, uname, "User i.d");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwd, "Password");	
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login Button");
		Thread.sleep(4000);
		WebElement errormsg = driver.findElement(By.id("error"));	
		validate(errormsg, expected,"ErrorPage");	
		getscreenshot();
	}
	@Test(priority=2, alwaysRun=true)
	public void TestCase2() throws InterruptedException, IOException{
		logger.info("Inside Test case2");
		extentReport.logTestinfo("Inside Test case2");
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		String expected = "Home";
		
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, uname, "User i.d");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwd, "Password");
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login Button");
		
		Thread.sleep(6000);
		WebElement home = driver.findElement(By.id("home_Tab"));
		validate(home, expected,"HomePage");
		//close();
		getscreenshot();


	}
	
	@Test(priority=3, alwaysRun=true)
	public void TestCase3() throws InterruptedException, IOException{
		logger.info("Inside Test case3");
		extentReport.logTestinfo("Inside Test case3");
		String expected ="chitra@tekarch.com";
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		   
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, uname,"User i.d");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwd ,"Password");
		WebElement remembercheck = driver.findElement(By.id("rememberUn"));
		clickButton(remembercheck,"Remember");
		Thread.sleep(4000);
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login");
		Thread.sleep(6000);
		
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile");
		WebElement logout = driver.findElement(By.xpath("//a[@title=\"Logout\"]"));
		clickButton(logout,"Logout");
		Thread.sleep(4000);
		WebElement username1 = driver.findElement(By.id("idcard-identity"));
		validate(username1, expected, "username");
		//close();
		getscreenshot();

	}
	@Test(priority=4, alwaysRun=true)
	public void TestCase4() throws InterruptedException, IOException{
		logger.info("Inside Test case4");
		extentReport.logTestinfo("Inside Test case4");
		String expected = "Forgot Your Password";
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		//String uname = propertyutility.getPropertyValue("login.valid.userid");
		//String pwd = propertyutility.getPropertyValue("login.valid.password");
		Thread.sleep(4000);
		WebElement forgot = driver.findElement(By.id("forgot_password_link"));
		forgot.click();
		WebElement forgotpwd = driver.findElement(By.id("header"));
		validate(forgotpwd, expected, "Forgot password" );
		//close();
		getscreenshot();

	}
	@Test(priority=5, alwaysRun=true)
	public void TestCase5() throws InterruptedException, IOException{
		logger.info("Inside Test case5");
		extentReport.logTestinfo("Inside Test case5");
		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String unameinvalid = propertyutility.getPropertyValue("login.invalid.userid");
		String pwdinvalid = propertyutility.getPropertyValue("login.invalid.password");
		
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, unameinvalid ,"User i.d");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwdinvalid ,"Password");
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login Button");
		Thread.sleep(4000);
		WebElement errormsg = driver.findElement(By.id("error"));
		validate(errormsg, expected, "Error Message" );
		Thread.sleep(4000);
		//close();
		getscreenshot();
	}
}
