package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.PropertiesUtility;

@Listeners(Utility.MyTestNGListeners.class)
public class Leads extends BaseTestMethods1 {
	@Test(priority = 1, alwaysRun = true)
	public void TestCase21() throws InterruptedException {
		logger.info("Inside Test case21");
		extentReport.logTestinfo("Inside Test case21");
		String expected = "Leads: Home ~ Salesforce - Developer Edition";
		Thread.sleep(4000);
		WebElement leads = driver.findElement(By.xpath("//li[@id=\"Lead_Tab\"]/a[1]"));
		clickButton(leads, "Leads tab ");
		WebElement lightningalert = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightningalert, "Lightning alert close");
		Thread.sleep(4000);
		validateTitle(expected);
		getscreenshot();

	}
	@Test(priority = 2, alwaysRun = true)
	public void TestCase22() throws InterruptedException {
		logger.info("Inside Test case22");
		extentReport.logTestinfo("Inside Test case22");
		String expallOpen = "All Open Leads";
		String expunread = "My Unread Leads";
		String exprecentView = "Recently Viewed Leads";
		String exptoday = "Today's Leads";

		Thread.sleep(4000);
		WebElement leads = driver.findElement(By.xpath("//li[@id=\"Lead_Tab\"]/a[1]"));
		clickButton(leads, "Leads tab ");
		WebElement lightningalert = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightningalert, "Lightning alert close");
		Thread.sleep(4000);
		WebElement leadsdropdown = driver.findElement(By.id("fcf"));
		clickButton(leadsdropdown, "Leads Drop Down");
		WebElement allOpen = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[1]"));
		WebElement unread = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[2]"));
		WebElement recentView = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[3]"));
		WebElement today = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[4]"));
		Thread.sleep(4000);
		
		if(allOpen.getText().equals(expallOpen) && unread.getText().equals(expunread) 
				&& recentView.getText().equals(exprecentView) && today.getText().equals(exptoday)) {
			logger.info("Test case Passed");
		}
		else {
			logger.error("Test case failed");
		}
		getscreenshot();

	}
	@Test(priority = 3, alwaysRun = true)
	public void TestCase23() throws InterruptedException {
		logger.info("Inside Test case23");
		extentReport.logTestinfo("Inside Test case23");
		String expected = "Leads ~ Salesforce - Developer Edition";
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		getBrowser(url);
		
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, uname,"User i.d");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwd ,"Password");
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login");	
		Thread.sleep(5000);
		
		WebElement leads = driver.findElement(By.xpath("//li[@id=\"Lead_Tab\"]/a[1]"));
		clickButton(leads, "Leads tab ");
		WebElement lightningalert = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightningalert, "Lightning alert close");
		Thread.sleep(4000);
		
		WebElement leadsdropdown = driver.findElement(By.id("fcf"));
		selectDropDown(leadsdropdown, "My Unread Leads");
		Thread.sleep(5000);
		WebElement go = driver.findElement(By.xpath("//input[@class=\"btn\" and  @value=\" Go! \"]"));
		go.click();
		
		Thread.sleep(4000);
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile");
		WebElement logout = driver.findElement(By.xpath("//a[@title=\"Logout\"]"));
		clickButton(logout,"Logout");
		Thread.sleep(4000);
		
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1, uname,"User i.d");
		WebElement password1 = driver.findElement(By.id("password"));
		enterText(password1, pwd ,"Password");
		WebElement login1 = driver.findElement(By.id("Login"));
		clickButton(login1,"Login");
		Thread.sleep(4000);
		WebElement leads1 = driver.findElement(By.xpath("//li[@id=\"Lead_Tab\"]/a[1]"));
		clickButton(leads1, "Leads tab ");
		//WebElement lightningalert1 = driver.findElement(By.id("tryLexDialogX"));
		//clickButton(lightningalert1, "Lightning alert close");;
		Thread.sleep(4000);
		WebElement go1 = driver.findElement(By.xpath("//input[@class=\"btn\" and  @value=\" Go! \"]"));
		go1.click();
		Thread.sleep(4000);
		validateTitle(expected);
		getscreenshot();
	}
	@Test(priority = 4, alwaysRun = true)
	public void TestCase24() throws InterruptedException {
		logger.info("Inside Test case24");
		extentReport.logTestinfo("Inside Test case24");
		String expected = "Leads ~ Salesforce - Developer Edition";
		Thread.sleep(5000);
		
		WebElement leads = driver.findElement(By.xpath("//li[@id=\"Lead_Tab\"]/a[1]"));
		clickButton(leads, "Leads tab ");
		WebElement lightningalert = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightningalert, "Lightning alert close");
		Thread.sleep(4000);
		
		WebElement leadsdropdown = driver.findElement(By.id("fcf"));
		selectDropDown(leadsdropdown, "Today's Leads");
		Thread.sleep(5000);
		WebElement go = driver.findElement(By.xpath("//input[@class=\"btn\" and  @value=\" Go! \"]"));
		go.click();
		Thread.sleep(4000);
		validateTitle(expected);
		getscreenshot();
	}
	@Test(priority = 5, alwaysRun = true)
	public void TestCase25() throws InterruptedException {
		logger.info("Inside Test case25");
		extentReport.logTestinfo("Inside Test case25");
		String expected="ABCD";
		Thread.sleep(4000);
		
		WebElement leads = driver.findElement(By.xpath("//li[@id=\"Lead_Tab\"]/a[1]"));
		clickButton(leads, "Leads tab ");
		WebElement lightningalert = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightningalert, "Lightning alert close");
		Thread.sleep(4000);
		
		WebElement newbtn = driver.findElement(By.xpath("//input[@value=\" New \"]"));
		clickButton(newbtn, "New Button");
		Thread.sleep(4000);
		WebElement lastName = driver.findElement(By.id("name_lastlea2"));
		enterText(lastName,"ABCD","Last name");
		WebElement companyName = driver.findElement(By.id("lea3"));
		enterText(companyName, "ABCD", "Company name");
		Thread.sleep(4000);
		
		WebElement savebtn = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[1]"));
		clickButton(savebtn, "Save Button");
		Thread.sleep(4000);
		validateTitle(expected);
		getscreenshot();
	}

}
