package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.PropertiesUtility;

@Listeners(Utility.MyTestNGListeners.class)
public class Contacts extends BaseTestMethods1 {
	
	@Test(priority=1, alwaysRun=true)
	public void TestCase26() throws InterruptedException {
		logger.info("Inside Test case26");
		extentReport.logTestinfo("Inside Test case26");
		String expected="Salesforce - Developer Edition";
		Thread.sleep(5000);
		WebElement contacts = driver.findElement(By.xpath("//li[@id=\"Contact_Tab\"]/a[1]"));
		clickButton(contacts,"Contacts tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		Thread.sleep(4000);
		WebElement newbtn = driver.findElement(By.xpath("//input[@value=\" New \" and @class=\"btn\"]"));
		clickButton(newbtn, "New Button");
		
		Thread.sleep(4000);
		WebElement lastname = driver.findElement(By.id("name_lastcon2"));
		enterText(lastname,"Prakash", "Last name field");
		String basehandle = driver.getWindowHandle();
		WebElement lookup = driver.findElement(By.xpath("//a[@id=\"con4_lkwgt\"]/img[@class=\"lookupIcon\"]"));
		clickButton(lookup, "Accountname button");
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!basehandle.equals(handle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(4000);
		WebElement frame1 = driver.findElement(By.xpath("//frame[@id=\"resultsFrame\"]"));
		driver.switchTo().frame(frame1);
		WebElement acctname = driver.findElement(By.xpath("//tr[@class=\"dataRow even first\"]//a[1]"));
		clickButton(acctname, "Account name");
		Thread.sleep(4000);
		driver.switchTo().window(basehandle);
		WebElement savebtn = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[1]"));
		clickButton(savebtn,"Save button");
		validateTitle(expected);
		//close();
		getscreenshot();

	}
	@Test(priority=2, alwaysRun=true)
	public void TestCase27() throws InterruptedException {
		logger.info("Inside Test case27");
		extentReport.logTestinfo("Inside Test case27");
		String actualviewname = "Rishiprak";
		String expected = "Contacts ~ Salesforce - Developer Edition";
		Thread.sleep(5000);
		WebElement contacts = driver.findElement(By.xpath("//li[@id=\"Contact_Tab\"]/a[1]"));
		clickButton(contacts,"Contacts tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		
		Thread.sleep(4000);
		WebElement createnewview = driver.findElement(By.xpath("//form[@id=\"filter_element\"]//a[text()=\"Create New View\"]"));
		clickButton(createnewview,"Create new view");
		Thread.sleep(4000);
		WebElement name = driver.findElement(By.id("fname"));
		enterText(name, actualviewname, "View name");
		WebElement uniquename = driver.findElement(By.id("devname"));
		enterText(uniquename,"Rishiprak_view", "Unique View name");
		WebElement save = driver.findElement(By.xpath("//div[@class=\"pbHeader\"]//input[@value=\" Save \"]"));
		clickButton(save, "Save Button");
		Thread.sleep(4000);
		validateTitle(expected);
		//close();
		getscreenshot();

	}
	@Test(priority=3, alwaysRun=true)
	public void TestCase28() throws InterruptedException {
		logger.info("Inside Test case28");
		extentReport.logTestinfo("Inside Test case28");
		String expected = "Recent Contacts";
		Thread.sleep(4000);
		
		WebElement contacts = driver.findElement(By.xpath("//li[@id=\"Contact_Tab\"]/a[1]"));
		clickButton(contacts,"Contacts tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		
		Thread.sleep(4000);
		WebElement recentdropdown = driver.findElement(By.id("hotlist_mode")) ;
		selectDropDown(recentdropdown,"Recently Created");
		
		Thread.sleep(4000);
		WebElement contactPage = driver.findElement(By.xpath("//h3[text()=\"Recent Contacts\"]"));
		validate(contactPage, expected, "Recent list");
		//close();
		getscreenshot();

	}
	@Test(priority=4, alwaysRun=true)
	public void TestCase29() throws InterruptedException {
		logger.info("Inside Test case29");
		extentReport.logTestinfo("Inside Test case29");
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
		Thread.sleep(4000);
		
		WebElement contacts = driver.findElement(By.xpath("//li[@id=\"Contact_Tab\"]/a[1]"));
		clickButton(contacts,"Contacts tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		Thread.sleep(4000);
		WebElement contactsDropDown = driver.findElement(By.xpath("//span[@class=\"fBody\"]/select[@id=\"fcf\"]"));
		selectDropDown(contactsDropDown, "My Contacts");
		Thread.sleep(4000);
        if(contactsDropDown.isDisplayed()) {
        	logger.info("Test case passed");
        }else {
        	logger.error("Test case failed");
        }
		//close();
		getscreenshot();

	}
	@Test(priority=5, alwaysRun=true)
	public void TestCase30() throws InterruptedException {
		logger.info("Inside Test case30");
		extentReport.logTestinfo("Inside Test case30");
		String expected = "Contact: Prakash ~ Salesforce - Developer Edition";
		Thread.sleep(4000);
		
		WebElement contacts = driver.findElement(By.xpath("//li[@id=\"Contact_Tab\"]/a[1]"));
		clickButton(contacts,"Contacts tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		
		Thread.sleep(4000);
		WebElement contactname = driver.findElement(By.xpath("//a[contains(text(),'Prakash')]"));
		clickButton(contactname, "Cantact name");
		Thread.sleep(4000);
		validateTitle(expected);
		getscreenshot();

	}
	@Test(priority=6, alwaysRun=true)
	public void TestCase31() throws InterruptedException {
		logger.info("Inside Test case31");
		extentReport.logTestinfo("Inside Test case31");
		String expected =  "You must enter a value";
		Thread.sleep(4000);
		WebElement contacts = driver.findElement(By.xpath("//li[@id=\"Contact_Tab\"]/a[1]"));
		clickButton(contacts,"Contacts tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		
		Thread.sleep(4000);
		WebElement createnewview = driver.findElement(By.xpath("//form[@id=\"filter_element\"]//a[text()=\"Create New View\"]"));
		clickButton(createnewview,"Create new view");
		
		Thread.sleep(4000);
		WebElement uniquename = driver.findElement(By.id("devname"));
		enterText(uniquename,"EFGH", "Unique View name");
		WebElement save = driver.findElement(By.xpath("//div[@class=\"pbHeader\"]//input[@value=\" Save \"]"));
		clickButton(save, "Save Button");
		Thread.sleep(4000);
		WebElement errmsg = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]"));
		validate(errmsg, expected, "Error message");
		//close();
	}
	@Test(priority=7, alwaysRun=true)
	public void TestCase32() throws InterruptedException {
		logger.info("Inside Test case32");
		String expected = "Contacts: Home ~ Salesforce - Developer Edition";
		Thread.sleep(4000);
		
		WebElement contacts = driver.findElement(By.xpath("//li[@id=\"Contact_Tab\"]/a[1]"));
		clickButton(contacts,"Contacts tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		
		Thread.sleep(4000);
		WebElement createnewview = driver.findElement(By.xpath("//form[@id=\"filter_element\"]//a[text()=\"Create New View\"]"));
		clickButton(createnewview,"Create new view");
		
		Thread.sleep(4000);
		WebElement name = driver.findElement(By.id("fname"));
		enterText(name, "Dhanama", "View name");
		WebElement uniquename = driver.findElement(By.id("devname"));
		enterText(uniquename,"Rishi_view", "Unique View name");
		Thread.sleep(4000);
		WebElement cancel = driver.findElement(By.xpath("//div[@class=\"pbHeader\"]//input[@value=\"Cancel\"]"));
		clickButton(cancel,"Cancel Button");
		Thread.sleep(4000);
		validateTitle(expected);
		//close();
	}
	@Test(priority=8, alwaysRun=true)
	public void TestCase33() throws InterruptedException {
		logger.info("Inside Test case33");
		String expected="Contact Edit: New Contact ~ Salesforce - Developer Edition";
		Thread.sleep(4000);
		
		WebElement contacts = driver.findElement(By.xpath("//li[@id=\"Contact_Tab\"]/a[1]"));
		clickButton(contacts,"Contacts tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		
		Thread.sleep(4000);
		WebElement newbtn = driver.findElement(By.xpath("//input[@value=\" New \" and @class=\"btn\"]"));
		clickButton(newbtn, "New Button");
		Thread.sleep(4000);
		WebElement lastname = driver.findElement(By.id("name_lastcon2"));
		enterText(lastname,"JayaPrakash", "Last name field");
		String basehandle = driver.getWindowHandle();
		WebElement lookup = driver.findElement(By.xpath("//a[@id=\"con4_lkwgt\"]/img[@class=\"lookupIcon\"]"));
		clickButton(lookup, "Accountname button");
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!basehandle.equals(handle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(4000);
		WebElement frame1 = driver.findElement(By.xpath("//frame[@id=\"resultsFrame\"]"));
		driver.switchTo().frame(frame1);

		WebElement acctname = driver.findElement(By.xpath("//tr[@class=\"dataRow even first\"]//a[1]"));
		clickButton(acctname, "Account name");
		Thread.sleep(4000);
		driver.switchTo().window(basehandle);
		WebElement savenew = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[2][@value=\"Save & New\"]"));
		clickButton(savenew,"Save and new");
		Thread.sleep(4000);
		validateTitle(expected);
		//close();
		getscreenshot();

	}
}
